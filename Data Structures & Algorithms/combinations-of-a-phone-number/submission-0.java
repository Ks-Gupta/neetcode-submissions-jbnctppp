class Solution {

    private String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }
        bt(0,digits, new StringBuilder(), res);
        return res;
    }

    private void bt(int idx, String digits, StringBuilder curr, List<String> res){

        if(idx == digits.length()){
            res.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];
        for(char c : letters.toCharArray()){
            curr.append(c);
            bt(idx + 1, digits, curr, res);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
