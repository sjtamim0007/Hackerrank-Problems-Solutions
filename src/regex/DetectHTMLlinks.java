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
public class DetectHTMLlinks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String s = null;
        if (N < 100) {
            input.nextLine();
            s = html(input, N);
        } else {
            System.exit(1);
        }

        //String regEx = "<a href=\"(.+?)\">(.+?)</a>";
        String regEx = "<a\\shref=\"([^\"]++)\"([^<>]*)>(<\\w>)*([^<>]*)<";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group(1).trim() + "," + matcher.group(4).trim());
        }

    }

    static String html(Scanner sc, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(sc.nextLine());
        }
        return sb.toString();
    }
}
