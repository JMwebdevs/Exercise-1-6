import java.util.Scanner;
public class Exercise5{
  public static void main(String[] args) {
    // Start
    Scanner scanner = new Scanner(System.in);

    // input - Asking user to enter their scores 
    System.out.print("Enter score: ");
    int scores = scanner.nextInt();

    // condition - scores/grade classification
    if (scores >= 90){
      System.out.println("Excellent");
    } else if (scores >= 80){
      System.out.println("Good");
    }else if (scores >= 70){  
      System.out.println("Fair");
    }else{
    System.out.println("Needs Improvement");
    }

    // End
    scanner.close();
  }
}