package class23;

public class BankTester {

    public static void main(String[] args) {

        BankOfAmerica bankOfAmerica=new BankOfAmerica();
        bankOfAmerica.transferFee(1000);

        WellsForgo wellsForgo=new WellsForgo();
        wellsForgo.transferFee(1000);

        CapitalOne capitalOne=new CapitalOne();
        capitalOne.transferFee(1000);
    }
}
