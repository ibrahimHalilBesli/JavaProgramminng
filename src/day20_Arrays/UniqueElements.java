package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String []words = {"Java", "Java", "CQQ"};

        for (int i = 0; i < words.length; i++) {
            String element = words[i];
            int frequency = 0;
            for (int i1 = 0; i1 < words.length; i1++) {
                if (words[i1].equals(element)){
                    frequency++;

                }
            }
            if (frequency==1){
                System.out.println("element = " + element);
            }
        }
    }
}
