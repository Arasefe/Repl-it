package arrays;

import java.util.Scanner;

public class _StringLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name:");
        String txt=s.next();
        int length=txt.length();

        System.out.println(length);
    }
}
