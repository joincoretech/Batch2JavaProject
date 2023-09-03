package class18Tester;

import class18.AccessModifiers;
import class18.PrivateClass;

public class AccessModifiersTester extends AccessModifiers {



    public static void main(String[] args) {

        AccessModifiers obj=new AccessModifiers();

        PrivateClass privateClass=new PrivateClass();
        privateClass.setaccountNumberValue("aa12345");
        System.out.println(obj.name="Aslam");
        obj.park();


    }
}
