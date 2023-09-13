package class24;

public class Circle extends Shape {

    public Circle(double radius){
        super(radius);
    }
    // R*R*pi
    void circleArea(){
        System.out.println(Math.pow(radius, 2)*Math.PI);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.circleArea();
        System.out.println(circle.radius);
    }
}
