package reviewClass8;

public class AbstractDemoTester {

    public static void main(String[] args) {

        AbstractDemoChild obj=new AbstractDemoChild();
        obj.getInfo("masodi123", "pass123");

        obj.setBalance(1000);
        obj.printInfo("masodi123", "pass123");
        obj.printBalance();
    }
}
