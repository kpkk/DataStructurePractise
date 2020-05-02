package LinkedListPractise;

import node.DoubleNode;

public class DoubleCircularLinkedList {

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
    // to create a double circular linked list
    public DoubleNode createDoubleLinkedList(int nodeValue){
        head=new DoubleNode();
        DoubleNode node=new DoubleNode();
        node.setValue(nodeValue);
        node.setPrev(node);
        node.setNext(node);
        head=tail=node;
        size=1;
        return head;
    }
    public boolean existsLinkedList(){
        return head!=null;
    }

    public void insertInLinkedList(int nodeValue, int location){
        DoubleNode node= head;
        node.setValue(nodeValue);
        if(!existsLinkedList()){
            System.out.println("Linked list does not exists");
        }
        else if(location==0){
            node.setPrev(tail);
            head.setPrev(node);
            tail.setNext(node);
            node.setNext(head);
            head=node;
        }
        else if(location>=getSize()){
            node.setNext(head);
            node.setPrev(tail);
            tail.setNext(node);
            head.setPrev(node);
            tail=node;
        }
        else{
            DoubleNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.getNext();
            }
            node.setPrev(tempNode);
            tempNode.setNext(node);
            node.setNext(tempNode.getNext());
            node.getNext().setPrev(node);
        }
        size++;
    }
    public void traverseLinkedList(){
        DoubleNode tempNode=head;
        if(existsLinkedList()){
            for(int i=0;i<size;i++){
                System.out.println(tempNode.getValue());
                tempNode=tempNode.getNext();
            }

        }else{
            System.out.println("linked list doesn't exist");
        }
    }

    public void traverseLinkedListInReverseOrder(){
        DoubleNode tempNode=tail;
        if(existsLinkedList()){
            for (int i=0;i<size;i++){
                System.out.println(tempNode.getValue());
                tempNode=tempNode.getPrev();
            }

        }
    }

    public void deleteLinkedList(){
        if(existsLinkedList()){
            head=tail=null;
        }else{
            System.out.println("linked list doesn't exist");
        }

    }

    public boolean searchNode(int nodeValue){
        DoubleNode tempNode=head;
        if(existsLinkedList()){
            for(int i=0;i<size;i++){
                if(tempNode.getValue()==nodeValue){
                    System.out.println("node was found in the given linked list at location "+i);
                    return true;
                }
                tempNode=tempNode.getNext();
            }

        }else{
            System.out.println("linked list doesn't exist");
        }
        return false;

    }
    public void deletionOfNode(int location){
        DoubleNode node=head;
        if(!existsLinkedList()){
            System.out.println("Linked List doesn't exist");
        }else if(location==0){
            if (getSize()==1){
                node.setNext(null);
                node.setPrev(null);
                head=tail=null;
                setSize(getSize()-1);
                return;
            }else {
                head = head.getNext();
                head.setNext(head);
                tail.setPrev(head);
                head.setPrev(tail);
                setSize(getSize()-1);
            }
        }else if(location>=size) {
            DoubleNode tempNode = head;
            if (getSize() == 1) {
                node.setNext(null);
                node.setPrev(null);
                head = tail = null;
                setSize(getSize() - 1);
            } else {
                for (int i = 0; i < size - 1; i++) {
                    tempNode = tempNode.getNext();
                }
                tail = tempNode;
                tempNode.setNext(head);
                tail.setNext(null);
                head.setPrev(tail);
                setSize(getSize() - 1);
            }
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
