package binaryTreePractise;

import node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {

     BinaryNode root;

     //this will create a blank binary tree
    public BinaryTreeByLinkedList(){
        this.root=root;
    }

    public void insert(int value){
      BinaryNode node=new BinaryNode();
      node.setValue(value);
      if(root==null){
          root=node;
          System.out.println("tha value has been inserted at root level");
      }else{
          Queue<BinaryNode> queue=new LinkedList<>();
          queue.add(root);
          while(!queue.isEmpty()){
              BinaryNode presentNode = queue.remove();
              if(presentNode.getLeft()==null){
                  presentNode.setLeft(node);
                  break;
              }
              else if(presentNode.getRight()==null){
                  presentNode.setRight(node);
                  break;
              }
              else {
                  queue.add(presentNode.getLeft());
                  queue.add(presentNode.getRight());

              }
          }
      }

    }
    public void search(int value){
        Queue<BinaryNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.getValue()==value){
                System.out.println(value+" was found in the binary tree");
                
            }else{
                if(presentNode.getLeft()!=null){
                   queue.add(presentNode.getLeft());
                }
                if(presentNode.getRight()!=null){
                    queue.add(presentNode.getRight());
                }
            }

        }
        System.out.println("value was not found in the binary tree");
       
    }


  public void deleteNode(int value){
        Queue<BinaryNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.getValue()==value){
                presentNode.setValue(getDeepestNode().getValue());
                deleteDeepestNode();
                System.out.println("node has successfully been deleted");
            }else{
                if(presentNode.getLeft()!=null) {
                    queue.add(presentNode.getLeft());
                }if(presentNode.getRight()!=null) {
                    queue.add(presentNode.getRight());
                }
            }
        }
      System.out.println("value doesn't exist in the system to delete");
  }

  public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<>();
      BinaryNode presentNode=null;
        queue.add(root);
        while(!queue.isEmpty()){
             presentNode = queue.remove();
            if(presentNode.getLeft()!=null){
                queue.add(presentNode.getLeft());
            }
            if(presentNode.getRight()!=null){
                queue.add(presentNode.getRight());
            }
        }
        return presentNode;
  }

  public void deleteDeepestNode(){
        Queue<BinaryNode> queue= new LinkedList<>();
        BinaryNode previousNode, presentNode=null;
        queue.add(root);
        while (!queue.isEmpty()){
            previousNode=presentNode;
            presentNode = queue.remove();
            if(presentNode.getLeft()==null){
                previousNode.setRight(null);
                return;
            }
            else if(presentNode.getRight()==null){
                presentNode.setLeft(null);
                return;
            }else{
                queue.add(presentNode.getLeft());
                queue.add(presentNode.getRight());
            }

        }
  }
  public void inOrder(BinaryNode node){
        if(node==null){
            return;
        }else{
            inOrder(node.getLeft());
            System.out.println(node.getValue()+" ");
            inOrder(node.getRight());
        }
  }
  public  void preOrder(BinaryNode node){
        if(node==null){
            return;
        }else{
            System.out.println(node.getValue()+" ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }


      }
    public void postOrder(BinaryNode node){
        if(node==null){
            return;
        }else{
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getValue()+" ");

        }
  }
    public void deleteTree(){
        root=null;
        System.out.println("tree has been deleted succesfully");

    }

    public void levelOrder(){
        Queue<BinaryNode>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            System.out.println("the value of the node is "+presentNode.getValue()+" ");
            if(presentNode.getLeft()!=null){
                queue.add(presentNode.getLeft());
            }
            if(presentNode.getRight()!=null){
                queue.add(presentNode.getRight());
            }
        }
    }
 


}
