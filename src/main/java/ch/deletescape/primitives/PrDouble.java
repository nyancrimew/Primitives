package ch.deletescape.primitives;

import java.util.Random;

public class PrDouble {
  private static Random random;

  /**
   * Private Constructor to prevent initialization
   */
  private PrDouble() {}

  /**
   * Converts a boolean value to double, {@code true} resulting in {@code 1} and {@code false}
   * resulting in {@code 0}
   * 
   * @param bool
   *          the boolean value to convert
   * @return the resulting double.
   * @see PrInt#from(boolean)
   */
  public static double from(boolean bool) {
    return PrInt.from(bool);
  }

  /**
   * Convenience method for {@link Random#nextDouble()}, the first time this method is called a new
   * {@link Random} instance is created
   * 
   * @return a pseudorandom double value.
   * @see Random
   */
  public static double random() {
    if (random == null) {
      random = new Random();
    }
    return random.nextDouble();
  }

  /**
   * Checks if two double values are equal concerning a positive delta.
   * 
   * @param value1
   *          the value to compare to {@code value2}
   * @param value2
   *          the value to compare to {@code value1}
   * @param delta
   *          a tolerance value for which distance we decide two doubles are equal
   * @return if the two doubles are equal concerning a positive delta.
   */
  public static boolean equality(double value1, double value2, double delta) {
    return Math.abs(value1 - value2) <= delta;
  }
}
