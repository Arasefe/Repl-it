package arrays;

import java.util.Scanner;

public class _76Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("email: ");
        String email = scan.next();
        if(email.contains("_")){
            String name=email.substring(0,email.indexOf('_'));
            String lastName=email.substring(email.indexOf('_')+1,email.indexOf('@'));
            String temp="";
            temp=name;
            name=lastName;
            lastName=temp;
            System.out.println(name+"_"+lastName+"@gmail.com");
        }else if(!email.contains("_")){
            System.out.println(email);
        }

    }
}
