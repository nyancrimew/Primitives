package ch.deletescape.primitives;

public class Int {
  /**
   * Private Constructor to prevent initialization
   */
  private Int() {
  }

  /**
   * Converts a long value to integer by simply casting it
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting integer.
   */
  public static int from(long lng) {
    return (int) lng;
  }

  /**
   * Converts a double value to integer by simply casting it
   * 
   * @param dbl
   *          the double value to convert
   * @return the resulting integer.
   */
  public static int from(double dbl) {
    return (int) dbl;
  }

  /**
   * Converts a float value to integer by simply casting it
   * 
   * @param flt
   *          the float value to convert
   * @return the resulting integer.
   */
  public static int from(float flt) {
    return (int) flt;
  }

  /**
   * Converts a boolean value to integer, {@code true} resulting in {@code 1} and {@code false}
   * resulting in {@code 0}
   * 
   * @param bool
   *          the boolean value to convert
   * @return the resulting integer.
   */
  public static int from(boolean bool) {
    return bool ? 1 : 0;
  }
}
