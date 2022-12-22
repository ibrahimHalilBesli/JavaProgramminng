package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 60,
                c = 30;

        boolean alsMedian = (a > b && a < c) || (a > c && a < b);

        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);

        boolean cIsMedian = !alsMedian && !bIsMedian;

        if (alsMedian) {
            System.out.println(a+ " is the median Number");
        }
        if (bIsMedian) {
            System.out.println(b+" is the median number");
        }
        if (cIsMedian) {

            System.out.println(c+ " is the median number");

            

        }
    }
}
