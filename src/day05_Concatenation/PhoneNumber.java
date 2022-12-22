package day05_Concatenation;

public class PhoneNumber {
    /*
    countrycode = 1
    areacode = 703
    localNumber = 4512625
     */
    public static void main(String[] args) {

        String countryCode = "1",
                areaCode = "(703)",
                localNumber = "4512625";
        System.out.println("+"+countryCode+areaCode+"-"+localNumber);
    }
}
