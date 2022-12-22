package weekReview.week06;

public class T4_CountWordWithWhile {

    /*
    Task 4: Given a sentence which is string find word how many times repeats in it.

    Hint: use replaceFirst() with while loop

    input:
    *                                String str="Java is java in everywhere is Java";
    *                                String word="Java";
    output:3
     */

    public static void main(String[] args) {
        String str = "Java is Java in everywhere is Java";
        String word = "Java";
        int cout = 0;

        while (str.contains("Java")){

            cout++;
            str=str.replaceFirst(word,"");

        }

        System.out.println(cout);


    }
}
