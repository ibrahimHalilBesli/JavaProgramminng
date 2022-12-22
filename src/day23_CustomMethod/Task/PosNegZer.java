package day23_CustomMethod.Task;

public class PosNegZer {

    public static void posNegZer(int number){

        String result ="";

        if (number==0){
            result+="Zero";
        } else if (number<0) {
            result+="Negative";
        }else {
            result+="Positive";
        }

        System.out.println("Number is: "+result);
    }
}
