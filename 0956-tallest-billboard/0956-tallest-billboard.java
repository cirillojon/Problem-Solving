class Solution {
    public int tallestBillboard(int[] rods) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i = 0; i < rods.length; i++){
            int x = rods[i];
            Map<Integer, Integer> temp = new HashMap<>(map);
            Integer[] keys = temp.keySet().toArray(new Integer[0]);
            for(int j = 0; j < keys.length; j++){
                int d = keys[j];
                int y = temp.get(d);

                map.put(d+x, Math.max(map.getOrDefault(d+x,0), y));

                if(d >= x)
                    map.put(d-x, Math.max(map.getOrDefault(d-x,0), y + x));
                else
                    map.put(x-d, Math.max(map.getOrDefault(x-d,0), y + d));
            }
        } return map.getOrDefault(0,0);
    }
}