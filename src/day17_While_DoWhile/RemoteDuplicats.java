package day17_While_DoWhile;

public class RemoteDuplicats {

    public static void main(String[] args) {

        String str = "AABBCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.contains("" + ch)) {
                //break; //exit
                continue; // skip
            }
            result += ch;

        }
        System.out.println(result);
    }
}
