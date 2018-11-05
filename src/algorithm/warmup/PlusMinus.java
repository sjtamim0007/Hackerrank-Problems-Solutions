/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.warmup;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 *
 * @author tamim
 */
public class PlusMinus {
    static void plusMinus(int[] arr, int n) {
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
               zeros += 1; 
            }
            if(arr[i] > 0){
                positive += 1;
            }
            if(arr[i] < 0){
                negative += 1;
            }
        }
        positive = positive / n;
        negative = negative / n;
        zeros = zeros / n;
        
        System.out.printf("%f\n",positive);
        System.out.printf("%f\n",negative);
        System.out.printf("%f\n",zeros);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr, n);

        scanner.close();
    }
}
