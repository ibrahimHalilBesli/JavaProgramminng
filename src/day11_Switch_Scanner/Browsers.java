package day11_Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browserName = "chrome";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";

        if (validBrowser) {
            /*
            if (browserName == "chrome") {
                result = "Chrome Browser is selected";
            } else if (browserName == "firefox") {
                result = "Firefox Browser is selected";
            } else if (browserName == "opera") {
                result = "Opera Browser is selected";

            } else if (browserName == "safaro") {
                result = "Safari Browser is selected";

            } else {
                result = "Edge Browser is selected";
            }

             */
            switch (browserName){
                case "chrome":
                    result= "Chrome is selected";
                    break;
                case "firefox":
                    result="Firefox is selected";
                    break;
                case "opera":
                    result="Opera is selected";
                    break;
                case "safari":
                    result= "Safari is selected";
                    break;
                case "edge":
                    result="Edge is selected";
                    break;
            }

        } else {
            result = "Invalid Browser Name";
        }
        System.out.println(result);
    }


}

