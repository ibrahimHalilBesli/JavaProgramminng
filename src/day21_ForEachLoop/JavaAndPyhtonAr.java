package day21_ForEachLoop;

import java.util.Arrays;

public class JavaAndPyhtonAr {

    public static void main(String[] args) {

        String sentences = "java java pyhton java pyhton";
        String[] arr = sentences.split(" ");
        int countJav = 0;
        int countPython = 0;



        for (String each : arr) {
            if (each.equalsIgnoreCase("java")){
                countJav++;
            }else {
                countPython++;
            }
        }

        System.out.println(countJav+" Java and "+countPython+" Python");
    }
}
/*
6. Write a program that can return the number of appearances of
âjavaâ and âpythonâ anywhere in the sentence.
(similar to the task 97 in repl.it, but
this time you MUST use arrays and for each loop)
 */
