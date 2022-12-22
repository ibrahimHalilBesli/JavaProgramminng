package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Age");
        int age = scan.nextInt();

        System.out.println("Enter your Gender");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter your fullName");
        String fullName = scan.nextLine();

        System.out.println("Enter your Phone number");
        long phoneNumber = scan.nextLong();

        System.out.println("Enter your zipCode");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Schoolname");
        String schoolName = scan.nextLine();

        System.out.println("Enter your CityName");
        String city = scan.nextLine();

        System.out.println("Enter your State name");
        String state = scan.next();

        System.out.println("Enter your building number");
        int buildungsNum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street Name");
        String streetNam = scan.nextLine();



        System.out.println("FullName = " + fullName);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("PhoneNumber = " + phoneNumber);
        System.out.println("Addres: \n\t"+buildungsNum+" "+streetNam+"\n\t "+city+", "+state+" "+zipCode);
        System.out.println("SchoolName = " + schoolName);

        scan.close();


    }
}
