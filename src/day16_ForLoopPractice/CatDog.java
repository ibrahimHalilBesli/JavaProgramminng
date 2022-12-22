package day16_ForLoopPractice;

public class CatDog {

    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt";
        int count = 0;
        int countb = 0;

        for (int i = 0; i <= sentence.length() - 3; i++) {
            String eachCat = sentence.substring(i, i + 3);

            if (eachCat.equalsIgnoreCase("cat")) {
                count++;
                return;

            } else if (eachCat.equalsIgnoreCase("dog")) {
                countb++;
            }

        }
        System.out.println(count==countb);
    }
}
