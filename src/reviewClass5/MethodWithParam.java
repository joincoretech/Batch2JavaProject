package reviewClass5;

public class MethodWithParam {

    public  double arraySum(double [] num){
        double sum=0;

        for (double element:num){
            sum+=element;
        }
        return sum;
    }

}
