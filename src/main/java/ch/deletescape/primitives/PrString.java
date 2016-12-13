package ch.deletescape.primitives;

import ch.deletescape.primitives.arrays.PrCharArray;

/**
 * Technically String isn't a primitive type, but it is used almost the same way.
 * 
 * @author deletescape
 */
public final class PrString {
  private static final char[] FORMAT_TOKEN = new char[] { '{', '}' };
  private static final int TOKEN_LENGTH = FORMAT_TOKEN.length;
  private static final char[] FORMAT_NULL_REPLACEMENT = new char[] { 'n', 'u', 'l', 'l' };

  /**
   * Private Constructor to prevent initialization
   */
  private PrString() {}

  /**
   * Reverses all chars in a String. For example reversing {@code "Test"} would result in
   * {@code "tseT"}.
   * 
   * @param str
   *          the String to be reversed
   * @return the reversed version of {@code str} or {@code null} if {@code str} is {@code null}.
   */
  public static String reverse(String str) {
    if (str == null || str.isEmpty()) {
      return str;
    }
    char[] ca = str.toCharArray();
    final int maxIdx = ca.length - 1;
    for (int i = 0; i <= maxIdx / 2; i++) {
      char c = ca[i];
      ca[i] = ca[maxIdx - i];
      ca[maxIdx - i] = c;
    }
    return new String(ca);
  }

  // following TODOs need to be done before making this a public api method
  // TODO: Throw exceptions in illegal cases (see TODOs in Test)
  static String simpleFormat(String format, Object... elements) {
    if (elements == null) {
      return format;
    }
    // Working with a char array is better for performance than working with a String
    char[] str = format.toCharArray();
    for (Object element : elements) {
      int idx = PrCharArray.findSequence(str, FORMAT_TOKEN);
      if (idx == -1) {
        break;
      }
      // Replace null values with the string "null" which is a char[] for performance reasons
      char[] eStr = element != null ? element.toString().toCharArray() : FORMAT_NULL_REPLACEMENT;
      // We want to trim away the {} token, so we subtract it from the format strings total length
      int lenArr = str.length - TOKEN_LENGTH;
      int lenIns = eStr.length;
      // A Temporary array of the required size is created
      char[] arr = new char[lenArr + lenIns];
      // Here we take the first part of our original format string and place it in the temp array
      System.arraycopy(str, 0, arr, 0, idx);
      // Placing the replacement at the index of our token
      System.arraycopy(eStr, 0, arr, idx, lenIns);
      // Adding the end of the format string back to our new string, trimming away the {} sequence
      System.arraycopy(str, idx + TOKEN_LENGTH, arr, idx + lenIns, lenArr - idx);
      // Reassinging the value of our temp array to our original array
      str = arr;
    }
    return new String(str);
  }
}
