package day10_NestedIf;

public class IfStatementsWithoutcurlyBraces {
    public static void main(String[] args) {
        int number = 15;
        String result = ""; //Temporary


        if (number == 1)
            result = "Januar";

        else if (number == 2)
            result = "February";

        else if (number == 3)
            result = "March";

        else if (number == 4)
            result = "April";

        else if (number == 5)
            result = "May";

        else if (number == 6)
            result = "June";

        else if (number == 7)
            result = "July";

        else if (number == 8)
            result = "August";

        else if (number == 9)
            result = "September";
        else if (number == 10)
            result = "Oktober";

        else if (number == 11)
            result = "November";

        else
            result = "December";

        System.out.println(result);
    }
}
