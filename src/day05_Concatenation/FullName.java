package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Umut";
        String lastName = "Besli";
        int age = 35;

        String fullName = firstName+ " " +lastName;
        String jobtitle = "Senior SDET";
        String conpanyName = "Apple Inc";
        double salary = 100000.58;


        System.out.println("Full name of the person is = " + fullName);

        //___ is __ years old

        System.out.println(fullName+" is "+age+" years old");

        //FullName is JobTitle, works at ConpanyName salary is salary

        System.out.println(fullName+" is "+jobtitle+", works at "+conpanyName+", salary is "+ salary);


    }
}
