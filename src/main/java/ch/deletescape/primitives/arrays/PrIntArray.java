package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.PrInt;

public final class PrIntArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrIntArray() {
  }

  /**
   * Converts a long array to a int array using {@link PrInt#from(long)}
   * 
   * @param lngArr
   *          the long array to convert
   * @return the resulting int array.
   * @see PrInt#from(long)
   */
  public static int[] from(long[] lngArr) {
    int[] tmp = new int[lngArr.length];
    for (int i = 0; i < lngArr.length; i++) {
      tmp[i] = PrInt.from(lngArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a char array to a int array
   * 
   * @param cArr
   *          the char array to convert
   * @return the resulting int array.
   */
  public static int[] from(char[] cArr) {
    int[] tmp = new int[cArr.length];
    for (int i = 0; i < cArr.length; i++) {
      tmp[i] = cArr[i];
    }
    return tmp;
  }

  /**
   * Converts a byte array to a int array
   * 
   * @param bArr
   *          the byte array to convert
   * @return the resulting int array.
   */
  public static int[] from(byte[] bArr) {
    int[] tmp = new int[bArr.length];
    for (int i = 0; i < bArr.length; i++) {
      tmp[i] = bArr[i];
    }
    return tmp;
  }

  /**
   * Converts a short array to a int array
   * 
   * @param shrtArr
   *          the short array to convert
   * @return the resulting int array.
   */
  public static int[] from(short[] iArr) {
    int[] tmp = new int[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = iArr[i];
    }
    return tmp;
  }

  /**
   * Converts a double array to a int array using {@link PrInt#from(double)}
   * 
   * @param dblArr
   *          the double array to convert
   * @return the resulting int array.
   * @see PrInt#from(double)
   */
  public static int[] from(double[] dblArr) {
    int[] tmp = new int[dblArr.length];
    for (int i = 0; i < dblArr.length; i++) {
      tmp[i] = PrInt.from(dblArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a float array to a int array using {@link PrInt#from(float)}
   * 
   * @param fltArr
   *          the float array to convert
   * @return the resulting int array.
   * @see PrInt#from(float)
   */
  public static int[] from(float[] fltArr) {
    int[] tmp = new int[fltArr.length];
    for (int i = 0; i < fltArr.length; i++) {
      tmp[i] = PrInt.from(fltArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a boolean array to a int array using {@link PrInt#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting int array.
   * @see PrInt#from(boolean)
   */
  public static int[] from(boolean[] boolArr) {
    int[] tmp = new int[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = PrInt.from(boolArr[i]);
    }
    return tmp;
  }

  /**
   * Creates an array of random int values using {@link PrInt#random()}
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom int values.
   * @see Random
   * @see PrInt#random()
   */
  public static int[] random(int size) {
    int[] tmp = new int[size];
    for (int i = 0; i < size; i++) {
      tmp[i] = PrInt.random();
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
  public static String join(CharSequence delimiter, int... elements) {
    String[] tmp = new String[elements.length];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = Integer.toString(elements[i]);
    }
    return String.join(delimiter, tmp);
  }
}
