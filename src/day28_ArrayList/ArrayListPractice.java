package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2);

        }
        System.out.println(list);

        System.out.println("-----------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Musto");
        employees.add("Fido");
        employees.add("Ramo");
        employees.add("Xalo");
        employees.add("Hilo");
        employees.add("Zeyno");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(employees.size()-1);

        System.out.println("Kardesler: "+employees);

       boolean r1 =  employees.remove("Ramo");
        System.out.println("Ailenin zeka küpleri: "+employees);

        System.out.println("r1 = " + r1);
    }
}
