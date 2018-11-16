/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure.trees;

import java.util.ArrayList;

/**
 *
 * @author tamim
 */
public class IsThisABinarySearchTree {

    static ArrayList<Node> list = new ArrayList<>();

    boolean checkBST(Node root) {
        traversal(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).data <= list.get(i - 1).data) {
                return false;
            }
        }
        return true;
    }

    static void traversal(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            traversal(root.left);
        }
        list.add(root);
        if (root.right != null) {
            traversal(root.right);
        }
    }
}
