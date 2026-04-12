class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;

        if(n == 0) return 0;

        int s = 0;
        int e = n - 1;
        int leftMax = 0, rightMax = 0;

        while(s < e){
            if(height[s] < height[e]){
               leftMax = Math.max(leftMax,height[s]);
               water += leftMax - height[s];
               s++;
            }
            else{
               rightMax = Math.max(rightMax,height[e]);
               water += rightMax - height[e];
               e--; 
            }
        }

        return water;
    }
}
