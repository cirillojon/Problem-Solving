class UndergroundSystem {
    Map<Integer, String> in_map;
    Map<Integer, Integer> in_time;
    Map<String, List<Integer>> journey_times;

    public UndergroundSystem() {
        in_map = new HashMap<>();
        in_time = new HashMap<>();
        journey_times = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        in_map.put(id, stationName);
        in_time.put(id, t);
    }
    
    public void checkOut(int id, String stationName, int t) {
        String journey = in_map.get(id) + "_" + stationName;
        int timeSpent = t - in_time.get(id);
        
        List<Integer> times = journey_times.getOrDefault(journey, new ArrayList<>());
        times.add(timeSpent);
        journey_times.put(journey, times);
        
        in_map.remove(id);
        in_time.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String journey = startStation + "_" + endStation;
        List<Integer> times = journey_times.get(journey);
        
        return times.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
    }
}
