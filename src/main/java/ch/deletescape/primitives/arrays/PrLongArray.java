package ch.deletescape.primitives.arrays;

import ch.deletescape.primitives.PrLong;

public final class PrLongArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrLongArray() {
  }

  /**
   * Converts a int array to a long array
   * 
   * @param iArr
   *          the int array to convert
   * @return the resulting long array.
   */
  public static long[] from(int[] iArr) {
    long[] tmp = new long[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = iArr[i];
    }
    return tmp;
  }

  /**
   * Converts a char array to a long array
   * 
   * @param cArr
   *          the char array to convert
   * @return the resulting long array.
   */
  public static long[] from(char[] cArr) {
    long[] tmp = new long[cArr.length];
    for (int i = 0; i < cArr.length; i++) {
      tmp[i] = cArr[i];
    }
    return tmp;
  }

  /**
   * Converts a byte array to a long array
   * 
   * @param bArr
   *          the byte array to convert
   * @return the resulting long array.
   */
  public static long[] from(byte[] bArr) {
    long[] tmp = new long[bArr.length];
    for (int i = 0; i < bArr.length; i++) {
      tmp[i] = bArr[i];
    }
    return tmp;
  }

  /**
   * Converts a short array to a long array
   * 
   * @param shrtArr
   *          the short array to convert
   * @return the resulting long array.
   */
  public static long[] from(short[] iArr) {
    long[] tmp = new long[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = iArr[i];
    }
    return tmp;
  }

  /**
   * Converts a double array to a long array using {@link PrLong#from(double)}
   * 
   * @param dblArr
   *          the double array to convert
   * @return the resulting long array.
   * @see PrLong#from(double)
   */
  public static long[] from(double[] dblArr) {
    long[] tmp = new long[dblArr.length];
    for (int i = 0; i < dblArr.length; i++) {
      tmp[i] = PrLong.from(dblArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a float array to a long array using {@link PrLong#from(float)}
   * 
   * @param fltArr
   *          the float array to convert
   * @return the resulting long array.
   * @see PrLong#from(float)
   */
  public static long[] from(float[] fltArr) {
    long[] tmp = new long[fltArr.length];
    for (int i = 0; i < fltArr.length; i++) {
      tmp[i] = PrLong.from(fltArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a boolean array to a long array using {@link PrLong#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting long array.
   * @see PrLong#from(boolean)
   */
  public static long[] from(boolean[] boolArr) {
    long[] tmp = new long[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = PrLong.from(boolArr[i]);
    }
    return tmp;
  }
}
