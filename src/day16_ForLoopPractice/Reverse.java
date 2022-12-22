package day16_ForLoopPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String result = "";

        for (int i = str.length()-1; i >= 0; i--){      //i: index numbers of str (starting last index to index 0 )

            result += str.charAt(i);
        }

        System.out.println(result);
    }
}
