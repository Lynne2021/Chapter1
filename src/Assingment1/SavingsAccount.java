package Assingment1;

public class SavingsAccount extends Account {
    private double annualInterestRate;

    public SavingsAccount(int number,double annualInterestRate) {
        super(number);
        this.annualInterestRate = annualInterestRate;


        }

        // TODO Auto-generated constructor stub


    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void addInterestToAccount() {
        this.setBalance(this.getBalance()+this.getBalance()*this.annualInterestRate);
    }


    @Override
    public String toString() {
        return "SavingsAccount [annualInterestRate=" + annualInterestRate + ", number="
               + this.getNumber() + ", balance=" + this.getBalance() + ", date=" + this.getDate() + "]";
    }



}
