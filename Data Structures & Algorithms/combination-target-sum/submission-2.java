class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        bt(0,target,nums,new ArrayList<>(), res);
        return res;
    }

    private void bt(int idx, int target,  int[] nums, List<Integer> curr, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = idx; i < nums.length; i++){
            curr.add(nums[i]);
            bt(i,target - nums[i], nums, curr, res );
            curr.remove(curr.size() - 1);
        }
    }
}
