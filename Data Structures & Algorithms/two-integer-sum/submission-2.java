class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     int n = nums.length;

    //     for(int i = 0; i < n; i++){
    //         for(int j = i+1; j < n; j++){
    //             if(nums[i] + nums[j] == target){
    //                 return new int[] {i,j};
    //             }
    //         }
    //     }

    //     return new int[] {-1,-1};
    // }

    public int[] twoSum(int[] nums, int target){
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int curr = target - nums[i];
            if(map.containsKey(curr)){
                return new int[] {map.get(curr),i};
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
