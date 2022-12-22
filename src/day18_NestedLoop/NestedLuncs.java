package day18_NestedLoop;

public class NestedLuncs {
    public static void main(String[] args) {
        
        char c = '*';

        for (int i = 0; i <10 ; i++) {

            System.out.println(c);

            for (int j = 0; j <1 ; j++) {
                        j++;
                System.out.print(c);
            }
        }
    }
}
