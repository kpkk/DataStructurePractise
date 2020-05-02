package nodePractise;

public class BinaryNode {

    private BinaryNode left;
    private BinaryNode right;
    private int value;
    private int height;

    public int getValue(){return value;}

    public void setValue(int value){ this.value=value;}

    public int getHeight(){return height;}

    public void setHeight(int height){this.height=height;}

    public BinaryNode getLeft(){return left;}

    public BinaryNode getRight() {
        return right;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return value+" ";
    }
}
