//Rahul Tudu RollNo-12030523037
import java.util.Arrays;
public class removeduplicates {
    public static void main(String[] args) {
        int[] sortedArray = {1, 1, 2, 2, 3, 3, 4, 5};
        int[] result = removeDuplicates(sortedArray);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];
        int[] uniqueArray = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = temp[i];
        }
        return uniqueArray;
    }
}
