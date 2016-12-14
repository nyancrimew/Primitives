package ch.deletescape.primitives;

import java.util.Random;

public final class PrInt {
  private static Random random;

  /**
   * Private Constructor to prevent initialization
   */
  private PrInt() {}

  /**
   * Converts a byte value to int
   * 
   * @param b
   *          the byte value to convert
   * @return the resulting int.
   */
  public static int from(byte b) {
    return b;
  }

  /**
   * Converts a char value to int
   * 
   * @param c
   *          the char value to convert
   * @return the resulting int.
   */
  public static int from(char c) {
    return c;
  }

  /**
   * Converts a short value to int
   * 
   * @param shrt
   *          the short value to convert
   * @return the resulting int.
   */
  public static int from(short shrt) {
    return shrt;
  }

  /**
   * Converts a long value to int by simply casting it
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting int.
   */
  public static int from(long lng) {
    return (int) lng;
  }

  /**
   * Converts a double value to int by simply casting it
   * 
   * @param dbl
   *          the double value to convert
   * @return the resulting int.
   */
  public static int from(double dbl) {
    return (int) dbl;
  }

  /**
   * Converts a float value to int by simply casting it
   * 
   * @param flt
   *          the float value to convert
   * @return the resulting int.
   */
  public static int from(float flt) {
    return (int) flt;
  }

  /**
   * Converts a boolean value to int, {@code true} resulting in {@code 1} and {@code false}
   * resulting in {@code 0}
   * 
   * @param bool
   *          the boolean value to convert
   * @return the resulting int.
   */
  public static int from(boolean bool) {
    return bool ? 1 : 0;
  }

  /**
   * Convenience method for {@link Random#nextInt()}, the first time this method is called a new
   * {@link Random} instance is created
   * 
   * @return a pseudorandom int value.
   * @see Random
   */
  public static int random() {
    if (random == null) {
      random = new Random();
    }
    return random.nextInt();
  }
}
