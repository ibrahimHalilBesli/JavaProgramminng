package weekReview.week06;

public class WarmUpTask {

    public static void main(String[] args) {

        String word = "Code";

        String temp="";

        for (int i = 0; i < word.length(); i++) {

            String str = word.substring(0,i);
           // System.out.print(str);

            temp+=str;
        }
        System.out.println(temp+word);

    }

}
