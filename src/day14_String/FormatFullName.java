package day14_String;

public class FormatFullName {

    public static void main(String[] args) {
        String firstName = "cyDEo",
                lastName = "SCHOOL";

        firstName = (""+firstName.charAt(0)).toUpperCase() +firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
           String fullName=  firstName+lastName;
        System.out.println(lastName);
        System.out.println(fullName);


    }
}
