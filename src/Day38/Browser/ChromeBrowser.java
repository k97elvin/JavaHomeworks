package Day38.Browser;

import Day38.Browser.Browser;

public class ChromeBrowser extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing chrome browser");
    }
}
