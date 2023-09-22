package reviewClass8;

public interface InterfaceDemo {

    //int num; we can not create instance variables in interface

    void add(int n, int num);// java compiler add public and abstract to each method
    void sub();
    void multi();
    void div();
}

interface Header extends InterfaceDemo{
    void calHeader();
}


class Calculator implements Header{
    public void calHeader(){
        System.out.println("this is hardcoded calculator");
    }

    @Override
    public void add(int n, int num) {
        System.out.println(n+num);
    }

    @Override
    public void multi() {
        System.out.println(5*5);
    }

    public void div(){
        System.out.println(10/2);
    }

    @Override
    public void sub() {
        System.out.println(15-5);
    }
}