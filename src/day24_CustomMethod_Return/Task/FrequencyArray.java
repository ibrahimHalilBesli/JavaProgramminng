package day24_CustomMethod_Return.Task;

public class FrequencyArray {

    /*
    5. create method that accepts one integer array and one integer number
            and returns the frequency of the number
            Ex:
            int[] array ={1,1,1,1,1,2,2};
            frequency(array, 1) ==> 5
     */

    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,2,2};
        int control = 2;

        int count = frequency(array,control);
        System.out.println(count);
    }

    public static int frequency(int[] array, int control) {

        int counter = 0;
        for (int each : array) {

            if (each==control){
                counter++;
            }

        }
        return counter;
    }
}
