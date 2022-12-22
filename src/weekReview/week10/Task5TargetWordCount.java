package weekReview.week10;

public class Task5TargetWordCount {
     /*
    Task 5 : Target Words
					Given an Array of Strings and a target word (String) print how many times the target word is in the Array
					Ex:
					Input:
						"java", "html", "css", "java", "javascript", "selenium"
						Target: java
						Output: 2
     */

    public static void main(String[] args) {


        String[] arr = { "java", "html", "css", "java", "javascript", "selenium"};

        String target= "java";


        int count = getWordCount(arr,target);

        System.out.println(count );



    }

    public   static int getWordCount(String[] arr, String target) {
        int count = 0;


        for (String each : arr) {
            if (each.equals(target)){

                count++;
            }
        }

        return count;
    }
}
