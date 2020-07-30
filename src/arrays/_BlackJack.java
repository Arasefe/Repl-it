package arrays;

import java.util.Scanner;

public class _BlackJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("house: ");
        int house = s.nextInt();
        System.out.println("player: ");
        int player = s.nextInt();

        String str="";
        if(house+player>21){
            str="bust";
        }else if(house>player){
            str="player loss";
        }else if(player==house){
            str="its a tie";
        }else if(player>house){
            str="player wins";
        }
        System.out.println(str);

    }
}
