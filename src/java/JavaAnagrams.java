/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.util.Arrays;

/**
 *
 * @author tamim
 */
public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() == b.length()) {
            a = a.toLowerCase();
            b = b.toLowerCase();
            char[] array1 = a.toCharArray();
            char[] array2 = b.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);

            String x = new String(array1);
            String y = new String(array2);
        

            if (x.equalsIgnoreCase(y)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
