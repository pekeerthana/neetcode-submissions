class Solution {
    public int longestConsecutive(int[] nums) {

        if( nums.length<=1) return nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int max = 1;
        int cur = 1;
        int start = 0;
        for(int num: nums){
            if(!set.contains(num-1)) {
                start = num;
                start+=1;
                while(set.contains(start))
                {
                    cur++;
                    start++;
                }

                max = Math.max(cur,max);
                cur=1;
            }
        }

        return max;
        
    }
}
