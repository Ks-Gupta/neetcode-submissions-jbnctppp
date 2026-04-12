class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        bt(0,nums,new ArrayList<>(),ans);
        return ans;
    }

    private void bt(int idx, int[] nums, List<Integer> curr, List<List<Integer>> res){
        res.add(new ArrayList<> (curr));

        for(int i = idx; i < nums.length; i++){
            curr.add(nums[i]);
            bt(i + 1, nums, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
