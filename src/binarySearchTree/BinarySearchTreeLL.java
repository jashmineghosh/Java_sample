package binarySearchTree;

import tree.BinaryNode;
import tree.BinaryTreeArray;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeLL {
    BinaryNode root;

    public BinarySearchTreeLL () {
        this.root = null;
    }

    void searchForValue(int value) {
        search(root, value);
    }

    BinaryNode search (BinaryNode node, int value) {
        if (node == null) {
            System.out.println("tree is empty");
            return null;
        } else if (node.getValue() == value) {
            System.out.println("Value: " + value + " found in BST.");
            return node;
        }
            if (node.getValue() < value) {
               return search(node.getRight(), value);
            }
        else return search(node.getLeft(), value);
    }
    void levelOrderTraversal() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        System.out.println("\nPrinting Level order traversal of Tree...");
        if (root == null) {
            System.out.println("Tree does not exists !");
            return;
        }
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.getValue() + " ");
            if (presentNode.getLeft() != null)
                queue.add(presentNode.getLeft());
            if (presentNode.getRight() != null)
                queue.add(presentNode.getRight());
        }
    }

    // Insert values in BST
    void insert(int value) {
        root = insertNode(root, value);
    }

BinaryNode insertNode(BinaryNode currentNode, int value){
    if (currentNode == null) { // if root node is blank then insert new node there
        System.out.println("Successfully inserted " + value + " in BST");
        return createNode(value);
    } else if (value <= currentNode.getValue()) {
        currentNode.setLeft(insertNode(currentNode.getLeft(), value));
        return currentNode;
    } else {
        currentNode.setRight(insertNode(currentNode.getRight(), value));
        return currentNode;
    }
}

BinaryNode createNode(int value){
       BinaryNode node = new BinaryNode();
       node.setValue(value);
       return node;
}

void deleteNode(int value){
        deleteNode(root, value);
}
BinaryNode deleteNode(BinaryNode node, int value){
if(node == null){
    return null;
}
if(value < node.getValue()){
    node.setLeft(deleteNode(node.getLeft(), value));
}
    if(value > node.getValue()){
        node.setRight(deleteNode(node.getRight(), value));
    }
    if(node.getValue() == value){
        if (node.getLeft() != null && node.getRight() != null){
            BinaryNode minNode = findMinumumElement(node.getRight());
            node.setValue(minNode.getValue());
            node.setRight(deleteNode(node.getRight(), minNode.getValue()));
        }
       if(node.getLeft() != null){
           node = node.getLeft();
       }
        if(node.getRight() != null){
            node = node.getRight();
        }
        else node = null;
    }
    return node;
}

BinaryNode findMinumumElement(BinaryNode node){
        if(node.getLeft() == null){
            return node;

        }
        else return findMinumumElement(node.getLeft());
}
    public void deleteTree() {
        System.out.println("Deleting entire Tree...");
        root = null;
        System.out.println("Tree deleted successfully !");
    }
}
