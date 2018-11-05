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
public class MatchingAnythingButaNewline {
    public static void main(String[] args) {
        
        Tester tester = new Tester();
        //tester.check("[A-z0-9.]{3}\\.[A-z0-9.]{3}\\.[A-z0-9.]{3}\\.[A-z0-9.]{3}");
        tester.check(".{3}\\..{3}\\..{3}\\..{3}");
    
    }
}

class Tester {

    public void check(String pattern){
    
        Scanner scanner = new Scanner(System.in);
      	String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
 		Matcher m = p.matcher(testString);
 		boolean match = m.matches();
        
        System.out.format("%s", match);
    }   
    
}