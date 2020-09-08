package arrayList;

import java.util.ArrayList;

public class _196RemoveMethod {
    public static void main(String[] args) {
        ArrayList<Double>list=new ArrayList<>();
        list.add(new Double(6));
        list.add(new Double(2));
        list.add(new Double(3));
        list.add(new Double(1));
        list.add(new Double(9));
        list.add(new Double(2));
        list.add(new Double(5));
        test(list);
    }
    public static void test(ArrayList<Double> dubs){
        dubs.remove(1);
        dubs.remove(3);
        dubs.remove(3);
        System.out.println(dubs);
    }
}
