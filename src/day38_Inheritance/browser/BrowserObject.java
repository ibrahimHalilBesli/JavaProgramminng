package day38_Inheritance.browser;

public class BrowserObject {

    public static void main(String[] args) {



        Browser browser = new Browser();


        browser.openBrowser();
        Safari safari = new Safari();
        safari.openBrowser();

    }
}
