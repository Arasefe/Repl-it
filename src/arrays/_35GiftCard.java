package arrays;

import java.util.Scanner;

public class _35GiftCard {
    public static void main(String[] args) {
        giftCard();
    }
    public static void giftCard(){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        if(input.equalsIgnoreCase("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(input.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(input.equalsIgnoreCase("Charger")){
            int balance=100-15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("USB cable")){
            int balance=100-10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("Headphones")){
            int balance=100-30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("Pants")){
            int balance=100-50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("Hat")){
            int balance=100-25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("Socks")){
            int balance=100-5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("Blanket")){
            int balance=100-60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("Pillow")){
            int balance=100-40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else{
            System.out.println("Invalid item");
        }
    }
}
