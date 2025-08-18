import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //input (parallelogram)
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Condition (diamond)
        if(num % 2 == 0){
            // print (parallelogram)
            System.out.print("\nOdd");
        }else {
            // print
            System.out.print("Even");
        }
        scanner.close();
    }
}
