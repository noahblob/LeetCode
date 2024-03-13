import java.util.Stack;

public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        // if current minimum changes, push old minimum so we can access it later
        if (val <= min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.pop() == min) {
            // set new minimum value to next valeu down in stack
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
