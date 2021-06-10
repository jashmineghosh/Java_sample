package queue;

public class CircularQueWithArray {
    int[] arr;
    int topOfQueue;
    int beginingOfQueue;
    int size;

    public CircularQueWithArray(int size){
        this.size = size;
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginingOfQueue = -1;
    }

    public void enQueue(int value){
        if(isQueueFull()){
            System.out.println("queue is full, overflow");
        }
        if(isQueueEmpty()){
            beginingOfQueue = 0; //initializing if 1st element
            topOfQueue ++;
            arr[topOfQueue] = value;
            System.out.println("succesfully inserted as first value"+value);
        }
        else{
            if(topOfQueue == size && beginingOfQueue >0){
                topOfQueue =0;
                           }
            else {
                topOfQueue ++;
                           }
            arr[topOfQueue] = value;
        }
        System.out.println("succesfully inserted "+value);
    }

    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println("stack underflow error");
        }
        else{
            System.out.println("Dequeue element "+arr[beginingOfQueue]);

            if(beginingOfQueue == topOfQueue){ // if only element in queue
                topOfQueue = beginingOfQueue = -1;
            }
            if(beginingOfQueue == size -1){ //circle back to start
                beginingOfQueue =0;
            }
            else {
                beginingOfQueue++;
            }
        }

    }
    public void printQueue(){
        System.out.println("Array now...");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\nStart = " + beginingOfQueue);
        System.out.println("End = "+ topOfQueue);
    }
    public void deleteQueue(){
        arr = null;
        System.out.println("queue is successfully deleted");
    }

    public void peekQueue(){
        if(isQueueEmpty()){
            System.out.println(" empty queue, no peeking");
        }
        System.out.println("elements are "+arr[beginingOfQueue]);
    }
    public boolean isQueueFull(){
        if(topOfQueue == arr.length -1 && beginingOfQueue == 0){
            return true;
        }
        else if(topOfQueue +1 == beginingOfQueue){
            return true;
        }
           else return false;
    }

    public boolean isQueueEmpty(){
        if(topOfQueue == -1 ){
            return true;
        }
        else return false;
    }
}
