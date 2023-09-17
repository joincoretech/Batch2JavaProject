package class27;

public interface Shape {

   /* Create an Interface
    methods as 'Shape' with undefined
    calculateArea and calculatePerimiter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.*/

    void calculateArea();
    void calculateParameter();
}

class Circle implements Shape{
    // R*RPI
    int radius=3;

    public void calculateArea(){
        int rSquare=radius*radius;
        System.out.println(rSquare*Math.PI);
        System.out.println(Math.pow(radius, 2)* Math.PI);
    }

    public void calculateParameter(){
        // 2RPI

        System.out.println(2*(radius)*Math.PI);
    }
}

class Square implements Shape{

    int side=5;

    public void calculateParameter(){
        System.out.println(4*side);
    }

    public void calculateArea(){
        System.out.println(side*side);
    }
}