package day15_ForLoop;

public class CalculateTotalNum {

    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i<=100; i++){
            total +=i;
        }
        System.out.println("total = " + total);

        int sum = 0;
        for (int i = 1; i <= 50; i++){
            sum+=i;

        }
        System.out.println("sum = " + sum);



    }

}
