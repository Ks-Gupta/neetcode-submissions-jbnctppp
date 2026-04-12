class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int s : stones){
            minHeap.offer(-s);
        }

        while(minHeap.size() > 1){
            int first = minHeap.poll();
            int sec = minHeap.poll();
            if(sec > first){
                minHeap.offer(first - sec);
            }
        }

        minHeap.offer(0);
        return Math.abs(minHeap.peek());
    }
}
