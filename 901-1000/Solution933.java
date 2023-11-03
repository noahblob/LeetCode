import java.util.ArrayList;

public class Solution933 {
  public ArrayList<Integer> calls;

    public Solution933() {
        calls = new ArrayList<>();
    }
    
    public int ping(int t) {
        calls.add(t);
        int out = 0;
        for (Integer call : calls) {
            if (t - call <= 3000) out++;
        }
        return out;
    }
}
