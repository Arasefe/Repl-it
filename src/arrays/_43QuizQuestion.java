package arrays;

import java.util.Scanner;

public class _43QuizQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String str = s.nextLine();


        if(str.equals("a")){

            System.out.println("a is wrong");
        }else if(str.equals("b")){

            System.out.println("b is correct");
        }else if(str.equals("c")){

            System.out.println("c is wrong");
        }else{

            System.out.println(str+" is not a valid answer");
        }
    }
}
