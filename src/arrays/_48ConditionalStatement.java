package arrays;

import java.util.Scanner;

public class _48ConditionalStatement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();

        String str="";
        if(name.equals("Chen")){
            str="teacher";
        }else{
            str="student";
        }

        System.out.println(str);
    }
}
