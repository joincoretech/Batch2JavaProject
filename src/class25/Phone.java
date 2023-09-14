package class25;

abstract public class Phone {

    void makeCall(){
        System.out.println("calling");
    }

    void sendText(){
        System.out.println("send message");
    }

    abstract void displayPicture();
    abstract void unlockPhone();

}

class Iphone extends Phone{

    void displayPicture(){
        System.out.println("Iphone use photo app to display pictures");
    }

    void unlockPhone(){

        System.out.println("user can unlock iphone by faceID");
    }

}

class Samsung extends Phone{

    void displayPicture(){
       System.out.println("Samsung use gallery to display pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung use FaceID and draw a code on the screen to unlock phone");
    }
}