package arrays;

import java.util.Scanner;

public class _StringCharAt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String txt = s.next();
        System.out.println(txt.charAt(2));
        System.out.println(txt.charAt(4));
        System.out.println(txt.charAt(5));
    }
}
