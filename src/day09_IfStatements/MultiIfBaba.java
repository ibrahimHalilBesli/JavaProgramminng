package day09_IfStatements;

public class MultiIfBaba {

    public static void main(String[] args) {

        int a = 10;
        int b = 20,
                c = 30;

        if (a<b){
            System.out.println(a);
        } else if (a<c) {
            System.out.println(a);

        } else if (b<c) {
            System.out.println(b);
        }
    }
}
