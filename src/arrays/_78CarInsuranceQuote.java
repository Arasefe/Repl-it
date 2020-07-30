package arrays;

import java.util.Scanner;

public class _78CarInsuranceQuote {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String hasDriverLicense = scan.next();
        if (hasDriverLicense.equalsIgnoreCase("No")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        // if (hasDriverLicense.equalsIgnoreCase("Yes")) {
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if (vehicleOwnership.equalsIgnoreCase("Owned")) {
            premium += 10;
        } else {
            premium += 20;
        }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("Business")) {
            premium += 50;
        } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10;
        } else if (vehicleUsage.equalsIgnoreCase("Commute")) {
            premium += 20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            int addForDay = 5 * daysDrivenToWorkOrSchool;
            premium += addForDay;
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            int addForMile = milesToWorkOrSchool;
            premium += addForMile;
        }
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age >= 16 && age < 18) {
            premium *= premium;
        } else if (age >= 18 && age <= 21) {
            premium *= 6;
        } else if (age > 21 && age < 25) {
            premium *= 2;
        }

        System.out.println("How many years you've been driving?");
        int drivingDuration = scan.nextInt();
        if (drivingDuration > 0 || drivingDuration - age >= 16) {
            int expEffect = drivingDuration * 5;
            premium -= expEffect;
        } else {
            System.out.println("Invalid data!");
        }


        System.out.println("Have you had any accidents in the last 5 years?");
        String hasAccident = scan.next();
        scan.nextLine();
        if (hasAccident.equalsIgnoreCase("Yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium += accidentsAmount * premium * 0.2;
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        scan.nextLine();
        if (continuousInsurance.equalsIgnoreCase("No")) {
            premium *= 2;
        } else if (continuousInsurance.equalsIgnoreCase("Yes"))
            premium = premium;

        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if (education.equalsIgnoreCase("Less Than High School")) {
            premium += premium * 5 / 100;
            education = "LESSTHANHIGHSCHOOL";
        } else if (education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")) {
            premium -= premium * 5 / 100;
        } else if (education.equals("Doctors")) {
            premium -= premium * 10 / 100;
        }
        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        //education=education.substring(0,4)+education.substring(5,9)+education.substring(10,14)+education.substring(15);

        referenceNumber = name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode + education;
        referenceNumber = referenceNumber.toUpperCase();
        System.out.println("Reference number: " + referenceNumber);
    }
}

