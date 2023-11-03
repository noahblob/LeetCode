public class Solution58 {
  public int lengthOfLastWord(String s) {
    String[] strings = s.split(" ");

    return strings[strings.length - 1].length();
  }
}
