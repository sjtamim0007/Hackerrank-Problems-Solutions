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
public class DiagonalDifference {
    static int diagonalDifference(int[][] arr, int n) {
        int d1 = 0;
        int d2 = 0;
        // for(int row = 0 ; row < arr.length; row++){
        //     for(int col = 0; col < arr[row].length; col++){
        //         if(row == 0 && col==0){
        //             sum1 += arr[row][col];
        //         }
        //         else if(row == 0 && col == arr[row].length-1){
        //             sum2 += arr[row][col];
        //         }
        //         else if(row == (arr.length -1)/2 && col == (arr.length -1)/2){
        //             sum1 += arr[row][col];
        //             sum2 += arr[row][col];
        //         }
        //         else if(row == arr.length-1 && col == 0){
        //             sum2 += arr[row][col];
        //         }
        //         else if(row == arr.length-1 && col == arr.length-1){
        //             sum1 += arr[row][col];
        //         }
        //      }
        // }
        
        for (int i = 0; i < n; i++) { 
            d1 += arr[i][i]; 
            d2 += arr[i][n-i-1]; 
        }
        
        return Math.abs(d1 - d2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
