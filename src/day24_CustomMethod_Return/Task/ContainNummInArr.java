package day24_CustomMethod_Return.Task;

public class ContainNummInArr {

    /*
     9. Create a method named contains that passes one integer array and
            one integer parameters, the method returns true if the given integer is
            contained in the given array, otherwise returns false
            Ex:
            arr = {1,2,3,4,5,6,7};
            num = 10;
            contains(arr, num) ===>
            false

     */

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        int num = 5;

        boolean baba = contains(arr,num);
        System.out.println(baba);

    }

    public static boolean contains(int[] arr, int num) {

        boolean baba = false;

        for (int each : arr) {

            if (each==num){

                baba= true;
            }
        }
        return baba;

    }
}
