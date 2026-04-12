class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,target,candidates, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int idx, int target, int[] nums, List<Integer> curr, List<List<Integer>> ans){
        
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i - 1]){
                continue;
            }

            if(nums[i] > target) break;

            curr.add(nums[i]);
            backtrack(i + 1, target - nums[i],nums,curr,ans);
            curr.remove(curr.size() - 1);
        }
    }
}
