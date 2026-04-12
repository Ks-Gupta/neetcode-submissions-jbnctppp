class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int C_zero = 0;
        int prod = 1;

        for(int i = 0; i < n; i++){
            if(nums[i]!= 0){
               prod *= nums[i];
            }else{
                C_zero++;
            }
        }

        //all will be zero
        if(C_zero > 1){
            return new int[nums.length];
        }


        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(C_zero > 0){
                res[i] = (nums[i] == 0) ? prod : 0;
            }else{
                res[i] = prod / nums[i];
            }
        }

        return res;
    }
}  
