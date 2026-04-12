class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sorteds1 = new String(s1Arr);
        int m = s2.length();

        for(int i = 0; i < m; i++){
            for(int j = i; j < m; j++){
                char[] subStrArr = s2.substring(i,j+1).toCharArray();
                Arrays.sort(subStrArr);

                String sortedSub = new String(subStrArr);

                if(sortedSub.equals(sorteds1)){
                    return true;
                }

            }
        }

        return false;
    }
}
