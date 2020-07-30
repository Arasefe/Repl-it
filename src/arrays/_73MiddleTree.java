package arrays;

import java.util.Scanner;

public class _73MiddleTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String newStr="";
        if(word.length()>=5 && word.length()%2!=0){
            newStr=word.substring(word.length()/2-1,word.length()/2+2);
        }else{
            newStr="invalid";
        }

        System.out.println(newStr);
    }
}
