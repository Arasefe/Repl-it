package arrays;

import java.util.Scanner;

public class _56LapTopConfiguration {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        screenType = scan.nextLine();
        if (screenType.equalsIgnoreCase("13.3")) {
            price += 200;
        } else if (screenType.equalsIgnoreCase("15.0")) {
            price += 300;
        } else if (screenType.equalsIgnoreCase("17.3")) {
            price += 400;
        }

        System.out.println("Select CPU type:");
        cpu = scan.next();
        if (cpu.equalsIgnoreCase("i3")) {
            price += 150;
        } else if (cpu.equalsIgnoreCase("i5")) {
            price += 250;
        } else if (cpu.equalsIgnoreCase("i7")) {
            price += 350;
        }

        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        int ramPrice = 50 * (ram / 4);
        price += ramPrice;

        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");

        if (storageType.equalsIgnoreCase("SSD")) {
            int memory = scan.nextInt();
            int storagePrice = (memory / 500 )* 100;
            price += storagePrice;
        }else if (storageType.equalsIgnoreCase("HDD")) {
            int memory = scan.nextInt();
            int storagePrice = (memory / 500) * 50;
            price += storagePrice;
        }

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();
        if (resolution.equalsIgnoreCase("FULLHD")) {
            price += 100;
        } else if (resolution.equalsIgnoreCase("4K")) {
            price += 200;
        }
        System.out.println("Laptop price is: $" + price);
    }
}
