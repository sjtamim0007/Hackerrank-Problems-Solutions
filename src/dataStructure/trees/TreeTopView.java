/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author tamim
 */
public class TreeTopView {

    /* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
     */
    static class QueueNode {

        Node node;
        int level;

        public QueueNode(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void topView(Node root) {
        Queue<QueueNode> queue = new LinkedList<QueueNode>();

        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        queue.add(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode r = queue.poll();
            if (!map.containsKey(r.level)) {
                map.put(r.level, r.node.data);
            }
            if (r.node.left != null) {
                queue.add(new QueueNode(r.node.left, r.level - 1));
            }
            if (r.node.right != null) {
                queue.add(new QueueNode(r.node.right, r.level + 1));
            }
        }
        for (Integer value : map.values()) {
            System.out.print(value + " ");
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
        topView(root);
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
