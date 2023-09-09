package class21;

public class Parent {

    private String name;
    private int age;
    private  String userName;
    private  String password;

    public void getInfo(String name, int age, String userName, String password){

        this.name=name;
        this.age=age;
        this.userName=userName;
        this.password=password;
        System.out.println("name "+name+" age "+ age +" userName "+ userName+" password "+ password);
    }


}
