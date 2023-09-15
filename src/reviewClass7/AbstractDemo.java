package reviewClass7;

import class21.MoultiLevelInhiertance.A;

abstract public class AbstractDemo {

    double num1, num2;
    abstract void sub();
    abstract void add();

    void printInfo(){
        System.out.println("value of num1 is "+num1+ " and value of num2 is "+ num2);
    }

}

class AbstractDemoChild extends AbstractDemo{

    void sub(){
        num1=15;
        num2=5;
        System.out.println(num1-num2);
    }
    void add(){
        num1=10;
        num2=5;
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        AbstractDemoChild obj=new AbstractDemoChild();
        obj.add();
        obj.sub();
        obj.printInfo();
    }
}