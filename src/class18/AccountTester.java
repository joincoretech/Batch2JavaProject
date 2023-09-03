package class18;

import java.util.Scanner;

public class AccountTester {

    public static void main(String[] args) {
        Account account=new Account();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Enter 1 for signup \n 2 for login \n 3 for transfer \n 4 to exit the program");
            int input=scanner.nextInt();

            if (input== 4){
                break;
            } else if(input==3){
                System.out.println("Please enter the amount you want to transfer ");
                double amount=scanner.nextDouble();
                System.out.println("Enter your password");
                String password=scanner.next();
                account.transferFunds(password, amount);

            }else if (input==2){
                System.out.println("Welcome to bank of america please enter you username and password");
                String userName=scanner.next();
                String password= scanner.next();
                account.login(userName, password);

            }else if (input==1){
                System.out.println("Please enter username, password and the amount you want to deposit");
                account.signUp(scanner.next(), scanner.next(), scanner.nextDouble());

            }

        }

        System.out.println("good bye");
    }
}
