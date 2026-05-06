class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a ->a[0]));//Sorting intervals

        int CurrentStart = intervals[0][0];//1
        int CurrentEnd = intervals[0][1];//3

        List<int[]> mergeInterval = new ArrayList<>();
        
        for(int i = 1 ; i < intervals.length;++i){
            int NextStart = intervals[i][0];//2
            int NextEnd = intervals[i][1];//6
            
            //if no overlapping
            if(CurrentEnd < NextStart){
                mergeInterval.add(new int[]{CurrentStart,CurrentEnd});
                CurrentStart = NextStart;
                CurrentEnd = NextEnd; 
            }else{//overlapping condition
                CurrentEnd = Math.max(CurrentEnd, NextEnd);
            }    
            
        }
        //CurrentEnd has been updated as it was overlapped
        mergeInterval.add(new int[]{CurrentStart,CurrentEnd});
        return mergeInterval.toArray(new int[mergeInterval.size()][]);
    }
}