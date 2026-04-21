class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[][] newNums = new int[nums.length][2];
        for(int i = 0;i<nums.length;i++){
            newNums[i][0] = nums[i];
            newNums[i][1] = i;
        }

        Arrays.sort(newNums, Comparator.comparingInt(a->a[0]));
        int i =0,j= nums.length-1;
        while(i<j){
            int cur = newNums[i][0] + newNums[j][0];
            if(cur== target) return  new int[] {Math.min(newNums[i][1], newNums[j][1]),
                                 Math.max(newNums[i][1], newNums[j][1])};
            else if(cur <target) i++;
            else j--;
        }
        return  new int[] {-1,-1};

        
    }
}
