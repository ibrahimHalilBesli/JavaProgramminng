package day13_String;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split  (Yes or No)");
        String yesOrNo=scan.next().toLowerCase();
        yesOrNo.equals("Yes"+"No");

        System.out.println("Enter the number of people");
        int numberOfPeople = scan.nextInt();

        System.out.println("Enter the check amount");
        int checkAmount = scan.nextInt();

        System.out.println("How was the service quality"+"\n(Excellent/Great/Good/Fair/Poor");
        String quality = scan.next();
        quality.equalsIgnoreCase("");

        double result = 0;


        switch (quality){
            case "Poor":
              result= checkAmount*0.05;
              break;
            case "Fair":
                result=checkAmount*0.1;
                break;
            case "Good":
                result=checkAmount*0.15;
                break;
            case "Great":
                result= checkAmount*0.20;
                break;
            case "Excellent":
                result=checkAmount*0.25;
                break;


        }

     double totalPay = checkAmount+result;


        System.out.println("Number of people entered: "+numberOfPeople);
        System.out.println("Total to pay: "+totalPay);
        System.out.println("total tip: "+result);
        System.out.println("Total per person: "+totalPay/numberOfPeople);
        System.out.println("Tip per person: "+(result/numberOfPeople));



            scan.close();



    }

}
