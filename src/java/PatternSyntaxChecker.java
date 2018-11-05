/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author tamim
 */
public class PatternSyntaxChecker {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
             //Write your code
          try {
                Pattern pattern2 = Pattern.compile(pattern);
                System.out.println("Valid");
                testCases --;
            }catch(Exception e){
                System.out.println("Invalid");
                testCases--;
            }
      }
   }
}
