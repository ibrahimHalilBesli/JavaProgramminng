package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Pyhton Pyhton";
        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");

            frequency++;
        }
        System.out.println(frequency);

        String sentence = "cat cat cat dog dog dog Cat Cat Cat";
        sentence = sentence.toLowerCase();

        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");

            countCat++;
        }
        System.out.println(countCat);

        String s = "java java java pyhton pyhton pyhton pyhton";

        int countJava = 0;
        int countPyhton = 0;

        while (s.contains("java") || s.contains("Pyhton")) {
            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countJava++;
            }
            if (s.contains("Pyhton")) {
                s = s.replaceFirst("Pyhton", "");
                countPyhton++;
            }
        }

        System.out.println(countJava);
        System.out.println(countPyhton);
    }
}
