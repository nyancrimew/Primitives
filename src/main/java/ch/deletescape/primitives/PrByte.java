package ch.deletescape.primitives;

import java.util.Random;

public class PrByte {
  /**
   * Private Constructor to prevent initialization
   */
  private PrByte() {
  }

  /**
   * Converts a char value to byte by simply casting it
   * 
   * @param c
   *          the char value to convert
   * @return the resulting byte.
   */
  public static byte from(char c) {
    return (byte) c;
  }

  /**
   * Converts a short value to byte by simply casting it
   * 
   * @param shrt
   *          the short value to convert
   * @return the resulting byte.
   */
  public static byte from(short shrt) {
    return (byte) shrt;
  }

  /**
   * Converts a long value to byte by simply casting it
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting byte.
   */
  public static byte from(long lng) {
    return (byte) lng;
  }

  /**
   * Converts a int value to byte by simply casting it
   * 
   * @param lng
   *          the long value to convert
   * @return the resulting byte.
   */
  public static byte from(int i) {
    return (byte) i;
  }

  /**
   * Converts a double value to byte by simply casting it
   * 
   * @param dbl
   *          the double value to convert
   * @return the resulting byte.
   */
  public static byte from(double dbl) {
    return (byte) dbl;
  }

  /**
   * Converts a float value to byte by simply casting it
   * 
   * @param flt
   *          the float value to convert
   * @return the resulting byte.
   */
  public static byte from(float flt) {
    return (byte) flt;
  }

  /**
   * Converts a boolean value to byte, {@code true} resulting in {@code 1} and {@code false}
   * resulting in {@code 0}
   * 
   * @param bool
   *          the boolean value to convert
   * @return the resulting byte.
   * @see PrInt#from(boolean)
   */
  public static byte from(boolean bool) {
    return from(PrInt.from(bool));
  }

  /**
   * calls {@link PrInt#random()} and casts the result to {@code byte}
   * 
   * @return a pseudorandom byte value.
   * @see Random
   * @see PrInt#random()
   */
  public static byte random() {
    return from(PrInt.random());
  }
}
