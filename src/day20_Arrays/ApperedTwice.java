package day20_Arrays;

public class ApperedTwice {

    public static void main(String[] args) {
        char[] chars = {'A','A','A','B','C','C','D','D','D'};
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int frequency=0;
            for (int i1 = 0; i1 < chars.length; i1++) {
                if (chars[i1]==ch){
                    frequency++;
                }
            }
            if (frequency==2){
                System.out.println(ch);
            }
        }

    }
}
