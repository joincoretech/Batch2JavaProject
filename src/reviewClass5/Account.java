package reviewClass5;

public class Account {

    String userName;
    String password;
    double balance;
    int accountNumber;
    boolean isLoggedIn;

    public void login(String userLogInUserName, String userLoginPassword){

        if (userName.equals(userLogInUserName) && password.equals(userLoginPassword)){
            System.out.println("Welcome to Bank of America");
            isLoggedIn=true;
        }else{
            System.out.println("your credentials are invalid try again");
        }

    }

    public void userInfo(){
      if (isLoggedIn){
          System.out.println("Your Account number is "+accountNumber+" and your balance is "+balance);
      }else{
          System.out.println("WOOPS!");
      }
    }
}
