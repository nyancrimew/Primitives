package ch.deletescape.primitives;

import java.util.Random;

public final class PrBool {

  /**
   * Private Constructor to prevent initialization
   */
  private PrBool() {}

  /**
   * Converts a byte value to boolean (value {@code 1} equals {@code true})
   * 
   * @param b
   *          the byte value to convert
   * @return the resulting boolean.
   */
  public static boolean from(byte b) {
    return b == 1;
  }

  /**
   * Converts a char value to boolean (value {@code 1} equals {@code true})
   * 
   * @param c
   *          the char value to convert
   * @return the resulting boolean.
   */
  public static boolean from(char c) {
    return c == 1;
  }

  /**
   * Converts a short value to boolean (value {@code 1} equals {@code true})
   * 
   * @param shrt
   *          the short value to convert
   * @return the resulting boolean.
   */
  public static boolean from(short shrt) {
    return shrt == 1;
  }

  /**
   * Converts a long value to boolean (value {@code 1} equals {@code true})
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting boolean.
   */
  public static boolean from(long lng) {
    return lng == 1L;
  }

  /**
   * Converts a int value to boolean (value {@code 1} equals {@code true})
   * 
   * @param i
   *          the int value to convert
   * @return the resulting boolean.
   */
  public static boolean from(int i) {
    return i == 1;
  }

  /**
   * Converts a double value to boolean (value {@code 1} equals {@code true}, a delta of
   * {@code 0.001} is used for the equality check)
   * 
   * @param dbl
   *          the double value to convert
   * @return the resulting boolean.
   */
  public static boolean from(double dbl) {
    return PrDouble.equality(dbl, 1.0, 0.001);
  }

  /**
   * Converts a float value to boolean (value {@code 1} equals {@code true}, a delta of
   * {@code 0.001} is used for the equality check)
   * 
   * @param flt
   *          the float value to convert
   * @return the resulting boolean.
   */
  public static boolean from(float flt) {
    return PrFloat.equality(flt, 1f, 0.001f);
  }

  /**
   * Convenience method for {@link Random#nextBoolean()}, the first time this method is called a new
   * {@link Random} instance is created
   * 
   * @return a pseudorandom boolean value.
   * @see Random
   */
  public static boolean random() {
    return RandomGeneratorHolder.random.nextBoolean();
  }
}
