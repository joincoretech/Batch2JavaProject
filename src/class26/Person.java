package class26;

public interface Person {

    void sleep();
    void eat();
    void study();
}

interface Employee {
    void work();// java compiler will add public abstract to method
}

interface JoinCoreTechEmployee extends Person, Employee{
    void teach();
}


class Emp implements JoinCoreTechEmployee{

    public void sleep(){
        System.out.println("JoinCoreTech employee sleep");
    }
    public void eat(){
        System.out.println("JoinCoreTech employee also eat");
    }
    public void study(){
        System.out.println("JoinCoreTech employee study");
    }

    @Override
    public void work() {
        System.out.println("joincoretech employee work");
    }

    @Override
    public void teach() {
       System.out.println("JoinCoreTech employee teach");
    }
}
