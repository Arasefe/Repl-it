package arrays;

import java.util.Scanner;

public class _72StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the ");
        String txt = s.next();


        String revised=txt.substring(0,txt.length()-1);
        System.out.println(revised);
    }
}
