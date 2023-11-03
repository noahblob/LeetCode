public class Solution1071 {
  public String gcdOfStrings(String str1, String str2) {

    // A function that returns the greatest common divisor of two strings
    // If the two strings are equal, return the string
    if (str1.equals(str2)) {
      return str1;
    }

    // If the length of the first string is less than the length of the second
    // string, then swap the two strings
    if (str1.length() < str2.length()) {
      return gcdOfStrings(str2, str1);
    }

    // If the first string starts with the second string, then remove the second
    // string from the first string and call the function again
    if (str1.startsWith(str2)) {
      return gcdOfStrings(str1.substring(str2.length()), str2);
    }

    // If the first string does not start with the second string, then return an
    // empty string
    return "";
  }
}
