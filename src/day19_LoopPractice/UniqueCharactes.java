package day19_LoopPractice;

public class UniqueCharactes {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";



        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int count = 0; //represents the frequency of the ch
            for (int j = 0; j <str.length() ; j++) {
                char each = str.charAt(j);
                if (ch==each){
                    count++;

                }
            }
            if (count !=1){
                continue;
            }
            result += ch;
        }
        System.out.println(result);
    }
}
