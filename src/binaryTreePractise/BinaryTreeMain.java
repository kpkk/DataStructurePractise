package binaryTreePractise;

public class BinaryTreeMain {

    public static void main(String[] args) {
        binaryTreeArrayPractise tree=new binaryTreeArrayPractise(10);

        System.out.println("inserting values into the tree");
        for(int i=0;i<=10;i++){
        tree.insertValue(i*10);
    }
        System.out.println("post order traversal of an array is... \n");
        tree.postOrder(1);

        System.out.println("pre order traversal of an array is... \n");
        tree.preOrder(1);

        System.out.println("in order traversal of an array is... \n");
        tree.inOrder(1);

        tree.deleteNode(500);

        tree.deleteNode(50);

        System.out.println("post order traversal of an array is... \n");
        tree.postOrder(1);

        System.out.println("pre order traversal of an array is... \n");
        tree.preOrder(1);

        System.out.println("in order traversal of an array is... \n");
        tree.inOrder(1);

        tree.isTreeFull();

        tree.search(40);

        tree.deleteTree();


    }


}
