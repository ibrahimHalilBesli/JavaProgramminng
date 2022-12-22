package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {
        /*
        int: for integers
        double: for decimals
        char: for single characters,
        boolean: true/false
         */

        //age: 38 years old
        byte age = 38;

        //weight: 160 pounds
        //byte weight = 160; //160 is out of byte' range
        //byte num =-129; // -129 is out of byte' range

        short weight = 160;

        //salary: 100000$
        //short salary = 100000;

        int salary = 100_000; // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;

        //tax: 0.26
        float tax = 0.25F;

        double PI = 3.14;

        //#    ASCII TABLE
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        
        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        char gender ='F';

        char grade = 'F';

        char yesNo = 'Y';

        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        //String name = "john";

        System.out.println("name = " + name);
        System.out.println("city = " + city);

       String first_name$ = "Muhtar";
        System.out.println("first_name$ = " + first_name$);





        




    }
}
