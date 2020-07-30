package arrays;

public class _Assessment4 {
    public static void main(String[] args) {

        System.out.println(appearsTwice("Aras", "Aras seni cok Aras seviyorum"));
    }


    public static boolean appearsTwice(String target, String sentence) {


        int count = 0;
        for (int i=0;i<=sentence.length()-7;i++) {

            if (sentence.substring(i, i + 7).equals(target)) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
        }
    }

