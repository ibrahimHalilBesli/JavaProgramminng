package day10_NestedIf;

public class BiggerNum {
    public static void main(String[] args) {

        int n1 = 20,
                n2 = 10,
                n3 = 30;
        String bigger = "";

        if (n1 > n2 && n1 > n3) {
            bigger = "n1 is bigger";
        } else if (n2 > n1 && n2 > n3) {
            bigger = "n2 is bigger";
        } else if (n3 > n1 && n3 > n2) {
            bigger = "n3 is bigger";
        }
        System.out.println(bigger);
    }
}
