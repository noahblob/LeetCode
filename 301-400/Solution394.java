public class Solution394 {
  public String decodeString(String s) {
    Stack<Integer> frequencies = new Stack<>();
    Stack<StringBuilder> substrings = new Stack<>();
    StringBuilder sb = new StringBuilder();
    int freq = 0;

    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) { // frequency
        freq = freq * 10 + Character.getNumericValue(c);
      } else if (c == '[') { // start of substring
        // keep track of frequency of curent substring
        frequencies.push(freq);
        freq = 0;
        // push current string to stack in case we need encapsulated strings
        substrings.push(sb);
        sb = new StringBuilder();
      } else if (c == ']') { // end of substring
        int currentFreq = frequencies.pop();
        StringBuilder currentSub = sb;
        sb = substrings.pop();
        while (currentFreq > 0) {
          sb.append(currentSub);
          currentFreq--;
        }
      } else { // just add new letter to substring
        sb.append(c);
      }
    }

    return sb.toString();
  }
}
