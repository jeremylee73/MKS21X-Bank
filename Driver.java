public class Driver {
  public static void main(String[] args) {
    BankAccount a = new BankAccount(3, 200.0, "hello");

    System.out.println(a);

    a.deposit(100.0);
    System.out.println(a);

    a.withdraw(50.0);
    System.out.println(a);
  }
}
