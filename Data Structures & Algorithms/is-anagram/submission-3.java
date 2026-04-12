class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] s1 = s.toCharArray();
        // Arrays.sort(s1);

        // char[] s2 = t.toCharArray();
        // Arrays.sort(s2);

        // if(Arrays.equals(s1, s2)){
        //     return true;
        // }

        // return false;

        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            h1.put(ch,h1.getOrDefault(ch,0) + 1);
        }

        for(int j = 0; j < t.length(); j++){
            char ch = t.charAt(j);
            h2.put(ch,h2.getOrDefault(ch,0) + 1);
        }

        boolean areEqual = h1.equals(h2);

        return areEqual ? true : false;
    }
}
