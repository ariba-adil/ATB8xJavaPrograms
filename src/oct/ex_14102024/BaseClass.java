package oct.ex_14102024;

public class BaseClass extends GrandBaseClass{
    //Web Automation
    //Single
    //Hide functionality of open and close browser
    void openBrowser(String browser) {

    }

    void closeBrowser(String browser) {

    }

    @Override
    void takeScreenshot() {
        System.out.println("Takes screenshot");
    }
}
