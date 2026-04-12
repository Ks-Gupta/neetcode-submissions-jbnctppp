class Solution {
    // public int[] topKFrequent(int[] nums, int k) {
        
    //     HashMap<Integer, Integer> map = new HashMap<>(); //{freq,num}
     

    //     for(int num : nums){
    //         map.put(num,map.getOrDefault(num, 0) + 1);
    //     } 

    //     //convert map to list
    //     List<Integer> list = new ArrayList<>(map.keySet());
    //     Collections.sort(list,(a,b) -> map.get(b) - map.get(a));

    //     //result of top k
    //     int[] res = new int[k];
    //     for(int i = 0; i < k; i++){
    //         res[i] = list.get(i);
    //     }

    //     return res;

    // }

    public int[] topKFrequent(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        //Min heap by Frequency
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        //keep heap size k
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            minHeap.offer(new int[]{entry.getValue(), entry.getKey()});

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = minHeap.poll()[1];
        }

        return res;
    }
}
