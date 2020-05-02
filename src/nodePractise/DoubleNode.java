package nodePractise;

public class DoubleNode {

    private DoubleNode next;
    private DoubleNode prev;
    private int value;

    public int getValue(){return value;}
    public void setValue(){this.value=value;}

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
    public String toString(){return value +" ";}
}
