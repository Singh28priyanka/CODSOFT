import java.util.Scanner;
class BankAccount{
    private  double balance;
    public BankAccount(double initialBalance){
        this.balance= initialBalance;
    }
    public void deposit(double amount){
        balance +=amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }else{
            System.out.println("insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class AtmInterface{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        BankAccount account=new BankAccount(1000);
        int choice;
        do{
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check balance");
            System.out.println("4.Exit");
            System.out.println("Enter choice:-");
            choice=input.nextInt();
            switch(choice){
                case 1:
                     System.out.println("Enter amount to withdraw:-");
                     double wd=input.nextDouble();
                     account.withdraw(wd);
                     break;
                case 2:
                    System.out.println("Enter amount to deposit:-");
                    double dp=input.nextDouble();
                    account.deposit(dp);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you!!!");
                default:
                    System.out.println("Invalid !!!!");
            }

        }while(choice!=4);
        input.close();
    }
}
