package day17_While_DoWhile;


import java.util.ArrayList;
import java.util.Scanner;

public class MarriagePropasal {


    public static String search(ArrayList<String> strs, String find) {
        // complete the method
        String res = "";
        for (String eachWord : strs) {

            if (eachWord.contains(find)) {
                res = eachWord;
                break;
            } else {
                res = "search failed";
            }
        }
        return res;




    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }

}