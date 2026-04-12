class TimeMap {
    class Pair{
        int time;
        String value;

        Pair(int time, String value){
            this.time = time;
            this.value = value;
        }
    }

    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {

        if(!map.containsKey(key)) return "";

        List<Pair> list = map.get(key);
        int s = 0;
        int e = list.size() - 1;
        String res = "";

        while(s <= e){
            int mid = (s + e) /2;

            if(list.get(mid).time <= timestamp){
                res = list.get(mid).value;
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        
        return res;
    }
}
