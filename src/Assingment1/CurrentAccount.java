package Assingment1;

public class CurrentAccount extends Account{
    private double overdraftLimit;;

    public CurrentAccount(int number,double overdraftLimit ) {
        super(number);
        this.overdraftLimit = overdraftLimit;

    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }



    public void withdraw(double amount) {
        System.out.println("Balance:"+this.getBalance()+"$-Overdraft:"+this.overdraftLimit+"$ (maximum available balance is "+ (this.getBalance()+this.overdraftLimit) +"$)");
        if(amount>(this.getBalance()+this.overdraftLimit)) {
            System.out.println("Client tries to withdraw:"+amount+"$-Operation not approved-balance:"+this.getBalance()+"$");
        }else {
            System.out.println("Client tries to withdraw:"+amount+"$-Operation approved-balance:"+(this.getBalance() - amount)+"$");
        }
        this.setBalance(this.getBalance()-amount);
    }
    @Override
    public String toString() {
        return "CurrentAccount [overdraftLimit=" + overdraftLimit + ", number=" + this.getNumber() + ", balance=" + this.getBalance()
        + ", date=" + this.getDate() + "]";
    }

    }


