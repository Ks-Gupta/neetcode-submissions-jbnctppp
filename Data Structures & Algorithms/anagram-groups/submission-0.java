class Solution {
    // public List<List<String>> groupAnagrams(String[] strs) {
        
    //     Map<String, List<String>> map = new HashMap<>();

    //     for(String s : strs){
    //         char[] ch = s.toCharArray();
    //         Arrays.sort(ch);

    //         String sortedS = new String(ch);
    //         map.putIfAbsent(sortedS, new ArrayList<>());
    //         map.get(sortedS).add(s);
    //     }

    //     return new ArrayList<>(map.values());
    // }

    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
