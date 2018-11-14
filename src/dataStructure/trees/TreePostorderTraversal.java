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
public class TreePostorderTraversal {

    public static void postOrder(Node root) {
        if (root != null) {
            traversal(root);
            System.out.println();
        }
    }

    private static void traversal(Node root) {
        if (root.left != null) {
            traversal(root.left);
        }

        if (root.right != null) {
            traversal(root.right);
        }
        System.out.print(root.data + " ");
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
        postOrder(root);
    }
}

//class Node {
//    Node left;
//    Node right;
//    int data;
//    
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}
