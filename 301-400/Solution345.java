import java.util.ArrayList;

public class Solution345 {
  public String reverseVowels(String s) {
    // split string into an array
    char[] sArr = s.toCharArray();

    // arraylist to check against for vowels
    ArrayList<Character> vowels = new ArrayList<Character>() {
      {
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
        add('A');
        add('E');
        add('I');
        add('O');
        add('U');
      }
    };

    int start = 0;
    int end = sArr.length - 1;

    while (start < end) {

      while (start < end && !vowels.contains(sArr[start])) {
        start++;
      }

      while (start < end && !vowels.contains(sArr[end])) {
        end--;
      }

      char temp = sArr[start];
      sArr[start] = sArr[end];
      sArr[end] = temp;

      start++;
      end--;
    }

    return new String(sArr);

  }
}
