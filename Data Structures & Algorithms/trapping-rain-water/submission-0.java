class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int water = 0;

        for (int i = 0; i < n; i++) {

            int leftMax = 0;
            int rightMax = 0;

            // find max to the left
            for (int l = 0; l < i; l++) {
                leftMax = Math.max(leftMax, height[l]);
            }

            // find max to the right
            for (int r = i + 1; r < n; r++) {
                rightMax = Math.max(rightMax, height[r]);
            }

            water += Math.max(0, Math.min(leftMax, rightMax) - height[i]);
        }

        return water;
    }
}
