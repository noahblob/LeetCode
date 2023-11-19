import java.util.PriorityQueue;

class Solution128 {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        if (nums.length < 1) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }

        for (int num : nums) {
            pq.add(num);
        }
        int numCon = 1;
        int maxCon = 1;
        int currentTop = pq.poll();
        while (!pq.isEmpty()) {
            int newTop = pq.poll();
            if (newTop == currentTop + 1) {
                numCon++;
            } else if (newTop == currentTop) {
                continue;
            } else {
                numCon = 1;
            }
            
            currentTop = newTop;

            if (numCon > maxCon) {
                maxCon = numCon;
            }
        }

        return maxCon;
    }
}