package class18;

public class AcecessModefiersTesterSamePackage {

    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers();
        obj.name="Samiullah";
        obj.SSNNumber="1234A";
        obj.car();
        obj.park();
        obj.printInfo();
        obj.protectedMethod();

        DefaultClass defaultClass=new DefaultClass();
        System.out.println(defaultClass.defaultvar="i am default value");
    }
}
