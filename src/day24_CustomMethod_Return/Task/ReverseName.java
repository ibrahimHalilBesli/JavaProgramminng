package day24_CustomMethod_Return.Task;

public class ReverseName {
/*
3. create a method named reverse that passes one string parameter,
            the method can return the reversed string
            Ex:
            str = "Java";
            reverse(str) ==> avaJ
 */
    public static void main(String[] args) {

        String str = "Java";

        String reverse1 =reverse(str);
        System.out.println(reverse1);


    }

    private static String reverse(String str) {

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {

             reverse +=""+ str.charAt(i);



        }
        return reverse;
    }
}
