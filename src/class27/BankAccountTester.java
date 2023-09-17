package class27;

public class BankAccountTester {

    public static void main(String[] args) {
        BankAccount iqbal=new BankAccount("Iqbal", "iqbal123", "pass123", 50000);

        iqbal.logIn("iqbal123", "pass123");

        double balance= iqbal.getBalance("iqbal123", "pass123");
        System.out.println(balance);

        System.out.println(iqbal.getBalance("iqbal123", "pass123"));

    }
}
