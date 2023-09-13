package class24;

public class WebDriver {

    void openWebSite(){
        System.out.println("Opening the website");
    }

    void closingWebSite(){

        System.out.println("closing the website");
    }
    void loginWebSite(){
        System.out.println("logging the website");
    }
}

class GoogleChrome extends WebDriver{

    void openWebSite(){
        System.out.println("opening the website in the google chrome");
    }

    void closingWebSite(){
        System.out.println("closing the website in the google chrome");
    }

    void loginWebSite(){
        System.out.println("logging in the website in the google chrome");
    }
}

class FirFox extends WebDriver{

    void openWebSite(){
        System.out.println("opening the website in the FireFox");
    }

    void closingWebSite(){
        System.out.println("closing the website in the FireFox");
    }

    void loginWebSite(){
        System.out.println("logging in the website in the FireFox");
    }
}
