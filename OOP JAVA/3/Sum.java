//Rahul Tudu RollNo-12030523037
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a positive integer (n): ");
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } 
        else {   
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }
    }
}
