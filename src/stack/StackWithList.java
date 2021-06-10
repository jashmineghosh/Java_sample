//package stack;
//import list.SingleLInkedList;
//
//public class StackWithList {
//
//SingleLInkedList<B> list;
//
//public StackWithList(){
//    list = new SingleLInkedList<B>();
//}
//
//public void push(int value){
//if(list.getHead() == null){
//    list.createSingleLinkedList(value);
//}
//else list.insertInSingleLinkedList(value, 0);
//
//}
//    public int pop() {
//        int value = -1;
//        if (isEmpty()) {
//            System.out.println("Stack underflow error!!");
//        } else {
//            value = list.getHead().getValue();
//            list.deleteNodeFromSpecificLoc(0);
//        }
//        return value;
//    }// end of method
//
//
//    public boolean isEmpty() {
//        if (list.getHead() == null)
//            return true;
//        else
//            return false;
//    }// end of method
//
//
//    public int peek() {
//        if (!isEmpty())
//            return list.getHead().getValue();
//        else {
//            System.out.println("The stack is empty!!");
//            return -1;
//        }
//    }// end of method
//
//
//    public void deleteStack() {
//        list.setHead(null);
//    }//end of method
//
//}
