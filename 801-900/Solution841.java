import java.util.List;

public class Solution841 {
  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] unlocked = new boolean[rooms.size()];
    visit(rooms, unlocked, 0);

    for (boolean x : unlocked) {
      if (x == false) {
        return false;
      }
    }

    return true;
  }

  public void visit(List<List<Integer>> rooms, boolean[] unlocked, int roomToVisit) {
    // visit current room
    if (unlocked[roomToVisit]) {
      return;
    }
    unlocked[roomToVisit] = true;
    for (int key : rooms.get(roomToVisit)) {
      visit(rooms, unlocked, key);
    }
  }
}
