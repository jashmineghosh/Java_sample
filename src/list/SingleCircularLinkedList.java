package list;

public class SingleCircularLinkedList {
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

    public DoubleNode createSingleCircularLinkedList(int nodeValue){
//        head = new list.DoubleNode();
        DoubleNode n = new DoubleNode();
        n.setValue(nodeValue);
        n.setNext(n);
        head = n;
        tail = n;
        size = 1;
        return head;
    }

    public void insertInSingleCircularLinkedList(int nodeValue, int loc){
        DoubleNode n = new DoubleNode();
        n.setValue(nodeValue);
        if(!nodeExists()){
            System.out.println("node does not exist");
        }
        if(loc == 0){
            n.setNext(head);
            head = n;
            tail.setNext(n);
        }
        if(loc >=size){
            n.setNext(head);
            tail.setNext(n);//what ever earlier node was, setting the reference to new node
            tail = n;
//            tail.setNext(head);
        }
        else {

            DoubleNode tempNode = head;
            int index = 0;
            while(index < loc -1){
                tempNode = tempNode.getNext();
                index++;
            }
            DoubleNode nextNode = tempNode.getNext();
            tempNode.setNext(n);
            n.setNext(nextNode);

        }
        setSize(getSize()+1);
    }

    public boolean nodeExists(){
        return head != null;
    }

    public void traverseCircularLinkedList()
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

    // Traverse Linked List using tail reference
    void printHeadUsingTail() {
        if (nodeExists()) {
            System.out.println("Printing Tail...");
            System.out.println(tail.getValue());

            System.out.println("Printing Head using Head reference...");
            System.out.println(head.getValue());

            System.out.println("Printing Head using Tail reference...");
            System.out.println(tail.getNext().getValue());

        }else{
            System.out.println("Linked List does not exists");
        }
    }
    //Deletes entire Linked List
    void deleteLinkedListCircular() {
        System.out.println("\n\nDeleting Linked List...");
        head = null;
        if(tail == null) {
            System.out.println("Linked List is already deleted, nothing to delete !");
            return;
        }else {
            tail.setNext(null);
            tail = null;
            System.out.println("Linked List deleted successfully !");
        }
    }

    //Searches a node with given value
    boolean searchNodeCircular(int nodeValue) {
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
        System.out.print("list.DoubleNode not found!! \n");
        return false;
    }
    public void deleteNodeFromSpecificLocCircular(int loc){
        if(!nodeExists()) {
            System.out.println("node does not exist");
        }
        else if(loc == 0){
            head = head.getNext();
            tail.setNext(head);
            setSize(getSize()-1);
            if(getSize()==0){
                tail = null;
            }}
        else if(loc >=getSize()){
            DoubleNode tempNode = head;
            for(int i=0;i<size-1;i++){
                tempNode = tempNode.getNext();

            }
            if (tempNode == head) { //if this is the only element in the list
                tail = head = null;
                setSize(getSize()-1);
                return;
            }
            tempNode.setNext(head);
            tail = tempNode;
            setSize(getSize()-1);
        }
        else {
            DoubleNode tempNode = head;
            for(int i=0;i<loc-1;i++){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }



    }

}
