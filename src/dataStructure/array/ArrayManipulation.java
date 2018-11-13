/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure.array;

import java.util.Scanner;

/**
 *
 * @author tamim
 */
public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        long[] array = new long[n];

        for (int i = 0; i < m; i++) {
            int lower = input.nextInt();
            int upper = input.nextInt();
            long sum = input.nextInt();
            array[lower - 1] += sum;
            if (upper < n) {
                array[upper] -= sum;
            }
        }

        long max = 0;
        long temp = 0;
        for (int j = 0; j < array.length; j++) {
            temp += array[j];
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
