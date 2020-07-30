package arrays;

public class _71EvenOddNumbers {
    public static void main(String[] args) {
        oddNumbers();
        evenNumbers();
    }

    public static void oddNumbers(){
        for(int i=11;i<=121;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void evenNumbers(){
        for(int i=2;i<=100;i++){
            if(i%2==0){
                System.out.print(i+",");
            }
        }
    }
}
