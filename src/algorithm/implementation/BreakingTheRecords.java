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
public class BreakingTheRecords {
     // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int []array = new int[2];
        int min = 0;
        int max = 0;
        int minCount = 0;
        int maxCount = 0;

        for(int i = 0; i < scores.length; i++){
            if(i == 0){
                min = scores[i];
                max = scores[i];
            }
            if(scores[i] < min){    
                array[1] = ++ minCount;
                min = scores[i];
            }
            if(scores[i] > max){
                array[0] = ++ maxCount;
                max = scores[i];
            }
        }

        return array;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
