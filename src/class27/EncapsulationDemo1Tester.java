package class27;

public class EncapsulationDemo1Tester {

    public static void main(String[] args) {
        EncapsulationDemo1 obj=new EncapsulationDemo1();

        obj.setField1(10);
        obj.setField2(20);
        obj.setField3(15);

        obj.getField1();
        int num2=obj.getField2();
        int num3= obj.getField3();

        System.out.println(num2+10);// 30
        System.out.println(num3);
    }
}
