package weekReview.week06;

public class T6_HiddenSentence {

    /*
    Task 6: Given a sentence which is ended with "." included lettters, numbers, special charecters and then find hidden sentence.
    input:
            String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
    output:
    You are the best guys

     */

    public static void main(String[] args) {
        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
        String temp = "";

        String word = "Xana";

        char beg = word.charAt(0);
        char end = word.charAt(word.length()-1);





        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i)=='.'){
                break;
            }
            System.out.println();


            char ch = sentence.charAt(i);
            if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch==' '){
                temp+=ch;
            }

        }
        System.out.println(temp);
        String x = "halil";
        System.out.println(x.substring(0, 5));

    }
}
