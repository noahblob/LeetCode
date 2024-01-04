import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution380 {
    class RandomizedSet {
        Set<Integer> randomSet;
        int size;

        public RandomizedSet() {
            randomSet = new HashSet<>();
            size = 0;
        }

        public boolean insert(int val) {
            if (randomSet.add(val)) {
                size++;
                return true;
            } else {
                return false;
            }
        }

        public boolean remove(int val) {
            if (randomSet.contains(val)) {
                randomSet.remove(val);
                size--;
                return true;
            }
            return false;
        }

        public int getRandom() {

            List<Integer> arr = new ArrayList<>(randomSet);
            if (randomSet.size() <= 1) {
                return arr.get(0);
            }

            int index = (int) (Math.random() * (size));
            return arr.get(index);
        }
    }

}