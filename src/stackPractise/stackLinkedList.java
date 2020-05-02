package stackPractise;

import linkedList.SingleLinkedList;

public class stackLinkedList {

    public SingleLinkedList list;

    public stackLinkedList(){
        this.list=new SingleLinkedList();
    }

    // check if
    // to push an element in linked list

    public void push(int value){
        if(list.getHead()==null){
            list.createSingleLinkedList(value);
        }else{
            list.insertInLinkedList(value,0);
        }
        System.out.println(value+" value has been succesfully inserted");

    }

    public boolean isEmpty(){
        return list.getHead()==null;
    }

    // to pop an elment from list




    public void pop(){
        int value=-1;
        if (isEmpty()){
            System.out.println("underflow error");
    }else{
            value=list.getHead().getValue();
            list.deletionOfNode(0);
        }

}
// to peek a value from the list

    public void peek(){
        int value=-1;
        if (isEmpty()){
            System.out.println("under flow error");
        }else{
            value= list.getHead().getValue();
        }
    }

    // to delete a stack
    public void deleteList(){
        list.setHead(null);
        System.out.println("list has been deleted successfully");
    }

}