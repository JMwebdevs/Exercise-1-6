import java.util.Scanner;
public class Exercise4{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // Ask user to enter a N:
    System.out.print("Enter a Number: ");
    int N = scanner.nextInt();
    
    // starting point 0 to kung anong num(N) nilagay mo
    int sum = 0;

    // computaion starting ng loop at end ng loop based sa ininput na Num ng User
    for (int i = 1; i <= N; i++){
      // sum na zero i pluplus sa loop na (i) depends sa rounds(N)
      sum = sum + i;

      // example:
      // 0 + 1 = 1
      // 1 + 2 = 3 hanggang mag-end based sa num na nilagay mo

      System.out.println(sum);
    }
    scanner.close();
  }
}