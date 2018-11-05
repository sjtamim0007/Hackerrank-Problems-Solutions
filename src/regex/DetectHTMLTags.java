/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tamim
 */
public class DetectHTMLTags {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String s = readHtml(input, n);
        
        String regex = "<\\b(\\w+)\\b.*?>";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        
        
        Set<String> set = new TreeSet<>();
        
        while(matcher.find()){
            set.add(matcher.group(1));
            //System.out.println(matcher.group(1));
        }
  
        int i = 0;
        Iterator<String> itr = set.iterator();
        
        while(itr.hasNext()){
            System.out.print(itr.next());
            i++;
            if(i < set.size()){
                System.out.print(";");
            }
        }
        
    }
    static String readHtml(Scanner sc, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(sc.nextLine());
        }
        return sb.toString();
    }
}
