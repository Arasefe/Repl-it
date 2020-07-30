package arrays;

import java.util.Scanner;

public class _ForLoopVovels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        System.out.print("In:");
        String word = inp.nextLine();
        String str="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                str+=word.charAt(i);
            }

        }
        System.out.print(str);


    }
}
