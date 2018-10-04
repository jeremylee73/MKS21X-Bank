public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double b, int a, String p) {
    balance = b;
    accountID = a;
    password = p;
  }

  public double getBalance() {
    return this.balance;
  }

  public int getAccountID() {
    return this.accountID;
  }

  public String toString() {
    return this.accountID + "\t" + this.balance;
  }

  public boolean deposit(double amount) {
    if (amount < 0) {
      return false;
    }
    balance += amount;
    return true;
  }

  public boolean withdraw(double amount) {
    if (amount < 0 || amount > this.balance) {
      return false;
    }
    balance -= amount;
    return true;
  }

  private boolean authenticate(String password) {
    if (this.password.equals(password)) {
      return true;
    }
    return false;
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (this.authenticate(password) && this.withdraw(amount) && other.deposit(amount)) {
      System.out.println("Successfully transferred "+amount+" from "+this.accountID+" to "+other.accountID);
      return true;
    }
    System.out.println("Failed to transfer "+amount+" from "+this.accountID+" to "+other.accountID);
    return false;
  }
}
