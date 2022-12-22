package day14_String;

public class StringMethod5 {

    public static void main(String[] args) {

        String str = "        ";
        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

        String str2 = "Cydeo    ";
        System.out.println(str2.isBlank());

        System.out.println("--------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));   //false
        System.out.println(s1.equalsIgnoreCase(s2));   //true

        System.out.println("YeS".equalsIgnoreCase("Yes"));

        System.out.println("--------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");  //false
        boolean hasJava = sentence.contains("Java");   //true
        boolean hasJava2 = sentence.contains("java");  //false
        boolean hasJava3 = sentence.toLowerCase().contains("java");  //true
        boolean r3 = sentence.contains("java") || sentence.contains("Java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("----------------------------");

        String a = "Wooden";
        String b = "Spoon";

        a.contains(b.substring(2));
        



       boolean x =  a.startsWith("Woo");
        boolean y = b.startsWith("S");
        boolean z = a.toLowerCase().startsWith("wooden");
        boolean q = b.endsWith("oon");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(q);



    }
}
