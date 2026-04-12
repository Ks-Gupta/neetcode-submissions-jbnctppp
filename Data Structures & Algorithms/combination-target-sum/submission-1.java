class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, target, nums, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int idx, int target,
                           int[] candidates,
                           List<Integer> curr,
                           List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0) return;

        for (int i = idx; i < candidates.length; i++) {

            curr.add(candidates[i]);

            backtrack(i, target - candidates[i], candidates, curr, res);
            // 👆 notice i, not i+1

            curr.remove(curr.size() - 1);
        }
    }

}
