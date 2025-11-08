//Rahul Tudu RollNo-12030523037
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        int index = -1;  
        for (int i = 0; i < n; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index + ".");
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
