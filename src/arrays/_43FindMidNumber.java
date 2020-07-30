package arrays;

import java.util.Scanner;

public class _43FindMidNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scan.nextInt();
        System.out.println("Enter second number:");
        int num2=scan.nextInt();
        System.out.println("Enter third number:");
        int num3=scan.nextInt();
        int mediumValue=0;
        if(num1<num2&&num1<num3&&num2<num3){
            mediumValue=num2;
            System.out.println("Medium value is: "+mediumValue);
        }else if(num1<num2&&num1<num3&&num2>num3){
            mediumValue=num3;
            System.out.println("Medium value is: "+mediumValue);
        }else if(num1>num2&&num1<num3&&num2<num3){
            mediumValue=num1;
            System.out.println("Medium value is: "+mediumValue);
        }else if(num1<num2&&num1>num3&&num2>num3){
            mediumValue=num1;
            System.out.println("Medium value is: "+mediumValue);
        }else if(num1>num2&&num1>num3&&num2<num3){
            mediumValue=num3;
            System.out.println("Medium value is: "+mediumValue);
        }else if(num1>num2&&num1>num3&&num2>num3){
            mediumValue=num2;
            System.out.println("Medium value is: "+mediumValue);
        }
    }
}
