class Solution {
    public int binary_Search(int l, int r, int[] nums, int target){
        if(l > r) return -1;
        int m = l + (r - l) / 2;

        if(nums[m] == target){
            return m;
        }

        return (nums[m] < target) ? binary_Search(m + 1,r,nums,target) : binary_Search(l, m - 1,nums,target);
        
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binary_Search(0,n - 1 ,nums,target);
    }

}
