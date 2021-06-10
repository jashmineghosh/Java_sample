package tree;

import queue.QueueByLinkedList;
import list.SingleLInkedList;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeLinkedList {
BinaryNode root;

    public BinaryTreeLinkedList () {
        this.root = null;
    }
void preOrderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
    System.out.println("node value is "+node.getValue());
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
}

    void inOrderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
        preOrderTraversal(node.getLeft());
        System.out.println("node value is "+node.getValue());
        preOrderTraversal(node.getRight());
    }
    void postOrderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
        System.out.println("node value is "+node.getValue());

    }
    public void levelOrderTravel(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode node = queue.remove();
            System.out.println("value is "+node);
            if(node.getLeft()!= null){
                queue.add(node.getLeft());
            }
            if(node.getRight()!= null){
                queue.add(node.getRight());
            }
        }
    }

    public void searchingANode(int value){
        if(root == null) {
            System.out.println("tree is empty");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode node = queue.remove();
            if(node.getValue() == value){
                System.out.println("value is found in tree"+value);
                return;
            }

            if(node.getLeft()!= null){
                queue.add(node.getLeft());
            }
            if(node.getRight()!= null){
                queue.add(node.getRight());
            }
        }
        System.out.println("value is not found in tree");
    }
    public void insertNodeInTree(int value){
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        if(root == null) {
            System.out.println("tree is empty, inserting in root");
            root.setValue(value);
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode binaryNode = queue.remove();
            if(node.getLeft() == null){
                node.setLeft(node);
                break;
            }
            if(node.getRight() == null){
                node.setRight(node);
                break;
            }
            else {
                queue.add(node.getLeft());
                queue.add(node.getRight());
            }
        }
    }
    void deleteNode(int value){

        if(root == null) {
            System.out.println("tree is empty, cant delete");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode node = queue.remove();
            if(node.getValue() == value) {
                BinaryNode deep = getDeepestNode();
                node.setValue(deep.getValue());
                deleteDeepestNode();
                return;
            }else {
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
        }
        System.out.println("didnt find node!");
    }

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode node= null;
        while (!queue.isEmpty()){
             node = queue.remove();
            if(node.getLeft()!= null){
                queue.add(node.getLeft());
            }
            if(node.getRight() != null){
                queue.add(node.getRight());
            }

        }
        return node;
    }
    void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode node = null, previousNOde = null;

        while (!queue.isEmpty()){
            previousNOde = node;
            node = queue.remove();
            if(node.getLeft()== null){
                previousNOde.setRight(null);
               break;
            }
            else if(node.getRight() == null){
                previousNOde.setLeft(null);
                break;
            }
            queue.add(node.getLeft());
            queue.add(node.getRight());
        }

    }
    void deleteTree(){
        root = null;
    }
}
