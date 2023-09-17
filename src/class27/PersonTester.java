package class27;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();

        person.setName("Aslam");
        person.setAge(35);

        person.getAge();
        person.getName();

        Person iqbal=new Person();
        iqbal.setName("iqbal");
        iqbal.setAge(18);

        iqbal.getName();
        iqbal.getAge();
    }
}
