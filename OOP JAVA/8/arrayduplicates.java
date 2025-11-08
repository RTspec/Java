//Rahul Tudu RollNo-12030523037
public class arrayduplicates {
    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicate elements in the array are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; 
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 6, 1, 7, 3, 7};
        findDuplicates(arr);
    }
}
