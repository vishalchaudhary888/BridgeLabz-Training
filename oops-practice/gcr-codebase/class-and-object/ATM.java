
class BankAccount{
    private int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    public void Withdraw(int money){
        if(balance-money>0){
            balance-=money;
            System.out.println("Withdraw amount is:"+money);
            System.out.println("Current balance: "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public void Deposit(int money){
        balance+=money;
        System.out.println("Deposited: "+money);
        System.out.println("Current balance: "+balance);
    }

}
public class ATM {
    public static void main(String[] args) {
        BankAccount jatin = new BankAccount(5000);
        jatin.Deposit(1000);
        jatin.Withdraw(7000);
        jatin.Deposit(2000);
        jatin.Withdraw(7000);
    }
}
