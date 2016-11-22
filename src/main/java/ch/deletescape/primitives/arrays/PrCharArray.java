package ch.deletescape.primitives.arrays;

import ch.deletescape.primitives.PrChar;

public final class PrCharArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrCharArray() {
  }

  /**
   * Converts a long array to a char array using {@link PrChar#from(long)}
   * 
   * @param lngArr
   *          the long array to convert
   * @return the resulting char array.
   * @see PrChar#from(long)
   */
  public static char[] from(long[] lngArr) {
    char[] tmp = new char[lngArr.length];
    for (int i = 0; i < lngArr.length; i++) {
      tmp[i] = PrChar.from(lngArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a short array to a char array using {@link PrChar#from(char)}
   * 
   * @param cArr
   *          the char array to convert
   * @return the resulting char array.
   * @see PrChar#from(short)
   */
  public static char[] from(short[] cArr) {
    char[] tmp = new char[cArr.length];
    for (int i = 0; i < cArr.length; i++) {
      tmp[i] = PrChar.from(cArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a byte array to a char array
   * 
   * @param shrtArr
   *          the byte array to convert
   * @return the resulting char array.
   */
  public static char[] from(byte[] bArr) {
    char[] tmp = new char[bArr.length];
    for (int i = 0; i < bArr.length; i++) {
      tmp[i] = PrChar.from(bArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a int array to a char array using {@link PrChar#from(int)}
   * 
   * @param iArr
   *          the int array to convert
   * @return the resulting char array.
   * @see PrChar#from(int)
   */
  public static char[] from(int[] iArr) {
    char[] tmp = new char[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = PrChar.from(iArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a double array to a char array using {@link PrChar#from(double)}
   * 
   * @param dblArr
   *          the double array to convert
   * @return the resulting char array.
   * @see PrChar#from(double)
   */
  public static char[] from(double[] dblArr) {
    char[] tmp = new char[dblArr.length];
    for (int i = 0; i < dblArr.length; i++) {
      tmp[i] = PrChar.from(dblArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a float array to a char array using {@link PrChar#from(float)}
   * 
   * @param fltArr
   *          the float array to convert
   * @return the resulting char array.
   * @see PrChar#from(float)
   */
  public static char[] from(float[] fltArr) {
    char[] tmp = new char[fltArr.length];
    for (int i = 0; i < fltArr.length; i++) {
      tmp[i] = PrChar.from(fltArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a boolean array to a char array using {@link PrChar#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting char array.
   * @see PrChar#from(boolean)
   */
  public static char[] from(boolean[] boolArr) {
    char[] tmp = new char[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = PrChar.from(boolArr[i]);
    }
    return tmp;
  }
}