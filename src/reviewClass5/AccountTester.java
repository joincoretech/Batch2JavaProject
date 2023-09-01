package reviewClass5;

public class AccountTester {

    public static void main(String[] args) {

        Account samiullahAccount=new Account();

        samiullahAccount.accountNumber= 123453;
        samiullahAccount.userName="samiullah";
        samiullahAccount.password="pass123";
        samiullahAccount.balance=100000;

        samiullahAccount.login("samiullah", "pass123");
        samiullahAccount.userInfo();

    }

}
