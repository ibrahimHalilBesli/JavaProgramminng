package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Umut","Halil","Fidan","Mustafa","Hilal","Zeynep","Mustafa"));

        employees.retainAll(Arrays.asList("Mustafa","Fidan"));

        System.out.println(employees);

        System.out.println("----------------------------------------");

        String[] names = {"Umut","Halil","Fidan","Mustafa","Hilal","Zeynep","Mustafa"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p-> p.charAt(0)=='H');

        System.out.println(list);

        names=list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));
    }
}
