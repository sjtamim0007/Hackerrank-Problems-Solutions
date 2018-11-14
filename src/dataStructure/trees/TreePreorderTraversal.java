/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure.trees;

import java.util.Scanner;

/**
 *
 * @author tamim
 */
public class TreePreorderTraversal {

    /* you only have to complete the function given below.  
Node1 is defined as  

class Node1 {
    int data;
    Node1 left;
    Node1 right;
}

     */
    public static void preOrder(Node root) {
        if (root != null) {
            traversal(root);
            System.out.println();
        }
    }

    private static void traversal(Node root) {
        System.out.print(root.data + " ");
        if (root.left != null) {
            traversal(root.left);
        }
        if (root.right != null) {
            traversal(root.right);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }
}

class Node {

    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
