class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxPiles = 0;
        for(int i = 0; i < n; i++){
            maxPiles = Math.max(maxPiles, piles[i]);
        }

        for(int k = 1; k <= maxPiles; k++){
            long hr = 0;
            for(int pile : piles){
                hr += (pile + k - 1) / k;
            }

            if(hr <= h){
                return k;
            }
        }

        return -1;
    }
}
