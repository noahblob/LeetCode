import java.util.Stack;

public class Solution735 {
  public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> collisions = new Stack<>();

    for (int asteroid : asteroids) {
      if (asteroid > 0) {
        collisions.push(asteroid);
      } else {
        // if we find a left moving asteroids, keep destroying right moving asteroids
        while (!collisions.isEmpty() && collisions.peek() > 0 && Math.abs(asteroid) > collisions.peek()) {
          collisions.pop();
        }

        // if smashing with asteroids travelling left resulted in all right asteroids
        // getting destroyed, or if current remaining asteroid is travelling same
        // direction, add left travelling asteroid
        if (collisions.isEmpty() || collisions.peek() < 0) {
          collisions.push(asteroid);
        } else if (collisions.peek() + asteroid == 0) {
          // if left and right travelling asteroids are same size, destroy both
          collisions.pop();
        }
      }
    }

    int[] remaining = new int[collisions.size()];
    for (int i = collisions.size() - 1; !collisions.isEmpty(); i--) {
      remaining[i] = collisions.pop();
    }

    return remaining;
  }
}
