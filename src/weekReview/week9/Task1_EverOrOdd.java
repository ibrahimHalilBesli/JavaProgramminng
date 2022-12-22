package weekReview.week9;

public class Task1_EverOrOdd {


    public static void main(String[] args) {

        checkEvenOrOdd(10);
        checkEvenOrOdd(21);

    }

    public static void checkEvenOrOdd(int num1){

        if (num1%2==0){
            System.out.println(num1+" is Even");
        }else {
            System.out.println(num1+ " is Odd");
        }


    }


}
