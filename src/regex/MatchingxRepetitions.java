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
public class MatchingxRepetitions {
    public static void main(String[] args) {
        
        Regex_Test8 tester = new Regex_Test8();
        tester.checker("^[A-Za-z02468]{40}[13579\\s]{5}$"); // Use \\ instead of using \ 
    
    }
}

class Regex_Test8{

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}