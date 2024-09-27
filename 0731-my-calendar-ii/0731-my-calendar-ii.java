import java.util.Map;
import java.util.TreeMap;

class MyCalendarTwo {
    private TreeMap<Integer, Integer> pointFreq;

    public MyCalendarTwo() {
        pointFreq = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        pointFreq.put(start, pointFreq.getOrDefault(start, 0) + 1);
        pointFreq.put(end, pointFreq.getOrDefault(end, 0) - 1);

        if (causingTripleBooking(start, end)) {
            pointFreq.put(start, pointFreq.get(start) - 1);
            pointFreq.put(end, pointFreq.get(end) + 1);
            return false;
        }
        return true;
    }

    private boolean causingTripleBooking(int start, int end) {
        int overlapCnt = 0;
        for (Map.Entry<Integer, Integer> entry : pointFreq.entrySet()) {
            overlapCnt += entry.getValue();
            if (overlapCnt > 2) {
                return true;
            }
        }
        return false;
    }
}
