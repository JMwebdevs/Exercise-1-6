import java.util.Scanner;
public class Exercise6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter a amount: ");
    int amount = scanner.nextInt();
    int balance = 1000;

    if (amount <= balance){
      balance = balance - amount;
      System.out.println("Balance: " + balance);
    }else{
      System.out.println("Insufficient funds");
    }

    scanner.close();

  }
}
