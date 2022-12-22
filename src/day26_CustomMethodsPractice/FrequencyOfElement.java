package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {

        int[] arr = {1,1,11,1,2,2,3,4,5,6,1};
        int n = frequencyOfElement(arr,1);

        System.out.println(n);

        String[] arr1={"B","C","D"};
        String el = "B";
        int n1 = frequencyOfElement(arr1,el);
        System.out.println(n1);
    }



    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }
}
