package weekReview.week9;

public class ArraysIntro {

    public static void main(String[] args) {
        // printHello5Times
        printHello5Times();
        // printHello5Times
        printHello5Times();
        // printHello5Times
        printHello5Times();

        //we want to add two number

        int result = sum(5, 6); //11
        //create method quick
        //for windows alt+enter
        //for mac option+enter

        //multiply that number with 2 and show in console
        multiplywith2AndPrint(result);

        System.out.println(sum(20, 30));


    }

    public static void multiplywith2AndPrint(int result) {
        System.out.println(result*2);
    }


    public static int sum(int number1, int number2 ) {
        return   number1+number2;
    }


    public static void printHello5Times() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

    }

}

