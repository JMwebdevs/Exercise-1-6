import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // input (parallelogram)
        System.out.print("Enter a First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter a Second Number: ");
        int secondNumber = scanner.nextInt();

        // condition (diamond)
        if (firstNumber > secondNumber){
            // output
            System.out.print( firstNumber + " is larger than " + secondNumber);
        }else if(secondNumber > firstNumber){
            // output
            System.out.print( secondNumber + " is larger than " + firstNumber);
        }else{
            System.out.print("Both num are equals");
        }

        scanner.close();
    }
}
