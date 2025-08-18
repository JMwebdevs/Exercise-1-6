import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // input (parallelogram)
        System.out.print("Enter your Username: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your Password (number): ");
        int passWord = scanner.nextInt();

        // condition (diamond)
        if(userName.equals("admin") && passWord == 12345){
            // output (parallelogram)
            System.out.print("Login Successful");
        }else{
            // output (parallelogram)
            System.out.print("Access Denied");
        }

        scanner.close();
    }
}
