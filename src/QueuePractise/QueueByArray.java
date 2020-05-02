package QueuePractise;

public class QueueByArray {

    public int arr[];
    public int begginingOfQueue;
    public int topOfQueue;

    // create a queue

    public  QueueByArray(int size){
        this.arr=new int[size];
        this.begginingOfQueue=-1;
        this.topOfQueue=-1;
        System.out.println("Queue has been created successfully of size "+ size);
    }

    public boolean isEmpty(){
        if((begginingOfQueue==-1)|| (begginingOfQueue==arr.length)) {
            System.out.println("queue is empty");
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        return topOfQueue==arr.length-1;
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("Overflow error occurred..");
        }else if (isEmpty()){
            begginingOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println(value+" has been inserted");
        }else{
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println(value+" has been inserted");
        }
    }
    public void printQueue(){
        if(!isEmpty()){
            for(int i=begginingOfQueue;i<=topOfQueue;i++){
                System.out.println(arr[i]+" ");
            }
        }else{
            System.out.println("queue is empty");
        }

    }
    public void deQueue(){
        if(isEmpty()){
            System.out.println("under flow error of a queue");
        }else{
            System.out.println("the value to be deQueued is "+arr[begginingOfQueue]);
            begginingOfQueue++;
            if(begginingOfQueue>topOfQueue){
                begginingOfQueue=topOfQueue=-1;
            }
        }
    }
    public void peekOperation(){
        if(isEmpty()){
            System.out.println("underflow error has occurred..");
        }else{
            System.out.println("the value to be peedked is" +arr[begginingOfQueue]);
        }
    }
    public void deleteQueue(){
        if(!isEmpty()){
            arr=null;
            System.out.println("queue has been deleted succesfully");
        }
    }
}
