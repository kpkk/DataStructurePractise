package LinkedListPractise;

import node.DoubleNode;

public class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;


    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoubleNode createDoubleLinkedList(int nodeValue){
        head=new DoubleNode();
        DoubleNode node=new DoubleNode();
        node.setValue(nodeValue);
        node.setPrev(null);
        node.setNext(null);
        head=node;
        tail=node;
        size=1;
        return head;

    }
    public boolean existsLinkedList(){
        return head!=null;
    }

    public void insertIntoDoubleLinkedList(int nodeValue, int location){

        DoubleNode node=new DoubleNode();
        node.setValue(nodeValue);
        if(!existsLinkedList()){
            System.out.println("linked list doesn't exists");
        }else if(location==0){ // to insert as a first element
            node.setPrev(null);
            node.setNext(head);
            head.setPrev(node);
            head=node;
        }else if(location>=size){ //to insert at last position
            tail.setNext(node);
            node.setPrev(tail);
            node.setNext(null);
            tail=node;

        }else{
            DoubleNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(node);
            node.setPrev(tempNode);
            node.setNext(tempNode.getNext());
            node.getNext().setPrev(node);

        }
        setSize(getSize()+1);
    }

    //this will help traversing through the list from head to tail

    public void traverseLinkedList() {
        if (existsLinkedList()) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println(tempNode.getValue());
                tempNode = tempNode.getNext();
            }
        }else{
            System.out.println("Linked List doesn't exist");
        }

    }

    //this method is useful to traverse from the tail to head
    public void traverseLinkedListInReverseOrder(){
        if(existsLinkedList()){
            DoubleNode tempNode=tail;
            for(int i=0;i<size;i++){
                System.out.println(tempNode.getValue());
               tempNode= tempNode.getPrev();
            }
        }else{
            System.out.println("linked list doesn't exist");
        }
    }

    // to delete the entire linked list
    public void deleteLinkedList(){
        if(existsLinkedList()){
            DoubleNode tempNode=head;
            for(int i=0;i<size;i++){
                tempNode.setPrev(null);
                tempNode.setNext(null);
            }
            head=tail=null;
        }else{
            System.out.println("Linked list doesn't present");
        }
    }

    public boolean searchNode(int nodeValue){
        if(existsLinkedList()){
            DoubleNode tempNode= head;
            for(int i=0;i<size;i++){
              if(tempNode.getValue()==nodeValue){
                  System.out.println("the node in the liat has been found at a specified location "+i);
                  return true;
              }
                tempNode= tempNode.getNext();
            }
        }else{
            System.out.println("linked list doesn't exist");
        }
        return false;

    }

    public void deletionOfNode(int location){
        if(!existsLinkedList()){
            System.out.println("Linked list doesn't exists");
        }else if(location==0){
            if(getSize()==1){
                head=tail=null;
                setSize(getSize()-1);
            }
            head=head.getNext();
            head.setPrev(null);
            setSize(getSize()-1);
        }else if(location>=size){
            DoubleNode tempNode=tail.getPrev();
            if(getSize()==1){
                head=tail=null;
                setSize(getSize()-1);
            }
            tempNode.setNext(null);
            tail=tempNode;
            setSize(getSize()-1);
        }else{
            DoubleNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.getNext();
            }
           tempNode.setNext(tempNode.getNext().getNext());
            tempNode.getNext().setPrev(tempNode);
            setSize(getSize()-1);
        }

    }
}
