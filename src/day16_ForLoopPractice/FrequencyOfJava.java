package day16_ForLoopPractice;

public class FrequencyOfJava {

    public static void main(String[] args) {

        String sentence = "JavaJava";
        int contance = 0;
       

        for (int i = 0; i <=sentence.length()-4 ; i++) {
           String str = sentence.substring(i,i+4);
           //Java ava , va J, a Ja,

             if (str.equals("Java")){
                 contance++;
             }  else {
                 continue;
             }
        }

        System.out.println(contance);
    }
}
