class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            Set<Integer> seen = new HashSet<>();

            for(int j = i + 1; j < n; j++){
                int third = - nums[j] - nums[i];
                if(seen.contains(third)){
                    ans.add(Arrays.asList(nums[i],nums[j],third));
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}
