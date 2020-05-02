package stackPractise;

public class StackArray {
   public int[] arr;
   public  int topOfstack;

   //create a stack
    public void createStack(int size){
        this.arr=new int[size];
        this.topOfstack=-1;
        System.out.println("stack is successfully created with size "+size);
    }

    //check if the stack is full

    public boolean isStackFull(){
        return topOfstack==arr.length-1;
    }

    //check if the stack is empty
    public boolean isEmptyStack(){
        return topOfstack==-1;
    }

    //push an element inside the stack
    public void push(int value){
        if (isStackFull()){
            System.out.println("stack overflow error occurred");
        }else{
            arr[topOfstack+1]=value;
            topOfstack++;
            System.out.println(value+" has been inserted succesfully");
        }

    }

    //to delete a stack
    public void deleteStack(){
        arr=null;
        System.out.println("stack has successfully been deleted");
    }

    //to pop en element from stack

    public void pop(){
        if(isEmptyStack()){
            System.out.println("underflow error");
        }else{
            System.out.println("value from stack is"+ arr[topOfstack]);
            topOfstack--;
        }
    }

    //to perform peek operation- just to return the top of the stack without deletion

    public void peek(){
        if(isEmptyStack()){
            System.out.println("stack is empty");
        }else{
            System.out.println("top value from stack is: "+ arr[topOfstack]);
        }
    }
}
