package ch.deletescape.primitives;

/**
 * Technically String isn't a primitive type, but it is used almost the same way.
 * 
 * @author deletescape
 */
public final class PrString {
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
}
