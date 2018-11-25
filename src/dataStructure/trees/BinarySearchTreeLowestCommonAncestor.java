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
public class BinarySearchTreeLowestCommonAncestor {
    /*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
        if(root.data > v1 && root.data > v2){
            return lca(root.left,v1,v2);
        }
        if(root.data < v1 && root.data < v2){
            return lca(root.right,v1,v2);
        }
        return root;
    }
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
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
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
      	int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
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
