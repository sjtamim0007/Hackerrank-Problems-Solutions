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
public class JavaStaticInitializerBlock {

    public static boolean flag;
    public static int B;
    public static int H;

    static {
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();

        if (B <= 0 || H <= 0) {
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            flag = true;
        }
    }
}
