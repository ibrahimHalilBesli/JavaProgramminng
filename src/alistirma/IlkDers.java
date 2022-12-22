package alistirma;

import java.util.Scanner;

public class IlkDers {
    public static void main(String[] args) {

        int num = 10;
       String day = "tueday";

        switch (day){
            case "sunday":
                num++;
            case "monday":
                num +=5;
                break;
            case "tueday":
            case "wedneyday":
                 num +=10;
            case "thursday":
                num +=5;
                break;
            case "friday":
                break;
            case "saturday":
                num--;
                break;
            default:
                num = 0;


        }
        System.out.println(num);
    }
}
                                                      