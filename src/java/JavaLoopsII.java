/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.util.*;
import java.io.*;

/**
 *
 * @author tamim
 */
public class JavaLoopsII {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int answer = 0;

            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    answer += a + (int) (Math.pow(2, j)) * b;
                } else {
                    answer += (int) (Math.pow(2, j)) * b;
                }
                System.out.print(answer + " ");
            }
            System.out.println();

        }

        in.close();
    }
}
