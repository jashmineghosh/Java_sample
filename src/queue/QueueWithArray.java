package queue;

public class QueueWithArray {
int[] arr;
int topOfQueue;
int beginingOfQueue;

public QueueWithArray(int size){
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
topOfQueue ++;
    arr[topOfQueue] = value;
    System.out.println("succesfully inserted "+value);
}

public void deQueue(){
if(isQueueEmpty()){
    System.out.println("stack underflow error");
}
else{
    System.out.println("Dequeue element "+arr[beginingOfQueue]);
    beginingOfQueue++;
    if(beginingOfQueue > topOfQueue){ // if last element is Dequeue
        topOfQueue = beginingOfQueue = -1;
    }
}
}
public void printQueue(){
    if(!isQueueFull())
    {
        System.out.println("printitng queue");
        for(int i= beginingOfQueue;i<= topOfQueue;i++){
            System.out.println(" "+arr[i]+ " ");
        }
        System.out.println();
    }
    else System.out.println("queue is empty");
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
if(topOfQueue == arr.length -1){
    return true;
}
else
    return false;
}

public boolean isQueueEmpty(){
    if(beginingOfQueue == -1 || beginingOfQueue == arr.length){
        return true;
    }
    else return false;
}
}
