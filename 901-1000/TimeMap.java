import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class TimeMap {
  Map<String, TreeMap<Integer, String>> map;

  public TimeMap() {
    map = new HashMap<>();
  }

  public void set(String key, String value, int timestamp) {
    TreeMap<Integer, String> newMap = new TreeMap<>(Collections.reverseOrder());
    if (!(map.containsKey(key))) {
      newMap.put(timestamp, value);
      map.put(key, newMap);
    } else {
      newMap = map.get(key);
      newMap.put(timestamp, value);
      map.put(key, newMap);
    }
  }

  public String get(String key, int timestamp) {
    if (!(map.containsKey(key))) {
      return "";
    }

    TreeMap<Integer, String> curMap = map.get(key);
    if (!curMap.containsKey(timestamp)) {
      for (Map.Entry<Integer, String> entry : curMap.entrySet()) {
        if (entry.getKey() < timestamp) {
          return entry.getValue();
        }
      }
    } else {
      return curMap.get(timestamp);
    }

    return "";
  }
}