import java.util.Stack;

public class Solution150 {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (String s : tokens) {
      if (isNumeric(s)) {
        stack.push(Integer.parseInt(s));
      } else {
        if (s.equals("+")) {
          stack.push(stack.pop() + stack.pop());
        } else if (s.equals("/")) {
          int num2 = stack.pop();
          int num1 = stack.pop();
          stack.push(num1 / num2);
        } else if (s.equals("*")) {
          stack.push(stack.pop() * stack.pop());
        } else if (s.equals("-")) {
          int num2 = stack.pop();
          int num1 = stack.pop();
          stack.push(num1 - num2);
        }
      }
    }
    return stack.pop();
  }

  boolean isNumeric(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
