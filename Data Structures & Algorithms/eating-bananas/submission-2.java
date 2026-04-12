class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int l = 1;
        int r = 0;
        for(int i = 0; i < n; i++){
            r = Math.max(r, piles[i]);
        }

        int ans = r;

        while(l <= r){
            int k = (l + r)/2;
            long hr = 0;
            for(int p : piles){
                hr += (int) Math.ceil((double) p/k);
            }

            if(hr <= h){
                ans = k;
                r = k - 1;
            }else{
                l = k + 1;
            }
        }
        return ans;
    }
}
