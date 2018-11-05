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
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext()) {
            System.out.println("0");
            return;
        }
        String s = scan.nextLine();
        // Write your code here.

        String[] array = s.trim().split("[.,'?_!@#$%^\\s&]+");
        if (s == "") {
            System.out.println("0");
        } else if (s.length() > 400000) {
            return;
        } else {
            System.out.println(array.length);
        }

        for (String temp : array) {
            System.out.println(temp);
        }
        scan.close();
    }
}
