class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        int total = n + m;
        int cnt = 0;
        int prev = 0, curr = 0;

        while(cnt <= total/2){
            prev = curr;
            if(i < n && (j >= m || nums1[i] <= nums2[j])){
                curr = nums1[i++];
            }else{
                curr = nums2[j++];
            }
            cnt++;
        }

        if(total % 2 == 0){
            return (prev + curr) / 2.0;
        }else{
            return curr;
        }
    }
}
