package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.PrDouble;

public final class PrDoubleArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrDoubleArray() {
  }

  /**
   * Converts a int array to a double array
   * 
   * @param iArr
   *          the int array to convert
   * @return the resulting double array.
   */
  public static double[] from(int[] iArr) {
    double[] tmp = new double[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = iArr[i];
    }
    return tmp;
  }

  /**
   * Converts a char array to a double array
   * 
   * @param cArr
   *          the char array to convert
   * @return the resulting double array.
   */
  public static double[] from(char[] cArr) {
    double[] tmp = new double[cArr.length];
    for (int i = 0; i < cArr.length; i++) {
      tmp[i] = cArr[i];
    }
    return tmp;
  }

  /**
   * Converts a byte array to a double array
   * 
   * @param bArr
   *          the byte array to convert
   * @return the resulting double array.
   */
  public static double[] from(byte[] bArr) {
    double[] tmp = new double[bArr.length];
    for (int i = 0; i < bArr.length; i++) {
      tmp[i] = bArr[i];
    }
    return tmp;
  }

  /**
   * Converts a short array to a double array
   * 
   * @param shrtArr
   *          the short array to convert
   * @return the resulting double array.
   */
  public static double[] from(short[] shrtArr) {
    double[] tmp = new double[shrtArr.length];
    for (int i = 0; i < shrtArr.length; i++) {
      tmp[i] = shrtArr[i];
    }
    return tmp;
  }

  /**
   * Converts a float array to a double array
   * 
   * @param fltArr
   *          the float array to convert
   * @return the resulting double array.
   */
  public static double[] from(float[] fltArr) {
    double[] tmp = new double[fltArr.length];
    for (int i = 0; i < fltArr.length; i++) {
      tmp[i] = fltArr[i];
    }
    return tmp;
  }

  /**
   * Converts a long array to a double array
   * 
   * @param lngArr
   *          the long array to convert
   * @return the resulting double array.
   */
  public static double[] from(long[] lngArr) {
    double[] tmp = new double[lngArr.length];
    for (int i = 0; i < lngArr.length; i++) {
      tmp[i] = lngArr[i];
    }
    return tmp;
  }

  /**
   * Converts a boolean array to a double array using {@link PrDouble#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting double array.
   * @see PrDouble#from(boolean)
   */
  public static double[] from(boolean[] boolArr) {
    double[] tmp = new double[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = PrDouble.from(boolArr[i]);
    }
    return tmp;
  }

  /**
   * Creates an array of random double values using {@link PrDouble#random()}
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom double values.
   * @see Random
   * @see PrDouble#random()
   */
  public static double[] random(int size) {
    double[] tmp = new double[size];
    for (int i = 0; i < size; i++) {
      tmp[i] = PrDouble.random();
    }
    return tmp;
  }

  /**
   * See {@link String#join(CharSequence, CharSequence...)}
   * 
   * @param delimiter
   *          the delimiter that separates each element
   * @param elements
   *          the elements to join together.
   * @return a new {@code String} that is composed of the {@code elements} separated by the
   *         {@code delimiter}
   * @see String#join(CharSequence, CharSequence...)
   */
  public static String join(CharSequence delimiter, double... elements) {
    String[] tmp = new String[elements.length];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = Double.toString(elements[i]);
    }
    return String.join(delimiter, tmp);
  }
}
