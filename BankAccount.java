public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, double b, String p) {
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
}
