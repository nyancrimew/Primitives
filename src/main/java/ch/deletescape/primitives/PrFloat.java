package ch.deletescape.primitives;

import java.util.Random;

public final class PrFloat {
  private static Random random;

  /**
   * Private Constructor to prevent initialization
   */
  private PrFloat() {}

  /**
   * Converts a double value to float by simply casting it
   * 
   * @param dbl
   *          the double value to convert
   * @return the resulting float.
   */
  public static float from(double dbl) {
    return (float) dbl;
  }

  /**
   * Converts a boolean value to float, {@code true} resulting in {@code 1} and {@code false}
   * resulting in {@code 0}
   * 
   * @param bool
   *          the boolean value to convert
   * @return the resulting float.
   * @see PrInt#from(boolean)
   */
  public static float from(boolean bool) {
    return PrInt.from(bool);
  }

  /**
   * Convenience method for {@link Random#nextFloat()}, the first time this method is called a new
   * {@link Random} instance is created
   * 
   * @return a pseudorandom float value.
   * @see Random
   */
  public static float random() {
    if (random == null) {
      random = new Random();
    }
    return random.nextFloat();
  }
}
