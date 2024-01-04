import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class Solution380 {
    class RandomizedSet {
        Set<Integer> randomSet;
        Random rand = new Random();

        public RandomizedSet() {
            randomSet = new HashSet<>();
        }

        public boolean insert(int val) {
            return randomSet.add(val);
        }

        public boolean remove(int val) {
            return randomSet.remove(val);
        }

        public int getRandom() {
            List<Integer> arr = new ArrayList<>(randomSet);
            return arr.get(rand.nextInt(arr.size()));
        }
    }
}