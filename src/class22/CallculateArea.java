package class22;

public class CallculateArea {


    void area(double side){
        double result= side*side;
        System.out.println("Square area = "+ result);
    }

    void area(double wide , double length){
        double result=wide*length;
        System.out.println("the rectangle are is = "+result);
    }

    void area( double wide, double length, double hight){
        double result= wide*length*hight;
        System.out.println("the box valium is = "+ result);
    }

}
