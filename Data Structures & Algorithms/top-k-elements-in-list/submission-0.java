class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>(); //{freq,num}
     

        for(int num : nums){
            map.put(num,map.getOrDefault(num, 0) + 1);
        } 

        //convert map to list
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) -> map.get(b) - map.get(a));

        //result of top k
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = list.get(i);
        }

        return res;

    }
}
