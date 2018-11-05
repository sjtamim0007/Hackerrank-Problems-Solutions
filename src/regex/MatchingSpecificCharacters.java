/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tamim
 */
public class MatchingSpecificCharacters {
     public static void main(String[] args) {
        
        Regex_Test5 tester = new Regex_Test5();
        tester.checker("^[123]{1}[120]{1}[xs0]{1}[30Aa]{1}[xsu]{1}[.,]{1}$");
    
    }
}

class Regex_Test5 {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}