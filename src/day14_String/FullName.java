package day14_String;

public class FullName {

    public static void main(String[] args) {

        String firstname = "cyDEo",
                lastname = "SCHOOL";


       firstname= firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();

        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();


        System.out.println(firstname);
        System.out.println(lastname);
    }
}
