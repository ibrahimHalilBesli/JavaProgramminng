package day38_Inheritance.browser;

public class Safari extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Safari Browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Safari Browser");
    }
}
