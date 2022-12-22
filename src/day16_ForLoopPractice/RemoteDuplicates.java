package day16_ForLoopPractice;

public class RemoteDuplicates {

    public static void main(String[] args) {

        String str = "aabbcc";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {    //in str out abc
            String ch = "" + str.charAt(i);
            if (!result.contains(ch)) {
                result += ch;
            }

        }

        System.out.println(result);
    }
}
