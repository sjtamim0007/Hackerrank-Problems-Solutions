/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.implementation;

import java.util.Scanner;

/**
 *
 * @author tamim
 */
public class AppleAndOrange {
      static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        apples = sum(apples, a);
        oranges = sum(oranges, b);
        int count = 0;
        for(int i = 0 ; i < apples.length; i++){
            if(apples[i] >= s && apples[i]<= t){
                count ++;
            }
        }
        System.out.println(count);
        count = 0;
        for(int j = 0; j < oranges.length; j++){
            if(oranges[j] >= s && oranges[j] <= t){
                count ++;
            }
        }
        System.out.println(count);
    }
    
    private static int[] sum(int []array, int value){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] + value;
        }
        return array;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
