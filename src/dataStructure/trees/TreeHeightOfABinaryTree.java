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
public class TreeHeightOfABinaryTree {

    /*
    class Node 
    	int data;
    	Node left;
    	Node right;
     */
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return getHeight(root);
    }

    private static int getHeight(Node root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        if (root.left != null) {
            left = getHeight(root.left);
        }
        if (root.right != null) {
            right = getHeight(root.right);
        }

        return (left > right) ? (left + 1) : (right + 1);

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
        int height = height(root);
        System.out.println(height);
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
