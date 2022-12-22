package day38_Overload.browser;

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
