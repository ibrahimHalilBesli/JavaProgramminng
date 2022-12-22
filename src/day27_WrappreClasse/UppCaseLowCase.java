package day27_WrappreClasse;

public class UppCaseLowCase {
    /*
     4. Write program that returns true if the total number of upper case
        characters are equal to total number of Lowercase characters of a
        string
        Ex:
        str = "JAVA java";
        output:
        true
     */

    public static void main(String[] args) {

        String str = "JAVA java";



        boolean upLow = upEquLow(str);

        System.out.println(upLow);
    }

    public static boolean upEquLow(String str) {


        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(Character.isUpperCase(each)){
                countUpper++;
            }

            if(Character.isLowerCase(each)){
                countLower++;
            }

        }

        boolean result = countLower == countUpper;

        return result;

    }
}
