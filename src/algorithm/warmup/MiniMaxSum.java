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
public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        long max = 0;
        long min = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(i >= 0 && i < arr.length - 1){
                min += arr[i];
            }
            if(i > 0 && i < arr.length){
                max += arr[i];
            }
        }
        System.out.print(min);
        System.out.print(" " + max);
        System.out.println();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
