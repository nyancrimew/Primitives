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

  // following TODOs need to be done before making this a public api method
  // TODO: Rewrite in a more performant way (replace on char array level)
  // TODO: Throw exceptions in illegal cases (see TODOs in Test)
  static String simpleFormat(String format, Object... elements) {
    if (elements == null) {
      return format;
    }
    String str = format;
    for (Object element : elements) {
      String eStr = element != null ? element.toString() : "null";
      str = str.replaceFirst("\\{\\}", eStr);
    }
    return str;
  }
}
