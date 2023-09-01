package class16;

public class MobilePhoneTester {

    public static void main(String[] args) {
        MobilePhone iphone= new MobilePhone();

        iphone.model="iphone 14";
        iphone.price= 1300;
        iphone.size= 6.69;
        iphone.make="Apple";
        iphone.color="Black";
        iphone.phoneDetail();

        MobilePhone samsung=new MobilePhone();

        samsung.model="Galaxy 21";
        samsung.make="Samsung";
        samsung.price=1000;
        samsung.size=7.4;
        samsung.color="White";
        samsung.phoneDetail();



    }
}
