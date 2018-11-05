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
public class JavaLoopsI {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        if(N >= 2 && N <= 20){
        for(int i = 1; i<=10 ; i++){
            //System.out.printf("%d X %d = %d\n",N,i,N * i);
            System.out.println(N+" x "+i+" = "+(N*i));
        }  
        }
    }
}
