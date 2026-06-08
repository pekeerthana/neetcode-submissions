class Solution {
    public int search(int[] nums, int target) {

        int low = 0, high = nums.length;

        while(low<high){

            int mid = (low+high) >>> 1;
            if(nums[mid] < target)  low = mid+1;
            else if(nums[mid] > target) high = mid; 
            else return mid;
        }

        return -1;
        
    }
}
