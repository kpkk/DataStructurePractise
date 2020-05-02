package LinkedListPractise;

import nodePractise.*;

public class SingleLinkedList {

    private SingleNode head;
    private SingleNode tail;
    private  int size;

    //create a linked list

    public SingleNode createLinkedList(int nodeValue) {
        head=new SingleNode();
        SingleNode node=new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public SingleNode getHead(){return head;}
    public SingleNode getTail(){return tail;}
    public void setHead(SingleNode head){this.head=head;}
    public void setTail(SingleNode tail){this.tail=tail;}
    public int getSize(){return size;}
    public void setSize(int size){this.size=size;}

    //check if a linked list exists
    public boolean existsLinkedList(){
        return head!=null;
    }

    //insert a value in linked list
    public void insertIntoLinkedList(int nodeValue, int location){

        SingleNode node=new SingleNode();
        node.setValue(nodeValue);
        if(!existsLinkedList()){
            System.out.println("Linked list doesn't exist..!");
        }else if(location==0){ //to insert at first place
            node.setNext(head);
            head=node;
        }
        else if(location>=getSize()){
            node.setNext(null);
            tail.setNext(node);
            tail=node;
        }
        else{ // to insert in the middle
            SingleNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.getNext();
            }// currently tempNode refers to the
            SingleNode nextNode= tempNode.getNext();
            node.setNext(nextNode);
            tempNode.setNext(node);
        }
        setSize(getSize()+1);
    }

    // to delete the entire linked list
    public void deleteLinkedList() {
        if (existsLinkedList()) {
            head = null;
            tail = null;
        }
    }
        public void traverseLinkedList(){
            SingleNode tempNode= head;
            if(existsLinkedList()){
                for(int i=0;i<getSize();i++){
                    System.out.println(tempNode.getValue());
                    tempNode = tempNode.getNext();
                }
            }else{
                System.out.println("linked list doesn't exist..!");
            }
            System.out.println("\n");
        }

        // to search for any value
        public boolean searchNode(int nodeValue) {
            if (existsLinkedList()) {
                SingleNode tempNode = head;
                for (int i = 0; i < getSize(); i++) {
                    if (tempNode.getValue() == nodeValue) {
                        System.out.println("value found at the location "+i+" \n");
                        return true;
                    }
                    tempNode = tempNode.getNext();
                }
            }else{
                System.out.println("value not found");
            }
            return false;
        }

        public void deleteNode(int nodeValue, int location){
        if(!existsLinkedList()){
            System.out.println("linked list doesn't exist...!");
        }else if(location==0){
            head=head.getNext();
            setSize(getSize()-1);
            return;
        }
        else if(location>=getSize()){
            SingleNode tempNode= head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.getNext();
                if(tempNode==head){
                    head=tail=null;
                    setSize(getSize()-1);
                    return;
                }
                tempNode.setNext(null);
                tail=tempNode;
                return;

            }
        }else{// to delete in specified location
            SingleNode tempNode= head;
            for (int i=0;i<location-1;i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }
        }



}
