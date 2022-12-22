package day14_String;

public class Practice {
    public static void main(String[] args) {

        String word = "Java Programming Language";

        String s1 = word.substring(word.indexOf("P"),word.lastIndexOf(" "));
        String s2 = word.substring(word.indexOf("L"));
        System.out.println(s1);
        System.out.println(s2);

        String email = "Cydeo.School@gmail.com";
    }

}
