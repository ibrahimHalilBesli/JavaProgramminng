package day24_CustomMethod_Return.Task;

public class Palindrome {
    /*
    4. By using the reverse method above to create another method named
            isPalindrome  that passes a String parameter, the method returns true if
            the string is palindrome, otherwise returns false
            Ex:
            str = "Level"
            isPalindrome(str) ===> true
     */

    public static void main(String[] args) {

        String str = "Level";

        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String str) {

        boolean baba = false;

        for (int i = 0; i < str.length(); i++) {

            int lastInd= str.length()-1;
             baba = str.charAt(i)==str.charAt(lastInd--);
        }


        return baba;


    }
}
