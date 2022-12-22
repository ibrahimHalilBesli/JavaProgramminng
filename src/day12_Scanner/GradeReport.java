package day12_Scanner;
     import java.util.Scanner;
public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Score");

        int score = scan.nextInt();

        String result = "";

        if (score>= 0 && score<= 100){

           result =  (score>= 90)? "A" :(score>= 80 )? "B" :(score>= 70)? "D" : "F";


        }   else {
            System.out.println("Invalid Score");
        }
        System.out.println(result);

        scan.close();
        
    }
}
