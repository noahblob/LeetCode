public class Solution383 {
  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> map = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();

    for (int i = 0; i < magazine.length(); i++) {
      int c = 0;
      if (map.containsKey(magazine.charAt(i))) {
        c = map.get(magazine.charAt(i));
      }
      map.put(magazine.charAt(i), c + 1);
    }

    for (int i = 0; i < ransomNote.length(); i++) {
      int c = 0;
      if (map2.containsKey(ransomNote.charAt(i))) {
        c = map2.get(ransomNote.charAt(i));
      }
      map2.put(ransomNote.charAt(i), c + 1);
    }

    for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
      if (map.get(entry.getKey()) == null) {
        return false;
      }
      if (map.get(entry.getKey()) < entry.getValue()) {
        return false;
      }
    }
    return true;
  }
}
