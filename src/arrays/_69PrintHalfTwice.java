package arrays;

import java.util.Scanner;

public class _69PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String str=word.substring(0,word.length()/2);
        System.out.println(str.concat(str));
    }
}
