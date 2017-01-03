package ch.deletescape.primitives;

import java.util.Random;

public final class Longs {

  /**
   * Private Constructor to prevent initialization
   */
  private Longs() {}

  /**
   * Converts a byte value to long
   * 
   * @param b
   *          the byte value to convert
   * @return the resulting long.
   */
  public static long from(byte b) {
    return b;
  }

  /**
   * Converts a char value to long
   * 
   * @param c
   *          the char value to convert
   * @return the resulting long.
   */
  public static long from(char c) {
    return c;
  }

  /**
   * Converts a short value to long
   * 
   * @param shrt
   *          the short value to convert
   * @return the resulting long.
   */
  public static long from(short shrt) {
    return shrt;
  }

  /**
   * Converts a int value to long
   * 
   * @param i
   *          the int value to convert
   * @return the resulting long.
   */
  public static long from(int i) {
    return i;
  }

  /**
   * Converts a double value to long by simply casting it
   * 
   * @param dbl
   *          the double value to convert
   * @return the resulting long.
   */
  public static long from(double dbl) {
    return (long) dbl;
  }

  /**
   * Converts a float value to long by simply casting it
   * 
   * @param flt
   *          the float value to convert
   * @return the resulting long.
   */
  public static long from(float flt) {
    return (long) flt;
  }

  /**
   * Converts a boolean value to long, {@code true} resulting in {@code 1} and {@code false}
   * resulting in {@code 0}
   * 
   * @param bool
   *          the boolean value to convert
   * @return the resulting long.
   * @see Ints#from(boolean)
   */
  public static long from(boolean bool) {
    return Ints.from(bool);
  }

  /**
   * Convenience method for {@link Random#nextLong()}, the first time this method is called a new
   * {@link Random} instance is created
   * 
   * @return a pseudorandom long value.
   * @see Random
   */
  public static long random() {
    return RandomGeneratorHolder.random.nextLong();
  }
}
