package list;

public class SingleLInkedList<B> {
    private SingleNode head;
    private SingleNode tail;
    private int size;

    public SingleNode getHead () {
        return head;
    }

    public void setHead (SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail () {
        return tail;
    }

    public void setTail (SingleNode tail) {
        this.tail = tail;
    }

    public int getSize () {
        return size;
    }

    public void setSize (int size) {
        this.size = size;
    }

    public SingleNode createSingleLinkedList(int nodeValue){
//        head = new list.SingleNode();
        SingleNode n = new SingleNode();
        n.setValue(nodeValue);
        n.setNext(null);
        head = n;
        tail = n;
        size = 1;
        return head;
    }

public void insertInSingleLinkedList(int nodeValue, int loc){
    SingleNode n = new SingleNode();
    n.setValue(nodeValue);
    if(!nodeExists()){
        System.out.println("node does not exist");
    }
       if(loc == 0){
           n.setNext(head);
           head = n;
       }
        if(loc >=size){
            n.setNext(null);
            tail.setNext(n);//what ever earlier node was, setting the reference to new node
            tail = n;
        }
       else {

       SingleNode tempNode = head;
        int index = 0;
        while(index < loc -1){
            tempNode = tempNode.getNext();
            index++;
        }
        SingleNode nextNode = tempNode.getNext();
        tempNode.setNext(n);
        n.setNext(nextNode);

        }
        setSize(getSize()+1);
}

public boolean nodeExists(){
        return head != null;
}

public void traverseLinkedList()
{

    if(nodeExists()){
        SingleNode n = head;
        for(int i=0; i< size;i++){
            System.out.println(n.getValue()+"->");
            n = n.getNext();
        }

    }
    else System.out.println("linked list does not exist");

}

    //Deletes entire Linked List
    void deleteLinkedList() {
        System.out.println("\n\nDeleting Linked List...");
        head = null;
        tail = null;
        System.out.println("Linked List deleted successfully !");
    }

    //Searches a node with given value
    boolean searchNode(int nodeValue) {
        if (nodeExists()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.print("Found the node at location: "+i+"\n");
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.print("list.SingleNode not found!! \n");
        return false;
    }
    public void deleteNodeFromSpecificLoc(int loc){
        if(!nodeExists()) {
            System.out.println("node does not exist");
        }
            else if(loc == 0){
                head = head.getNext();
                setSize(getSize()-1);
                if(getSize()==0){
                    tail = null;
                }}
               else if(loc >=getSize()){
                    SingleNode tempNode = head;
                    for(int i=0;i<size-1;i++){
                        tempNode = tempNode.getNext();

                       }
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
                    SingleNode tempNode = head;
                    for(int i=0;i<loc-1;i++){
                        tempNode = tempNode.getNext();
                    }
                tempNode.setNext(tempNode.getNext().getNext());
                setSize(getSize()-1);
                }



    }
}
