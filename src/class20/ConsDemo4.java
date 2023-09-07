package class20;

public class ConsDemo4 {


    String name;
     double bonus;
     double salary;
     int daysOfWork;

     ConsDemo4( String enterName, double enterSalary, int enterDaysOfWork){
         name=enterName;
         salary=enterSalary;
         daysOfWork=enterDaysOfWork;
         bonus=1000;

     }

     void printBonus(){
         if (daysOfWork>300){
             bonus=1500;
         }else{
             bonus=500;
         }
     }
}
