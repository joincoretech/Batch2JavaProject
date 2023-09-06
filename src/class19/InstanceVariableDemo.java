package class19;

public class InstanceVariableDemo {

    String name="Iqbal";
    int age=18;

    public void info(){
      InstanceVariableDemo obj=new InstanceVariableDemo();
      System.out.println(obj.age);
      System.out.println(obj.name);
      String cell="571-123-4321";
      System.out.println(cell);
    }

    public static void main(String[] args) {
        InstanceVariableDemo obj=new InstanceVariableDemo();

        obj.info();
    }

}
