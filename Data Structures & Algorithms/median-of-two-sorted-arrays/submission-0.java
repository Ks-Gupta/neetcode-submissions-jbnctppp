class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] nums = new int[n + m];
        System.arraycopy(nums1,0,nums,0,n);
        System.arraycopy(nums2,0,nums,n,m);
        Arrays.sort(nums);

        int totLen = nums.length;
        if(totLen % 2 == 0){
            return (nums[totLen / 2 - 1] + nums[totLen/2]) / 2.0;
        }else{
            return nums[totLen / 2];
        }

    }
}
