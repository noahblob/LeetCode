class Solution2114 {
  public int mostWordsFound(String[] sentences) {
    int longest = 0;
    for (int i = 0; i < sentences.length; i++) {
      longest = Math.max(longest, sentences[i].split(" ").length);
    }
    return longest;
  }
}