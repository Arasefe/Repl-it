package arrays;

import java.util.Scanner;

public class _64PrintMiddleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if(word.length()==1){
            char tripleChar=word.charAt(0);
            System.out.println(""+tripleChar+tripleChar+tripleChar);
        }else if(word.length()>=3&&word.length()%2!=0){
            char middle=word.charAt((word.length()-1)/2);
            System.out.println(middle);

        }else if(word.length()==2){
            String doubleString=word+""+word;
            System.out.println(doubleString);
        }else if(word.length()>=4&& word.length()%2==0){
            char middleChar1=word.charAt(word.length()/2-1);
            char middleChar2=word.charAt(word.length()/2);
            System.out.println(""+middleChar1+middleChar2);
        }
    }
}
