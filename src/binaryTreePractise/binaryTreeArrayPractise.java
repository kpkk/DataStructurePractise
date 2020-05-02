package binaryTreePractise;

public class binaryTreeArrayPractise {

    int arr[];
    int lastUpdateIndex;

    public binaryTreeArrayPractise(int size){
        arr= new int[size+1];
        this.lastUpdateIndex=0;
        System.out.println("blank tree of "+size+" is created");
    }
      //checking if incase the tree is full
    boolean isTreeFull(){
        if(arr.length-1==lastUpdateIndex){
            return true;
        }else
            return false;
    }
    // to insert a value in the tree
    public void insertValue(int value){
        if(!isTreeFull()){
            arr[lastUpdateIndex+1]=value;
            lastUpdateIndex++;
            System.out.println(value+ " has been inserted sucessfully");
        }else{
            System.out.println("tree is full no element can be inserted");
        }
    }
   // this is also called breadth order traversal, this will traverse on level basis-horizontally
    public void levelOrder(){
        for(int i=0;i<lastUpdateIndex;i++){
            System.out.println(arr[i]+ "\n" );
        }
    }

    // pre-order traversal,first we see root, then left sub tree followed by right sub tree
    public void preOrder(int index){
        if(index>lastUpdateIndex){
            return;
        }else{
            System.out.println(arr[index]+" ");
            preOrder(2*index);
            preOrder(2*index+1);
        }
    }
    // post order traversal, first we see left tree, then right tree and later the root
    public void postOrder(int index){
        if(index>lastUpdateIndex){
            return;
        }else{
            postOrder(2*index);
            postOrder(2*index+1);
            System.out.println(arr[index]+" ");
        }
    }
    // this is in order traversal, first we see left tree, then  root and later right tree
    public void inOrder(int index){
        if(index>lastUpdateIndex){
            return;
        }else{
            inOrder(2*index);
            System.out.println(arr[index]+" ");
            inOrder(2*index+1);
        }
    }

    // to search for a value present in the tree
    public int search(int value){
        for (int i=0;i<lastUpdateIndex;i++){
           if(arr[i]==value){
               System.out.println(value+ " found in the tree");
               return i;
           }
        }
        System.out.println("value doesn't exist in the array");
        return -1;
    }
// to delete any particular node present in the tree
    public void deleteNode(int value){
        int location = search(value);
        if(location==-1){
            return;
        }else{
            arr[location]=lastUpdateIndex;
            lastUpdateIndex--;
            System.out.println("element has successfully been removed");
        }

    }

    // to delete the entire array
    public void deleteTree(){
        arr=null;
        System.out.println("tree has been deleted");
    }

}
