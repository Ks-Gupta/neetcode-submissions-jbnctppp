class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int mini_ele = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            mini_ele = Math.min(mini_ele,nums[i]);
        }
        return mini_ele;
    }
}
