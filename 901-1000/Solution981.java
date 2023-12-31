import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution981 {
  class Pair {
    int timestamp;
    String val;

    public Pair(int timestamp, String val) {
      this.timestamp = timestamp;
      this.val = val;
    }
  }

  class TimeMap {
    Map<String, ArrayList<Pair>> timeMap;

    public TimeMap() {
      timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
      Pair pair = new Pair(timestamp, value);
      if (timeMap.containsKey(key)) {
        timeMap.get(key).add(pair);
      } else {
        ArrayList<Pair> newList = new ArrayList<>();
        newList.add(pair);
        timeMap.put(key, newList);
      }
    }

    public String get(String key, int timestamp) {

      String out = "";

      if (timeMap.containsKey(key)) {
        ArrayList<Pair> newList = timeMap.get(key);

        // find correct timestamp using binary search, as timestamps
        // are in strictly increasing order
        int lo = 0;
        int hi = newList.size() - 1;

        while (lo <= hi) {
          int mid = (lo + hi) / 2;
          int currentTime = newList.get(mid).timestamp;

          if (timestamp == currentTime) {
            return newList.get(mid).val;
          } else if (currentTime < timestamp) {
            out = newList.get(lo).val;
            lo = mid + 1;
          } else {
            hi = mid - 1;
          }
        }
      }
      return out;
    }
  }
}
