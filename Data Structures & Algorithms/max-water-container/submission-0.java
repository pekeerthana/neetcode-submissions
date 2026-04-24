class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;
        int l = 0;
        int r = n-1;
        int max = 0;
        int cur = 0;
        while(l<r)
        {
            cur = (r-l)*Math.min(heights[l],heights[r]);
            max = Math.max(cur,max);
            if(heights[l] < heights[r]) l++;
            else r--;
            cur = (r-l)*Math.min(heights[l],heights[r]);
            max = Math.max(cur,max);
        }

        return max;
        
    }
}
