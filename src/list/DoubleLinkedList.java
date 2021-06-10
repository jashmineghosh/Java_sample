package list;

public class DoubleLinkedList {

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

    public DoubleNode createDoubleLinkedList(int nodeValue){
//        head = new Node();
        DoubleNode n = new DoubleNode();
        n.setValue(nodeValue);
        n.setNext(null);
        n.setPrev(null);
        head = n;
        tail = n;
        size = 1;
        return head;
    }

    public void insertInDoubleLinkedList(int nodeValue, int loc){
        DoubleNode n = new DoubleNode();
        n.setValue(nodeValue);
        if(!nodeExists()){
            System.out.println("node does not exist");
        }
        if(loc == 0){
            n.setNext(head);
            n.setPrev(null);
            head.setPrev(n);
            head = n;
        }
        if(loc >=size){
            n.setNext(null);
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
    //delete whole linked list
    void deleteLinkedList() {
        System.out.println("\n\nDeleting Linked List...");
        DoubleNode tempNode = head;
        for (int i = 0; i < size; i++) { //looping to cover deadlock case of node 1 pointed by node 2 and node 2 pointed by node 1
            tempNode.setPrev(null);
            tempNode = tempNode.getNext();
        }

        head = null;
        tail = null;
        System.out.println("Linked List deleted successfully !");
    }


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
        else if(loc == 0){
            head = head.getNext();
            head.setPrev(null);
            setSize(getSize()-1);
            if(getSize()==0){
                head = tail = null;
            }}
        else if(loc >=getSize()){
            DoubleNode tempNode = tail.getPrev();

            if (tempNode == head) { //if this is the only element in the list
                tail = head = null;
                setSize(getSize()-1);
                return;
            }
            tempNode.setNext(null);

            tail = tempNode;
            setSize(getSize()-1);
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
