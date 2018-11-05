/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

import java.util.Scanner;

/**
 *
 * @author tamim
 */
public class LeftRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int n = input.nextInt();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[(i + size - n) % size] = input.nextInt();
        }
        for(int a : array){
            System.out.print(a + " ");
        }
    }
}
