class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        // Define a fast-lookup string containing all valid vowels
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            // Move left pointer forward until it finds a vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move right pointer backward until it finds a vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            
            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            // Move pointers inward
            left++;
            right--;
        }
        
        return new String(chars);
    }
}