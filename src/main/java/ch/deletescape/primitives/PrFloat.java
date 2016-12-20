package ch.deletescape.primitives;

import java.util.Random;

public final class PrFloat {

  /**
   * Private Constructor to prevent initialization
   */
  private PrFloat() {}

  /**
   * Converts a byte value to float
   * 
   * @param b
   *          the byte value to convert
   * @return the resulting float.
   */
  public static float from(byte b) {
    return b;
  }

  /**
   * Converts a char value to float
   * 
   * @param c
   *          the char value to convert
   * @return the resulting float.
   */
  public static float from(char c) {
    return c;
  }

  /**
   * Converts a short value to float
   * 
   * @param shrt
   *          the short value to convert
   * @return the resulting float.
   */
  public static float from(short shrt) {
    return shrt;
  }

  /**
   * Converts a long value to float
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting float.
   */
  public static float from(long lng) {
    return lng;
  }

  /**
   * Converts a int value to float
   * 
   * @param i
   *          the int value to convert
   * @return the resulting float.
   */
  public static float from(int i) {
    return i;
  }

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
    return RandomGeneratorHolder.random.nextFloat();
  }

  /**
   * Checks if two floats are equal concerning a positive delta.
   * 
   * @param value1
   *          the value to compare to {@code value2}
   * @param value2
   *          the value to compare to {@code value1}
   * @param delta
   *          a tolerance value for which distance we decide two floats are equal
   * @return if the two floats are equal concerning a positive delta.
   */
  public static boolean equality(float value1, float value2, float delta) {
    return Math.abs(value1 - value2) <= delta;
  }
}
