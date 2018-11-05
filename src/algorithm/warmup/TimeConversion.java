/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.warmup;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author tamim
 */
public class TimeConversion {

    static String timeConversion(String s) {

        String oldIntValue = String.valueOf(s.charAt(0));
        oldIntValue += String.valueOf(s.charAt(1));

        if (s.contains("PM")) {
            if (oldIntValue.equals("12")) {
                s = s.substring(0, s.length() - 2);
            } else {
                int t = Integer.parseInt(oldIntValue);
                t += 12;
                String newIntValue = String.valueOf(t);
                s = s.replace(oldIntValue, newIntValue).substring(0, s.length() - 2);
            }
        } else {
            if (oldIntValue.equals("12")) {
                s = s.replace(oldIntValue, "00").substring(0, s.length() - 2);
            } else {
                s = s.substring(0, s.length() - 2);
            }
        }

        return s;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
