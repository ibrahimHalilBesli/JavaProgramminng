package weekReview.week10;

public class Task6Fibonacci {



    /*
Task 6 :  Fibonacci
				Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
				Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
				    Ex:
				        Input:
				            8
				        Output:
				           1, 1, 2, 3, 5, 8, 13, 21
				            1- Create one method and only print the numbers
				            2- You will return the numbers
				            3- Yuo will put that numbers into the array then you will return it
				         */



    // Function to find the fibonacci Series
    public static void
    main(String args[]) {
        // Given Number N
        int number = 8;


        printNum(number);

    }

    public static void printNum(int number) {


        // Print first 8 term
        for (int i = 1; i <= number; i++)
            System.out.print(fib(i) + " ");

    }

    public static int fib(int n) {

        // Declare an array to store
        // Fibonacci numbers.
        // 1 extra to handle case, n = 0
        int f[] = new int[n + 2];

        int i;

        // 0th and 1st number of
        // the series are 0 and 1
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {

            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }

        // Nth Fibonacci Number
        return f[n];
    }


}