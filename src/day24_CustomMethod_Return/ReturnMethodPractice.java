package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        //find the max number between 100&200
        int maxNum= max(100,200);

        System.out.println(maxNum);

        //multiply the max number by2
        int multiplication = maxNum*2;
        System.out.println(multiplication);
    }

    public static int max(int a, int b){

        int result = 0;
        if (a>b){
            result=a;

        }else {
            result=b;
        }

        return result;
    }


}
