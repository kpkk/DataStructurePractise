package LinkedListPractise;

import node.SingleNode;

public class SingleCircularLinkedList {

    private SingleNode head;
    private  SingleNode tail;
    private int size;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // to create a single circular linked list of size=1
    public SingleNode createSingleLinkedList(int nodeValue){
        head=new SingleNode();
        SingleNode node=new SingleNode();
        node.setValue(nodeValue);
       node.setNext(node);
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public boolean existsLinkedList(){
        return head!=null;
    }

    // to insert a node in linked list
    public void insertInLinkedList(int nodeValue, int location){
        SingleNode node=new SingleNode();
        node.setValue(nodeValue);
        if(!existsLinkedList()){
            System.out.println("linked list doesn't exists..!");
            return;
        }else if(location==0){
            node.setNext(head);
            head=node;
            tail.setNext(node);
        }else if(location>=size){ // to insert at last posistion
            tail.setNext(node);
            tail=node;
            tail.setNext(head);
        }else { // to insert at any position
            SingleNode tempNode= head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(node);
            node.setNext(tempNode.getNext());
        }
        size++;

    }

    // to traverse in a single linked list
    public void traverseInLinkedList(){
        if(existsLinkedList()){
            SingleNode tempNode=head;
            for(int i=0;i<size;i++){
                System.out.println(tempNode.getValue());
                tempNode=tempNode.getNext();
            }
        }else{
            System.out.println("Linked list doesn't exist");
        }
    }

    // method to search a specific node
    public boolean searchAnode(int nodeValue){
        if(existsLinkedList()){
            SingleNode tempNode=head;
            for(int i=0;i<size;i++){
                if(tempNode.getValue()==nodeValue){
                    System.out.println("node present in linked list at location "+i);
                    return true;
                }
                tempNode=tempNode.getNext();
            }
        }else{
            System.out.println("Node value not found");

        }
        return false;
    }
    //method to delete the entire linkedlist
    public void deleteLinkedList(){
        if(existsLinkedList()){
            head=null;
            if(tail==null){
                System.out.println("Linked list has already been deleted");
            }else{
                tail=null;
                tail.setNext(null);
            }
        }

    }
    public void deletionOfNode(int location){
        if(!existsLinkedList()){
            System.out.println("Linked list doesn't exists");
        }else if(location==0){
            head=head.getNext();
            tail.setNext(head);
            setSize(getSize()-1);
            if(getSize()==0){
                tail=null;
            }
        }else if(location>=size){
            SingleNode tempNode=head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.getNext();

            }
            if(tempNode==head){
                head=tail=null;
                setSize(getSize()-1);
            }else{
                tempNode.setNext(head);
                tail=tempNode;
                setSize(getSize()-1);
            }

        }else { //if any node to be deleted
            SingleNode tempNode= head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }

    }


}
