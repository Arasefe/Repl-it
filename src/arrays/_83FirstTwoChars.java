package arrays;

import java.util.Scanner;

public class _83FirstTwoChars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        String firstTwo=txt.substring(0,2);
        System.out.println(firstTwo);
    }
}
