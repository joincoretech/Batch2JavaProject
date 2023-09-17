package class27;


abstract public class Mark {

   /* We have to calculate the percentage of marks
    obtained in three subjects (each out of 100) by
    student A and in four subjects (each out of 100)
    by student B. Create class 'Marks' with an
    abstract method 'getPercentage'. It is inherited
    by classes 'A' and 'B' each having a method with
    the s a m e n a m e which returns the percentage of
    the students. The constructor of student class21.MoultiLevelInhiertance.A takes
    the marks in three subjects as its parameters
    and the marks in four subjects as its parameters
for student B. Test your cod*/

    double sub1;
    double sub2;
    double sub3;
    double sub4;

    abstract double getPercentage();

}

class A extends Mark{

    A(double sub1, double sub2, double sub3){
       this.sub1 =sub1;
       this.sub2=sub2;
       this.sub3=sub3;
    }

    double getPercentage(){
        double per=(sub1+sub2+sub3)/3;
        return per;
    }
}


class B extends Mark{

    B(double sub1, double sub2, double sub3, double sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }

    double getPercentage(){
        double per=(sub1+sub2+sub3+sub4)/4;
        return per;
    }
}