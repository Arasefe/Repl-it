package arrays;

import java.util.Scanner;

public class _75AlejandroII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();


        String str="";
        if(a.contains("project")&& (a.contains("alejandro"))){
            str="read this mail";
        }else{
            str="dont read";
        }
        System.out.println(str);

    }
}
