package com.bankoerations;

  class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

      public BankAccount() {
          this.accountNumber = 123456;
          this.accountHolderName = "ajay";
          this.balance = 100000;
      }

      public double deposite(int enteredMoney){
          if (enteredMoney > 0){
              this.balance += enteredMoney;
              return this.balance;
          }else{
              return this.balance;
          }
      }
      public void withdraw(int enteredMoney){
          if (enteredMoney < balance){
              this.balance -= enteredMoney;
              System.out.println(this.balance);
          }else{
              System.out.println("invalid response");;
          }
      }

//      public void setBalance(double balance) {
//          this.balance = balance;
//      }
public static void main(String[] args) {
    BankAccount bank1 = new BankAccount();
    System.out.println(bank1.balance);
    bank1.withdraw(500);
    bank1.deposite(1000);
    bank1.withdraw(100000);
    System.out.println(bank1.balance);
}

  }
