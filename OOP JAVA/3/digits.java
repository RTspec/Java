//Rahul Tudu RollNo-12030523037
import java.util.Scanner;
public class digits {
    public static void main(String[] args) {
        int n, sum=0, remainder;
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        while ( n!=0 ){
            remainder = n%10;
            sum += remainder;
            n/=10;
        }
        System.out.println("Sum of digits:" + sum);
    }
}
