class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

       int maxReached = 0;
       for(int i = 0; i < n; i++){
         
         if( i > maxReached){
            return false;
         }

         maxReached = Math.max(maxReached, i + nums[i]);
       }

       return true;
    }
}
