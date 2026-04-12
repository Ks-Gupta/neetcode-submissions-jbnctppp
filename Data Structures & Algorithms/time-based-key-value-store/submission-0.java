class TimeMap {

    Map<String,List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        String ans = "";
        for(Pair p : map.get(key)){
            if(p.time <= timestamp){
                ans = p.value;
            }
        }

        return ans;
    }

    class Pair{
        int time;
        String value;

        Pair(int time, String value){
            this.time = time;
            this.value = value;
        }
    }
}
