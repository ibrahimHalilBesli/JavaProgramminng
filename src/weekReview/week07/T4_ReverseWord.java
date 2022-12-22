package weekReview.week07;

public class T4_ReverseWord {

    /*
     Task 4: Reverse each word in a sentence.

    input:

    String str = "Adam come here";

    output:

    madA emoc ereh
     */

    public static void main(String[] args) {

        String str = "Adam come here";

        String temp = "";
        String space = " ";


        for (int i = 0; i < str.length() - 3; i++) {

            String word = str.substring(i, i + 4);


            if (!word.contains(space)) {
                for (int j = word.length() - 1; j >= 0; j--) {

                    temp += "" + word.charAt(j);
                }

                temp += " ";
            }


        }
        System.out.println("temp = " + temp);
    }
}