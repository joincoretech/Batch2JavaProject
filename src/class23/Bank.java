package class23;

public class Bank{

    public void transferFee(double amount){
        System.out.println("Your charge fee is "+ amount*0.02);
    }
}

class BankOfAmerica extends Bank{

    public void transferFee(double amount){
        System.out.println("your BankOfAmerica charge fee is  "+amount*0.05);
    }

}

class WellsForgo extends Bank{

    public void transferFee(double amount){
        System.out.println( " your WellsForge charge fee is "+amount*0.03);
    }
}

class CapitalOne extends Bank{

}