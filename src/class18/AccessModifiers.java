package class18;

public class AccessModifiers {

    public String name;
    private String AccountPassword;
    String SSNNumber;

    public void park(){
        System.out.println("everyone can has access to park");
    }

    private void toothBrush(){

        System.out.println("no one should use it");
    }

    void car(){
        System.out.println("only family can use it");
    }

    void printInfo(){
        System.out.println(name);
        System.out.println(AccountPassword);
        System.out.println(SSNNumber);
    }

  protected  void protectedMethod(){
        System.out.println("I am protected Method");
    }
}
