package class24;

public class WebDriverTester {
    public static void main(String[] args) {

        /*WebDriver webDriver=new FirFox();
        webDriver.openWebSite();
        webDriver.closingWebSite();
        webDriver.loginWebSite();

        WebDriver chrome=new GoogleChrome();
        chrome.openWebSite();
        chrome.closingWebSite();
        chrome.loginWebSite();*/

        WebDriver [] webDrivers={new WebDriver(), new GoogleChrome(), new FirFox()};
        for (WebDriver webDriver:webDrivers){
            webDriver.loginWebSite();
            webDriver.closingWebSite();
            webDriver.openWebSite();
        }
    }
}
