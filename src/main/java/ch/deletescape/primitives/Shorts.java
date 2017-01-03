package ch.deletescape.primitives;

import java.util.Random;

public final class Shorts {
  /**
   * Private Constructor to prevent initialization
   */
  private Shorts() {}

  /**
   * Converts a byte value to short
   * 
   * @param b
   *          the byte value to convert
   * @return the resulting short.
   */
  public static short from(byte b) {
    return b;
  }

  /**
   * Converts a char value to short by simply casting it
   * 
   * @param c
   *          the char value to convert
   * @return the resulting short.
   */
  public static short from(char c) {
    return (short) c;
  }

  /**
   * Converts a long value to short by simply casting it
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting short.
   */
  public static short from(long lng) {
    return (short) lng;
  }

  /**
   * Converts a int value to short by simply casting it
   * 
   * @param i
   *          the int value to convert
   * @return the resulting short.
   */
  public static short from(int i) {
    return (short) i;
  }

  /**
   * Converts a double value to short by simply casting it
   * 
   * @param dbl
   *          the double value to convert
   * @return the resulting short.
   */
  public static short from(double dbl) {
    return (short) dbl;
  }

  /**
   * Converts a float value to short by simply casting it
   * 
   * @param flt
   *          the float value to convert
   * @return the resulting short.
   */
  public static short from(float flt) {
    return (short) flt;
  }

  /**
   * Converts a boolean value to short, {@code true} resulting in {@code 1} and {@code false}
   * resulting in {@code 0}
   * 
   * @param bool
   *          the boolean value to convert
   * @return the resulting short.
   * @see Ints#from(boolean)
   */
  public static short from(boolean bool) {
    return from(Ints.from(bool));
  }

  /**
   * calls {@link Ints#random()} and casts the result to {@code short}
   * 
   * @return a pseudorandom short value.
   * @see Random
   * @see Ints#random()
   */
  public static short random() {
    return from(Ints.random());
  }
}
