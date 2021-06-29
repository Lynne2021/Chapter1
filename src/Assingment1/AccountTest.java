package Assingment1;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(999999);
        System.out.println("Your account is "+ account.getNumber());
        account.setBalance((double)100.50 );
        System.out.println("Your account balance is "+ account.getBalance());
        System.out.println("Your account detail is "+ account);

        DoubleAccount doubleAccount = new DoubleAccount(999999,100.00);
        doubleAccount.setBalance((double)200 );
        doubleAccount.setDoubleBalance((double)100);
        System.out.println("Your Double Account Total balance is "+ doubleAccount.getTotalBalance());
        System.out.println("before deposiy money, balance is "+ doubleAccount.getBalance());
        doubleAccount.depositMoney((double)60);
        System.out.println("Your Double Account balance is "+ doubleAccount.getBalance());
        doubleAccount.withdrawMoney((double)30);
        System.out.println("Your Double Account balance is "+ doubleAccount.getBalance());
        System.out.println("before deposiy money, double balance is "+ doubleAccount.getDoubleBalance());
        doubleAccount.depositToDouble((double)80);
        System.out.println("Your Double Account double balance is "+ doubleAccount.getDoubleBalance());
        doubleAccount.withdrawFromDouble((double)20);
        System.out.println("Your Double Account double balance is "+ doubleAccount.getDoubleBalance());
        System.out.println("Your Double account detail is "+ doubleAccount);

        CurrentAccount currentAccount = new CurrentAccount(999999,500);
        currentAccount.getOverdraftLimit();
        currentAccount.setOverdraftLimit((double)50);
        currentAccount.setBalance((double)100);
        System.out.println("Your current account balance is "+ currentAccount.getBalance());
        currentAccount.withdraw((double)120);
        System.out.println("Your current account balance is "+ currentAccount.getBalance());
        currentAccount.withdraw((double)60);
        System.out.println("Your current account balance is "+ currentAccount.getBalance());
        System.out.println("Your current Account detail is "+ currentAccount);

        SavingsAccount savingsAccount = new SavingsAccount(999999,0.0-1.0);
        savingsAccount.setAnnualInterestRate((double)0.5);
        savingsAccount.setBalance((double)100);
        System.out.println("Your savings account balance is "+ savingsAccount.getBalance());
        savingsAccount.addInterestToAccount();
        System.out.println("Your savings account balance is "+ savingsAccount.getBalance());
        System.out.println("Your savings Account detail is "+ savingsAccount);

    }

}

