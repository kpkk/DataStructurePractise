package QueuePractise;

public class CircularQueueByArray {
    int arr[];
    int size;
    int start;
    int topOfQueue;

    public CircularQueueByArray(int size){
        arr=new int[this.size];
        this.size=size;
        start=-1;
        topOfQueue=-1;
        System.out.println("queue has been created successfully with size "+size);

    }

    public boolean isQueueEmpty(){
        return topOfQueue==-1;
    }

    public boolean isQueueFull(){
        if(topOfQueue+1==start){
            System.out.println("the queue is full");
            return true;
        }else if((start==0)||(topOfQueue+1==size)){
            System.out.println("queue is full");
            return true;
        }else{
            return false;
        }
    }

    public void initializeArray(){
        if(start==-1){
            start=0;
        }
    }

    public void printArray(){
        if(!isQueueEmpty()){
            for(int i=0;i<size;i++){
                System.out.println("the value from the queue is "+arr[i]);
            }
        }else{
            System.out.println("no queue has been created to print");
        }
        System.out.println("the start of queue is "+ start);
        System.out.println("the top of queue is "+topOfQueue);
    }

    public void enQueue(int value){
        if(arr==null){
            System.out.println("no queue has been created");
        }else if(isQueueFull()){
            System.out.println("queue overflow error has occurred");
        }else{
            initializeArray();
            if(topOfQueue+1==size){
                topOfQueue=0;
            }else {
                topOfQueue++;
            }
        }
        arr[topOfQueue]=value;
        System.out.println(value+" has been inserted succesfully");

    }

    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println("no queue has been created to removed value");
        }else{
            System.out.println("the element to deQueue is "+arr[start]);
            if(start==topOfQueue){
                start=topOfQueue=-1;
            }else if(start+1==topOfQueue){
                start=0;

            }
            else{
                start++;
            }
        }
        System.out.println("after dequeue");
        printArray();
    }

    public void peekOperation(){
        if(!isQueueEmpty()){
            System.out.println("the peek of the array is "+arr[start]);
        }else{
            System.out.println("no element present in queue to peek");
        }
    }
}
