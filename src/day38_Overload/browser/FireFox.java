package day38_Overload.browser;

public class FireFox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }
}
