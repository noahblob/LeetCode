import java.util.LinkedList;
import java.util.Queue;

class Solution649 {
  public String predictPartyVictory(String senate) {
    Queue<Integer> dire = new LinkedList<>();
    Queue<Integer> radiant = new LinkedList<>();

    int n = senate.length();

    for (int i = 0; i < n; i++) {
      if (senate.charAt(i) == 'R') {
        radiant.add(i);
      } else { // dire
        dire.add(i);
      }
    }

    while (!dire.isEmpty() && !radiant.isEmpty()) {
      if (dire.poll() < radiant.poll()) {
        dire.add(n++);
      } else {
        radiant.add(n++);
      }
    }

    return dire.isEmpty() ? "Radiant" : "Dire";
  }
}