/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tamim
 */
public class Kangaroo {
    
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1 < x2 && v1 < v2 || x1 != x2 && v1 == v2){
            return "NO";
        }
        else{
           int difference = 0;

           while(difference >= 0){
               x1 = x1 + v1;
               x2 = x2 + v2;
               difference = x2 - x1;
               if(difference == 0){
                   return "YES";
               }
           }

           return "NO";
        }

    }

    


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
