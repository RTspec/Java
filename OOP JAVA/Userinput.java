import java.util.Scanner;

public class Userinput {
   public static void main(String[] args) {
    Scanner name = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = name.nextLine();  // Read user input
    System.out.println("Hello " + userName);
    
    }
}

