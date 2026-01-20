abstract class BankAccount{
    private final String accountNumber;
    private final double accountBalance;

    BankAccount(String accountNumber,double accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    String getAccountNumber(){
        return accountNumber;
    }

    double getAccountBalance(){
        return accountBalance;
    }

    abstract double calculateFee();
}

class SavingAccount extends BankAccount{
    SavingAccount(String accountNumber,double accountBalance){
        super(accountNumber,accountBalance);
    }
    @Override
    double calculateFee(){
        return (getAccountBalance()*0.005);
    }
}

class CheckingAccount extends BankAccount{
    CheckingAccount(String accountNumber,float accountBalance){
        super(accountNumber,accountBalance);
    }
    @Override
    double calculateFee(){
        if(getAccountBalance()<1000){
            return 1.0;
        }
        else{
            return 0.0;
        }
    }
}

public class BankingAccount {
    public static void main(String[] args) {
        BankAccount b1 = new SavingAccount("552411778",1000.0f);
        BankAccount b2 = new CheckingAccount("447855412",1500);
        System.out.printf("%.2f",b1.calculateFee());
        System.out.println();
        System.out.printf("%.2f",b2.calculateFee());
    }
}
