package day38_Inheritance.browser;

public class Opera extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Opera Browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Opera Browser");
    }

}
