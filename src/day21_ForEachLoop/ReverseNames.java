package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit","Ali Kilic","Hulya Keles","Simen Kaya"};

        for (String each : names) {
            String reversed = "";

            for (int length = each.length()-1; length >=0; length--) {

                reversed += each.charAt(length);


            }
            System.out.println(reversed);
        }
    }
}
