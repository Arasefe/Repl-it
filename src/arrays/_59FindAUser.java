package arrays;

import java.util.Scanner;

public class _59FindAUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");
        String name=scan.nextLine();
        if(name.equalsIgnoreCase("Max Payne")|| name.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }
    }
}
