package class24;

public class FinalVariable {
    public static void main(String[] args) {

        final String name="Aslam";
        //name="Nastratullah"; we can not reassign the value to final variable
        String name1="Samiullah";
        name1="Iqbal";

        int num=50;
        final int num2=10;
        num=20;
        //num2=30; it is final we can not reassign the value

        System.out.println(name1);
    }
}
