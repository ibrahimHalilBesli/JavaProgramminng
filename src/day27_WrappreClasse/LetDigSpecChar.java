package day27_WrappreClasse;

public class LetDigSpecChar {

    /*
       3. Write a program that can retrieve the letters, digits and special
        characters from the string
        Ex:
        str = "Wooden Spoon!"
        output:
        letters= "WoodenSpoon";
        Digits = "";
        specialChars = " !";
     *

     */


    public static void main(String[] args) {
        String name= "Cydeo0=.ScH@@L";

        specialLetDig(name);
    }



    public static void specialLetDig(String str) {

        char[] ch = str.toCharArray();

        String letters = "";
        String digits = "",
                specialChar = "";


        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(Character.isLetter(each)){
                letters += each;
            }else if(Character.isDigit(each)){
                digits += each;
            }else{
                specialChar += each;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);
    }
    }