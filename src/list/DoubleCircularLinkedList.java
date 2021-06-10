package list;

public class DoubleCircularLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleNode getHead () {
        return head;
    }

    public void setHead (DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail () {
        return tail;
    }

    public void setTail (DoubleNode tail) {
        this.tail = tail;
    }

    public int getSize () {
        return size;
    }

    public void setSize (int size) {
        this.size = size;
    }

    public DoubleNode createDoubleCirLinkedList(int nodeValue){
//        head = new Node();
        DoubleNode n = new DoubleNode();
        n.setValue(nodeValue);
        n.setNext(n);
        n.setPrev(n);
        head = n;
        tail = n;
        size = 1;
        return head;
    }

    public void insertInDoubleCirLinkedList(int nodeValue, int loc){
        DoubleNode n = new DoubleNode();
        n.setValue(nodeValue);
        if(!nodeExists()){
            System.out.println("node does not exist");
        }
        if(loc == 0){
            n.setNext(head);
            n.setPrev(tail);
            head.setPrev(n);
            tail.setPrev(n);
            head = n;
        }
        if(loc >=size){
            n.setNext(head);
            head.setPrev(n);
            tail.setNext(n);//what ever earlier node was, setting the reference to new node
            n.setPrev(tail);
            tail = n;
        }
        else {

            DoubleNode tempNode = head;
            int index = 0;
            while(index < loc -1){
                tempNode = tempNode.getNext();
                index++;
            }
            DoubleNode nextNode = tempNode.getNext();

            n.setPrev(tempNode);
            tempNode.setNext(n);
            n.setNext(nextNode);
            n.getNext().setPrev(n);
        }
        setSize(getSize()+1);
    }

    public boolean nodeExists(){
        return head != null;
    }

    public void traverseLinkedList()
    {

        if(nodeExists()){
            DoubleNode n = head;
            for(int i=0; i< size;i++){
                System.out.println(n.getValue()+"->");
                n = n.getNext();
            }

        }
        else System.out.println("linked list does not exist");

    }

    public void traverseLinkedListInOpposite()
    {

        if(nodeExists()){
            DoubleNode n = head;
            for(int i=size; i> 0;i--){
                System.out.println(n.getValue()+"->");
                n = n.getPrev();
            }

        }
        else System.out.println("linked list does not exist");

    }

    // Traverse Linked List
    void printHeadUsingTail() {
        if (nodeExists()) {
            System.out.println("\n\nPrinting Tail...");
            System.out.println(tail.getValue());

            System.out.println("\nPrinting Head using Head reference...");
            System.out.println(head.getValue());

            System.out.println("\nPrinting Head using Tail reference...");
            System.out.println(tail.getNext().getValue());

        } else {
            System.out.println("Linked List does not exists");
        }
    }

    //Deletion of linked list
    void deleteLinkedList() {
        System.out.println("\n\nDeleting Linked List...");
        if (tail == null) {
            System.out.println("Linked List is already deleted, nothing to delete anymore !");
            return;
        }else {
            head.setPrev(null);
            tail.setNext(null);
            head = null;
            tail = null;
            System.out.println("Linked List deleted successfully !");
        }
    }//end of method


    //Searches a node with given value
    boolean searchNode(int nodeValue) {
        if (nodeExists()) {
            DoubleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.print("Found the node at location: "+i+"\n");
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.print("Node not found!! \n");
        return false;
    }
    public void deleteNodeFromSpecificLoc(int loc){
        if(!nodeExists()) {
            System.out.println("node does not exist");
        }
        else if (loc == 0) { // we want to delete first element
            if (getSize() == 1) { // if this is the only node in this list
                head.setNext(null);
                head.setPrev(null);
                head = tail = null;
                setSize(getSize() - 1);
                return;
            } else {
                head = head.getNext();
                head.setPrev(null);
                tail.setPrev(head);
                setSize(getSize() - 1);
            }
        }
        else if(loc >=getSize()) {
            if (getSize() == 1) { // if this is the only element in the list
                head.setNext(null);
                head.setPrev(null);
                tail = head = null;
                setSize(getSize() - 1);
                return;
            }
            tail = tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
            setSize(getSize() - 1);
        }
        else {
            DoubleNode tempNode = head;
            for(int i=0;i<loc-1;i++){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            tempNode.getNext().getNext().setPrev(tempNode);
            setSize(getSize()-1);
        }

    }

}
