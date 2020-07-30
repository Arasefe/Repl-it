package switchStatement;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int statusCode = scan.nextInt();
        String result = "";
        switch (statusCode) {
            case 200:
                result = 200 + ", OK (fulfilled)";
                break;
            case 401:
                result = 401 + ", unauthorized";
                break;
            case 403:
                result = 403 + ", forbidden";
                break;
            case 404:
                result = 404 + ", not found";
                break;
            case 500:
                result = 500 + ", server error";
                break;
            default:
                result = "not supported status code";

        }
        System.out.println(result);
    }
}
