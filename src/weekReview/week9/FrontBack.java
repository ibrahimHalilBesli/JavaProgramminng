package weekReview.week9;

public class FrontBack {

    /*
     Task 5: Write a method that return a new string where the first and last chars have been exchanged.
                         frontBack("code") → "eodc"
                         frontBack("a") → "a"
                         frontBack("ab") → "ba"
     */
    public static void main(String[] args) {


        String result = frontBack("code"),
                result2 = frontBack("Ramazan"),
                result3 = frontBack("Fidan");


        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static String frontBack(String code) {

        String result = "";

        for (int i = code.length()-1; i>=0 ; i--) {

           String reverse =""+code.charAt(i);
           result+=reverse;

        }


        return result;
    }
}
