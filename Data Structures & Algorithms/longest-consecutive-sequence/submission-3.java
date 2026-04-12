class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);

        if(nums.length == 0) return 0;

        int cnt = 1;
        int maxcnt = 1;
        

        for(int i = 1; i < nums.length; i++){
            if( i != 0 && nums[i] == nums[i - 1]) continue;

            if(nums[i] == nums[i - 1] + 1){
                cnt++;
            }else{
                cnt = 1;
            }

            maxcnt = Math.max(maxcnt,cnt);
        }

        return maxcnt;
    }
}
