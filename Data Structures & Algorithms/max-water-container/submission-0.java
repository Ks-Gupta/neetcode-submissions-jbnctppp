class Solution {
    public int maxArea(int[] heights) {
        int s = 0;
        int e = heights.length - 1;
        int maxArea = 0;

        while(s < e){
            int h = Math.min(heights[s],heights[e]);
            maxArea = Math.max(maxArea, h * (e - s));

            if(heights[s] < heights[e]){
                s++;
            }else{
                e--;
            }
        }

        return maxArea;
    }
}
