package ch.deletescape.primitives;

import java.util.Random;

public final class PrLong {
  private static Random random;

  /**
   * Private Constructor to prevent initialization
   */
  private PrLong() {
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
   * @see PrInt#from(boolean)
   */
  public static long from(boolean bool) {
    return PrInt.from(bool);
  }

  /**
   * Convenience method for {@link Random#nextLong()}, the first time this method is called a new
   * {@link Random} instance is created
   * 
   * @return a pseudorandom long value.
   * @see Random
   */
  public static long random() {
    if (random == null) {
      random = new Random();
    }
    return random.nextLong();
  }
}
