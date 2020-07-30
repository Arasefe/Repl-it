package arrays;

import java.util.Scanner;

public class _51TipCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Split:");
        String split=scan.next();
        System.out.println("Number of people:");
        int numCustomer=scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount=scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality=scan.next();
        double tip=0;
        if(split.equals("Yes")){
            if(serviceQuality.equalsIgnoreCase("poor")){
                tip=checkAmount*5/100;
            }else if(serviceQuality.equalsIgnoreCase("Fair")){
                tip=checkAmount*10/100;
            }else if(serviceQuality.equalsIgnoreCase("Good")){
                tip=checkAmount*15/100;
            }else if(serviceQuality.equalsIgnoreCase("Great")){
                tip=checkAmount*20/100;
            }else if(serviceQuality.equalsIgnoreCase("Excellent")){
                tip=checkAmount*25/100;
            }
            String str="";
            for(int i=1;i<=numCustomer;i++){
                str+='&';
            }
            System.out.println("Number of people entered: "+str);
            System.out.println("Total to pay: "+(checkAmount+tip));
            System.out.println("Total tip: "+tip);
            System.out.println("Total per person: "+((checkAmount+tip)/numCustomer));
            System.out.println("Tip per person: "+(tip/numCustomer));
        }
    }
}
