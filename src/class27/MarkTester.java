package class27;

public class MarkTester {
    public static void main(String[] args) {

        A student1=new A(95,90,100);
        Double per=student1.getPercentage();
        System.out.println(per);

        B studentB=new B(80,90,85,89);
       double per2= studentB.getPercentage();
       System.out.println(per2);
    }
}
