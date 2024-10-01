package javaRevise.oopsPractice1;


class BankAccount {
    private int accountNumber;
    private long balance;

    BankAccount(int accountNumber, long balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount);
        }else{
            System.out.println("Invalid Amount...");
        }
    }
    void withDraw(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
            System.out.println(amount);
        }else{
            System.out.println("Out of balance");
        }
    }
    public double currentBalance(){
        return balance;
    }
}



public class Java_7_BankAccount {
    public static void main(String[] args) {
        BankAccount Bank1 = new BankAccount(7219821, 2000);
        System.out.println(Bank1.currentBalance());
        Bank1.withDraw(300);
        Bank1.deposite(700);
        System.out.println(Bank1.currentBalance());
    }
}
