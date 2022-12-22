package day24_CustomMethod_Return.Task;

public class FrequencyOfWord {

    /*
    1.  create a method named frequencyOfWord that passes two
            parameters: string sentence and String word, then returns the frequency of
            word from the sentence
            Ex:
            sentence = "Java java java python python"
            word = "java";
            frequencyOfWord(sentence, word) ==>  3

    */

    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word ="java";

        int count = frequencyWord(sentence,word);
        System.out.println(count);


    }

    public static int frequencyWord(String sentence, String word) {

        int counter = 0;

        while (sentence.contains(word)) {
            sentence= sentence.replaceFirst(word,"");
            counter++;
        }
        return counter;

        }


    }


