class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1;
        int right = arr.length - 2;
        int storeIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == arr.length - 1 || arr[mid] > arr[mid + 1]) {
                storeIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return storeIndex;

    }
}