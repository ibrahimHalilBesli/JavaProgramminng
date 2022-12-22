package day38_Overload.browser;

public class ChromeBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Chrme Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");
    }
}
