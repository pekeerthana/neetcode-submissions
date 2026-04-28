class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums); 
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(j<k){
                if(nums[j]+nums[k] < -nums[i]) j++;
                else if(nums[j]+nums[k] > -nums[i]) k--;
                else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]== nums[k+1]) k--;
                }
            }
        }

        return result;

    }
}
