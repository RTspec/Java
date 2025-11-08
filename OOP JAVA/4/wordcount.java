//Rahul Tudu RollNo-12030523037
import java.util.Scanner;
public class wordcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence or phrase: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.trim().split("\\s+");

        if (inputString.trim().isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            System.out.println("Number of words: " + words.length);
        }
        scanner.close();
    }
}