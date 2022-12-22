package day23_CustomMethod.Task;

public class FullName {

    public static void main(String[] args) {

        fullName("RaMaZaaaN","Besli");

    }

    /*
    16.  write a method that can print out the full name of a person in
regular format
ex:
fullName("cYdEo", "SCHOOL");
output:
"Cydeo School"
     */

    public static void fullName(String name, String lastName){

        name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(name+" "+lastName);



    }


}
