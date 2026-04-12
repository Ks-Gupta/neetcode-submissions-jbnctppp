class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put(')' , '(');
        map.put('}' , '{');
        map.put(']' , '[');

        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(map.containsValue(ch)){
                st.push(ch);
            }else{
                if(st.isEmpty() || st.pop()  != map.get(ch)){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
