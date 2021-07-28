/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class BinaryTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static void preorder(Node root) {
        if(root == null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    
    static void inorder(Node root) {
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    static void postorder(Node root) {
        if(root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        
        System.out.println("Preorder: ");
        preorder(root);
        System.out.println("Inorder: ");
        inorder(root);
        System.out.println("Postorder: ");
        postorder(root);
        
    }
}
