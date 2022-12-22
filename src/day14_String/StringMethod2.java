package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Pyhton"); // Pyhton is fun, i love learning PYhton

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "Halobesli@yahoo.com";
        email = email.replace("yahoo", "gmail");      //Halobesli@gmail.com

        System.out.println("email = " + email);

        String sentence = "Java Java Pyhton Pyhton C# C# C++ C++ Pyhton Pyhton Pyhton Pyhton";
        String sentence2 = sentence.replace("Pyhton", "");
        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        String s1 = s.replace("Dog", "Cat");
        String s2 = s.replaceFirst("Dog", "Cat");

        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Pyhton");

        System.out.println("result = " + result);

        String result2 = "Java";
        result2 = result2.replaceFirst("a","e");

        System.out.println("result2 = " + result2);



    }
}
