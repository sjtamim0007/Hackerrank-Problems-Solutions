/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.util.Scanner;

/**
 *
 * @author tamim
 */
public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array1 = new int[n];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            int number = input.nextInt();
            array1[i] = number;
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                int c = 0;
                if (i > j) {

                } else {
                    for (int k = j; k >= i; k--) {
                        c = c + array1[k];
                    }
                    if (c < 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
