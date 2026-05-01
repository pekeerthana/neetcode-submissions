class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int[] rmax = new int[n],lmax = new int[n];
        lmax[0] = 0;
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], height[i - 1]);
        }

        rmax[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], height[i + 1]);
        }
        
        for (int i = 0; i < n; i++) {
            int trapped = Math.min(lmax[i], rmax[i]) - height[i];
            if (trapped > 0) {
                water += trapped;
            }
        }

        return water;

    }
}
