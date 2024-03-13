import java.util.HashSet;
import java.util.Set;

public class Trie {
  Set<String> set;

  public Trie() {
        set = new HashSet<>();
    }

  public void insert(String word) {
    set.add(word);
  }

  public boolean search(String word) {
    return set.contains(word);
  }

  public boolean startsWith(String prefix) {
    for (String s : set) {
      if (prefix.length() <= s.length()) {
        if (s.substring(0, prefix.length()).equals(prefix)) {
          return true;
        }
      }
    }
    return false;
  }
}
