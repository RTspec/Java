class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a ->a[0]));
        int CurrentStart = intervals[0][0];
        int CurrentEnd = intervals[0][1];
        int count = 0;

        for(int i = 1; i < intervals.length;++i){
            int NextStart = intervals[i][0];
            int NextEnd = intervals[i][1];

            if(CurrentEnd > NextStart){
                count+=1;
                CurrentEnd = Math.min(CurrentEnd, NextEnd);              
                
            }else{
                
                CurrentEnd = NextEnd;
            }
        }
        return count;
    }
}