package stack;

public class StackWithArray {

    int[] a;
    int topOfStack;

    public  StackWithArray(int size){
        this.a = new int[size];
         this.topOfStack = -1;
        System.out.println("stack created successfully of size "+size);
    }

    public void pushToSTack(int value){
        if(!isFullStack()){
            a[topOfStack+1] = value;
            topOfStack++;
            System.out.println("Successfully inserted " + value + " in the stack");
        }
    }

    public void popFromStack(){
        if(isEmptyStack()){
            System.out.println("stack underflow error");
        }
        else {
            System.out.println("Poping value from Stack: " + a[topOfStack] + "...");
          topOfStack--;
        }
    }
    public void peekOperation() {
        if (!isEmptyStack())
            System.out.println("Top of Stack: " + a[topOfStack]);
        else {
            System.out.println("The stack is empty!!");
        }

    }//end of method

    public void deleteStack() {
        a = null;
        System.out.println("Stack is successfully deleted");
    }//end of method

    public boolean isEmptyStack() {
        //if top pointer is zero, the stack is empty
        if (topOfStack == -1)
            return true;
        else
            return false;
    }//end of method


    public boolean isFullStack() {
        if (topOfStack == a.length-1) {
            System.out.println("Stack is full !");
            return true;
        }else {
            return false;
        }
    }//end of method
}
