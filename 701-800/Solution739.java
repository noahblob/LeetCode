import java.util.Stack;

public class Solution739 {
  public int[] dailyTemperatures(int[] temperatures) {
    int[] answer = new int[temperatures.length];

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < temperatures.length; i++) {
      while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        answer[stack.peek()] = i - stack.pop();
      }
      stack.push(i);
    }
    return answer;
  }
}
