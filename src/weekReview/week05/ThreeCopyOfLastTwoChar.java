package weekReview.week05;

public class ThreeCopyOfLastTwoChar {

    /* My Way
    public static void main(String[] args) {

        String st1 = "Hello";
        int lastInd = st1.length()-1;
        int lastTwoIn= st1.length()-2;

        String st2 =""+st1.charAt(lastTwoIn)+st1.charAt(lastInd);

        System.out.println(st2+st2+st2);
    }

     */
    public static void main(String[] args) {
        /*
        Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.
input:Hello
output:lololo
      Hint: The string length will be at least 2.
         */
        String word = "Hello";
        int indexOfLastChar = word.length() - 1; //index of o
        int indexOfSecondFromLast=word.length()-2;//index of l
        char last=word.charAt(indexOfLastChar);
        char beforeLast=word.charAt(indexOfSecondFromLast);
        String lastTwo=""+beforeLast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);


    }
}
