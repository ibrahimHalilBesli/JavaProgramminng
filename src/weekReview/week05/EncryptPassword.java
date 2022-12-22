package weekReview.week05;

public class EncryptPassword {
    /*
        Task 9: Given a string password. Encrypt with "x" a given password and print.
    Hint: do with for loop
     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
         */
    public static void main(String[] args) {

        String password = "cydeo";
        char encrypt = 'x';
        String output = "";

        for (int i = 0; i < password.length(); i++) {

            output+= ""+password.charAt(i)+encrypt;


        }
        System.out.println(output);
    }

}
