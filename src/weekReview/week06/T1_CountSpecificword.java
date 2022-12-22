package weekReview.week06;

public class T1_CountSpecificword {

    /*
    Task 1: Given a sentence which is string find word how many times repeats in it.

    Hint: use substring with for loop

    input:
    *                                String str="Java is java in everywhere is Java";
    *                                String word="Java";
    output:3
     */
    public static void main(String[] args) {

        String str = "Java is java in everywhere is java";
        String word = "Java";

        int count = 0;

        for (int i = 0; i <= str.length() - word.length(); i++) {

            String each = str.substring(i,i+word.length()   );

            if (each.equalsIgnoreCase(word))

                count++; //if we have only one statement after if clouse we dont used {



        }
        System.out.println(count);

    }
}
