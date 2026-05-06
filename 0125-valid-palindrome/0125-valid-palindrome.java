class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)) left++;//checks char at pos left is not letter or digit

            else if(!Character.isLetterOrDigit(rightChar)) right--;//same checking for right pos

            else if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) return false;

            else{
                left++;
                right--;

            }

        }
        return true;
        

    }
}