package Assingment1;

public class DoubleAccount extends Account {
    private double doubleBalance;
    public DoubleAccount(int number,double doubleBalance) {
        super(number);
        this.doubleBalance=doubleBalance;
        // TODO Auto-generated constructor stub
    }
    public double getDoubleBalance() {
        return doubleBalance;
    }
    public void setDoubleBalance(double doubleBalance) {
        this.doubleBalance = doubleBalance;
    }
    public void withdrawFromDouble(double amount) {
        this.doubleBalance -= amount;
    }
    public void depositToDouble(double amount) {
        this.doubleBalance += amount;
    }
    public double getTotalBalance() {
        return this.doubleBalance + this.getBalance();
    }
    public int getNumber() {
        return super.getNumber();
    }

    @Override
    public String toString() {
        return "DoubleAccount [doubleBalance=" + doubleBalance + ", number=" + this.getNumber() + ", balance=" + this.getBalance()
                + ", date=" + this.getDate() + ", TotalBalance="+ this.getTotalBalance()+"]";
    }



}
