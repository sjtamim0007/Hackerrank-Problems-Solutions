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
public class GradingStudents {
      /*
     * Complete the gradingStudents function below.
     */
     static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > 37 && grades[i] % 5 >= 3){
                grades[i] = grades[i] + (5 - (grades[i] % 5));
            }
        }
        return grades;

    }
    
//    static int increment(int number){
//        int add = 0;
//        while(true){
//            if(number % 5 == 0){
//                break;
//            }
//            number ++;
//            add++;
//        }
//        return add;
//    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
