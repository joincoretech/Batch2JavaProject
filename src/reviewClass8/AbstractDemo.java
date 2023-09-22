package reviewClass8;

public abstract class AbstractDemo {

    private String userName;
    private String password;
    double balance;

    void getInfo(String userName, String password){
        this.userName=userName;
        this.password=password;
    }

    public void printInfo(String userName, String password){
        if (this.userName.equals(userName) && this.password.equals(password)){

            System.out.println("this is your userName "+ userName+" and this is your password "+ password);
        }else{
            System.out.println("your userName or password is incorrect");
        }
    }

    abstract void setBalance(double balance);

}

class AbstractDemoChild extends AbstractDemo{

    void setBalance(double balance){
       this.balance=balance;
    }

    void printBalance(){
        System.out.println("this is your balance "+balance);
    }
}