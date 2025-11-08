//Rahul Tudu RollNo-12030523037
public class ArraySum {
    public static int calculateArraySum(int[] arr) {
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
        }
        return sum; 
    }
    public static void main(String[] args) {
        int[] numbers = {10, 29, 50, 60, 53};
        int totalSum = calculateArraySum(numbers);
        System.out.println("The sum of the array elements is: " + totalSum);
        int[] moreNumbers = {20, 15, 25};
        int anotherSum = calculateArraySum(moreNumbers);
        System.out.println("The sum of the second array elements is: " + anotherSum);
    }
}
