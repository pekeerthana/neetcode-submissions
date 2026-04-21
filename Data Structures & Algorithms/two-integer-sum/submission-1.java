class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums.length==2) 
        {
            if(nums[0]+nums[1]== target) return new int[] {0,1};
            else return  new int[] {-1,-1};
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res = target-nums[i];
            if(map.containsKey(res)) return new int[] {map.get(res),i};
            map.put(nums[i],i);
        }
        return  new int[] {-1,-1};

        
    }
}
