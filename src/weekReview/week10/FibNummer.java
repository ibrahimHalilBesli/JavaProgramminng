package weekReview.week10;

public class FibNummer {

    public static void main(String[] args) {

        int i = 8;
        int fibnummer = 1;

        for (int i1 = 0; i1 < i; i1++) {

            fibnummer=i1+fibnummer;

            System.out.println(fibnummer);

        }
    }
}
