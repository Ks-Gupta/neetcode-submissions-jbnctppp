class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        Stack<Integer> st  = new Stack<>();
        int mA = 0;
        for(int i = 0; i <= n; i++){
            int currhei = (i == n) ? 0 : heights[i];

            while(!st.isEmpty() && currhei < heights[st.peek()]){
                int h = heights[st.pop()];
                int r = i;
                int l = st.isEmpty() ? -1 : st.peek();
                int w = r - l - 1;

                mA = Math.max(mA, h * w); 
            }
            st.push(i);
        }

        return mA;
    }
}
