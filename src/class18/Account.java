package class18;

public class Account {

    private double actualAccountBalance;
    private String actualUserName;
    private String actualPassword;


    public  boolean login(String enteredUserName, String enteredPassword){

        return enteredUserName.equals(actualUserName) && enteredPassword.equals(actualPassword);
    }

    public boolean signUp(String enteredUsername, String enteredPassword, double enteredBalance){
        if (enteredUsername.length()>15){
            return false;
        }else{
            actualPassword=enteredPassword;
            actualUserName=enteredUsername;
            actualAccountBalance=enteredBalance;
            return true;
        }
    }

    boolean transferFunds(String enteredPassword, double enteredTransferBalance){
        if (enteredPassword.equals(actualPassword) && enteredTransferBalance<=actualAccountBalance){
            actualAccountBalance=actualAccountBalance-enteredTransferBalance;
            return true;
    }else{
        return false;
        }
    }

}
