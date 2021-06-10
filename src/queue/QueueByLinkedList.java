package queue;

import list.SingleLInkedList;

public class QueueByLinkedList<B> {
    SingleLInkedList<B> list;
public  QueueByLinkedList(){
    list = new SingleLInkedList<B>();
}

public void enQueue(int value){
    if(list.getHead()==null){
        list.createSingleLinkedList(value);
            }
    list.insertInSingleLinkedList(value, list.getSize());
}

public int deQueue(){
   int value = -1;
    if(isEmpty()){
        System.out.println("under flow error");
    }
    value = list.getHead().getValue();
    list.deleteNodeFromSpecificLoc(0);
    return value;
}
public int peek(){
    if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
    }
return list.getHead().getValue();
}

public void deleteQueue(){
    list.setHead(null);
}
public boolean isEmpty(){
    if(list.getHead()==null) {
        return true;
    }
        else return false;

}
}
