package weekReview.week05;

public class StringMethods {

    public static void main(String[] args) {



    //if we want to get specific char.charAt()

    String str = "Adam";

        System.out.println(str.charAt(0));  //first char
        System.out.println(str.charAt(3)); //fourth char


        //if we want to get the length of String length()
        System.out.println(str.length());

        //get the last character
        System.out.println(str.charAt(str.length()-1));

        //in order to make letters lower case toLowercase
        System.out.println(str.toLowerCase());

        //in order to make letters upper case
        System.out.println(str.toUpperCase());

        //in order to remove spaces before and after your string trim()
        String str1 = " Adam  ";
        System.out.println(str.trim());

        //if you want to get index of char or string we need to ise indexOf() method

        String number = "0123456";

        System.out.println(number.indexOf('3'));

        System.out.println(number.indexOf("56"));

        //get the index of 14
        System.out.println(number.indexOf("14")); //  it will return -1 means that there is no 14 in that string

        String sentence = "Java is a programming language";

        System.out.println(sentence.indexOf(" programming "));
        //01234567891011
        String sentence1 = "Java is Java";
        System.out.println(sentence1.indexOf("Java")); // return me 0
        System.out.println(sentence1.lastIndexOf("Java")); //return me 8
        // if we want to replace some part of the string we need to use replace() or replaceFirst()

        String sentence3 = "Java is a hard prog language";
        System.out.println(sentence3.replace("hard", "easy"));
        System.out.println(sentence3.replace("hard", "fun"));

        String sentence4 = "java is not same with java";
        System.out.println(sentence4.replaceFirst("java","Pyhton"));

        //if we want to get some part of the strin we need to use substring()
                  //  01234
        String subs= "Cydeo";
                //get the yde from the subs variable
        System.out.println(subs.substring(1, 4));
        //get the Cy from he subs
        System.out.println(subs.substring(0,2));
        //get the "deo" from subs variable
        System.out.println(subs.substring(2));
        //det the ydeo from subs variable
        System.out.println(subs.substring(1));

        //if we want to multipy(repeat) one word we need to use repeat()

        String str4 = "adam";
        System.out.println(str4.repeat(4));

        // if we want to check our string is empty or not we need to use isEmpty() method
        String emptyWord=""; // isEmpty method is checking length
        System.out.println(emptyWord.isEmpty());

        // if we want to check our string is blank or not we need to use isBlank() method
        String blankWord="   "; // it is checking spaces

        System.out.println(blankWord.isBlank());

        // if we want to compare two string values with exact matching we can use  equals()

        // if we want to compare two string values without exact matching (lower case or upper case) we can use
        // equalsIgnoreCase()

        String str6="Word";
        String str7="word";

        System.out.println(str6.equals(str7)); //false
        System.out.println(str6.equalsIgnoreCase(str7)); //true

        /// startsWith()  method is using for checking the string is starting with given char sequence or not
        // endsWith()  method is using for checking the string is ending with given char sequence or not
        String sentence5= "Java is a good language";
        String word="Java";

        System.out.println(sentence5.startsWith("Java"));
        System.out.println(sentence5.endsWith("language"));

        // contains method is using for checking the given char sequence is in string or not
        String sentence6="Java is Java";


    }
}
