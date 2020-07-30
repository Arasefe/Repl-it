package arrayList;

import java.util.ArrayList;

public class _193CombineArrays {
    public static void main(String[] args) {
        combineRs(new String[]{"Aras","Tulpar","Banu"},new String[]{"Ismail","Efe"});
    }

    public static String combineRs(String[] r1, String[] r2) {
        ArrayList<String> list = new ArrayList<>();


        for(String word:r1){
            list.add(word);
        }
        for(String each:r2){
            list.add(each);
        }
        String result="";
        for(String name:list){
            result+=name;
        }
        return result;
    }
}
