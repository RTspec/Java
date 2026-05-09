class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int[] Tracker1 = new int[nums.length - 1];
        
        Tracker1[0] = nums[0];
        Tracker1[1] = Math.max(nums[0],nums[1]);
        //Tracker[2] = Math.max(nums[2] + Tracker[2 - 2],Tracker[2 - 1]);
        for(int i = 2; i< nums.length - 1; ++i){
            Tracker1[i] = Math.max(nums[i] + Tracker1[i - 2],Tracker1[i - 1]);
        }
        
        int[] Tracker2 = new int[nums.length - 1];
        Tracker2[0] = nums[1];
        Tracker2[1] = Math.max(nums[1],nums[2]);
        
        for(int j = 2; j < nums.length - 1; ++j){
            Tracker2[j] = Math.max(nums[j + 1] + Tracker2[j - 2],Tracker2[j - 1]);
        }
        //return Tracker1[Tracker1.length - 1];
        return Math.max(Tracker1[Tracker1.length - 1],Tracker2[Tracker2.length - 1]);
    }
}