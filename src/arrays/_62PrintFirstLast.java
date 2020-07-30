package arrays;

import java.util.Scanner;

public class _62PrintFirstLast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String firstLast=""+word.charAt(0)+word.charAt(word.length()-1);
        System.out.println(firstLast);
    }
}
