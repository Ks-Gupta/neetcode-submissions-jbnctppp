class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        bt("", 0, 0, n, res);
        return res;
    }

    private void bt(String curr, int open, int close, int n, List<String> res){
        
        if(curr.length() == 2 * n){
            res.add(curr);
            return;
        }
        
        if(open < n){
            bt(curr + "(", open + 1, close, n, res);
        }
        if(close < open){
             bt(curr + ")", open , close + 1, n, res);
        }
    }
}
