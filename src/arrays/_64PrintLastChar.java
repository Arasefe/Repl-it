package arrays;

import java.util.Scanner;

public class _64PrintLastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char lastLetter=word.charAt(word.length()-1);
        System.out.println(lastLetter);

    }
}
