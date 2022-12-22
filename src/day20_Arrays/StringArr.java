package day20_Arrays;

public class StringArr {
    /*
    create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output:
avaJ
nohtyp
#c
     */

    public static void main(String[] args) {

        String[] arr = {"Halil", "Java", "Pyhton", "Mavi", "Salam"};

        for (int i = arr.length-1; i >= 0; i--) {

            for (int j = arr[i].length()-1; j >= 0; j--) {

                System.out.print(""+arr[i].charAt(j));
            }
            System.out.println("");
        }

    }
}

