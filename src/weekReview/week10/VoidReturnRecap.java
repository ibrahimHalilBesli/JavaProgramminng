package weekReview.week10;

public class VoidReturnRecap {

    public static void main(String[] args) {

        add(3,4);

       int result = add(3,4,5);


    }

    private static int add(int i, int i1, int i2) {
        System.out.println(i+i1+i2);

        return i+i1+i2;
    }

    private static void add(int i, int i1) {
       int result = i+i1;
    }
}
