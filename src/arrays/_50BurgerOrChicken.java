package arrays;

import java.util.Scanner;

public class _50BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.next();
        float f = 0;
        if (in.equals("burger") || in.equals("chicken")) {
            f = 10.0f;
            System.out.println(f);
        } else if (in.equals("soda")) {
            f = 2.0f;
            System.out.println(f);
        }
    }
}
