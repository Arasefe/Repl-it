package arrays;

import java.util.Scanner;

public class _65DuplicateIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String total=word1+word2+word2+word1;
        System.out.println(total);
    }
}
