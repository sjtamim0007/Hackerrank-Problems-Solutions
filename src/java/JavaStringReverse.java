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
public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        A = A.toLowerCase();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder();
        String x = sb.append(A).toString();
        String y = sb.reverse().toString();

        if (x.equals(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
