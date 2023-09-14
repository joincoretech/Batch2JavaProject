package class25;

public class PhoneTester {

    public static void main(String[] args) {
        Phone iphone=new Iphone();
        iphone.displayPicture();
        iphone.makeCall();
        iphone.sendText();
        iphone.unlockPhone();


        Samsung samsung=new Samsung();
        samsung.displayPicture();
        samsung.unlockPhone();
        samsung.makeCall();
        samsung.sendText();
    }
}
