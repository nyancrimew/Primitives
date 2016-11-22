package ch.deletescape.primitives.arrays;

import ch.deletescape.primitives.PrBool;

public final class PrBoolArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrBoolArray() {
  }

  /**
   * Converts a long array to a boolean array using {@link PrBool#from(long)}
   * 
   * @param lngArr
   *          the long array to convert
   * @return the resulting boolean array.
   * @see PrBool#from(long)
   */
  public static boolean[] from(long[] lngArr) {
    boolean[] tmp = new boolean[lngArr.length];
    for (int i = 0; i < lngArr.length; i++) {
      tmp[i] = PrBool.from(lngArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a char array to a boolean array using {@link PrBool#from(char)}
   * 
   * @param cArr
   *          the char array to convert
   * @return the resulting boolean array.
   * @see PrBool#from(char)
   */
  public static boolean[] from(char[] cArr) {
    boolean[] tmp = new boolean[cArr.length];
    for (int i = 0; i < cArr.length; i++) {
      tmp[i] = PrBool.from(cArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a short array to a boolean array using {@link PrBool#from(short)}
   * 
   * @param shrtArr
   *          the short array to convert
   * @return the resulting boolean array.
   * @see PrBool#from(short)
   */
  public static boolean[] from(short[] shrtArr) {
    boolean[] tmp = new boolean[shrtArr.length];
    for (int i = 0; i < shrtArr.length; i++) {
      tmp[i] = PrBool.from(shrtArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a int array to a boolean array using {@link PrBool#from(int)}
   * 
   * @param iArr
   *          the int array to convert
   * @return the resulting boolean array.
   * @see PrBool#from(int)
   */
  public static boolean[] from(int[] iArr) {
    boolean[] tmp = new boolean[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = PrBool.from(iArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a double array to a boolean array using {@link PrBool#from(double)}
   * 
   * @param dblArr
   *          the double array to convert
   * @return the resulting boolean array.
   * @see PrBool#from(double)
   */
  public static boolean[] from(double[] dblArr) {
    boolean[] tmp = new boolean[dblArr.length];
    for (int i = 0; i < dblArr.length; i++) {
      tmp[i] = PrBool.from(dblArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a float array to a boolean array using {@link PrBool#from(float)}
   * 
   * @param fltArr
   *          the float array to convert
   * @return the resulting boolean array.
   * @see PrBool#from(float)
   */
  public static boolean[] from(float[] fltArr) {
    boolean[] tmp = new boolean[fltArr.length];
    for (int i = 0; i < fltArr.length; i++) {
      tmp[i] = PrBool.from(fltArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a byte array to a boolean array using {@link PrBool#from(byte)}
   * 
   * @param bArr
   *          the byte array to convert
   * @return the resulting boolean array.
   * @see PrBool#from(byte)
   */
  public static boolean[] from(byte[] bArr) {
    boolean[] tmp = new boolean[bArr.length];
    for (int i = 0; i < bArr.length; i++) {
      tmp[i] = PrBool.from(bArr[i]);
    }
    return tmp;
  }
}
