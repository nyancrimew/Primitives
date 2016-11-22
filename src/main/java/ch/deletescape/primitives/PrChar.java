package ch.deletescape.primitives;

import java.util.Random;

public class PrChar {
  /**
   * Private Constructor to prevent initialization
   */
  private PrChar() {
  }

  /**
   * Converts a short value to char by simply casting it
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting char.
   */
  public static char from(short shrt) {
    return (char) shrt;
  }

  /**
   * Converts a long value to char by simply casting it
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting char.
   */
  public static char from(long lng) {
    return (char) lng;
  }

  /**
   * Converts a int value to char by simply casting it
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting char.
   */
  public static char from(int i) {
    return (char) i;
  }

  /**
   * Converts a double value to char by simply casting it
   * 
   * @param dbl
   *          the double value to convert
   * @return the resulting char.
   */
  public static char from(double dbl) {
    return (char) dbl;
  }

  /**
   * Converts a float value to char by simply casting it
   * 
   * @param flt
   *          the float value to convert
   * @return the resulting char.
   */
  public static char from(float flt) {
    return (char) flt;
  }

  /**
   * Converts a boolean value to char, {@code true} resulting in {@code 1} and {@code false}
   * resulting in {@code 0}
   * 
   * @param bool
   *          the boolean value to convert
   * @return the resulting char.
   * @see PrInt#from(boolean)
   */
  public static char from(boolean bool) {
    return from(PrInt.from(bool));
  }

  /**
   * calls {@link PrInt#random()} and casts the result to {@code char}
   * 
   * @return a pseudorandom char value.
   * @see Random
   * @see PrInt#random()
   */
  public static char random() {
    return from(PrInt.random());
  }
}
