package weekReview.week10;

public class Task1_FindTheSentence {
 /*
    Task 1 : Find the word
					String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
					Write a method that returns : Welcome To Core Java
     */

    public static void main(String[] args) {


    sentence("W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a");
    }

    private static void sentence(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

           char ch = str.charAt(i);

           /*
           if ('a'<=ch&&ch<='z'||'A'<=ch&&ch<='Z'){  //Character.isLetter(ch)

               result+=ch;
           }

            */

           //if we are talking english letters we can use isAlphabetic()
            //if we are talking other letters we can use isLetter()

            if (Character.isUpperCase(ch)){

                result+= " ";
            }

           if (Character.isAlphabetic(ch)){//||ch==' '
               result+=ch;
           }


        }

        System.out.println(result.trim()); // Bastaki bosluk silinmesi icim trim method
    }


}
