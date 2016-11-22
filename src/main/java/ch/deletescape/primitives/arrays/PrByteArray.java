package ch.deletescape.primitives.arrays;

import ch.deletescape.primitives.PrByte;

public class PrByteArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrByteArray() {
  }

  /**
   * Converts a long array to a byte array using {@link PrByte#from(long)}
   * 
   * @param lngArr
   *          the long array to convert
   * @return the resulting byte array.
   * @see PrByte#from(long)
   */
  public static byte[] from(long[] lngArr) {
    byte[] tmp = new byte[lngArr.length];
    for (int i = 0; i < lngArr.length; i++) {
      tmp[i] = PrByte.from(lngArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a char array to a byte array using {@link PrByte#from(char)}
   * 
   * @param cArr
   *          the char array to convert
   * @return the resulting byte array.
   * @see PrByte#from(char)
   */
  public static byte[] from(char[] cArr) {
    byte[] tmp = new byte[cArr.length];
    for (int i = 0; i < cArr.length; i++) {
      tmp[i] = PrByte.from(cArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a short array to a byte array using {@link PrByte#from(short)}
   * 
   * @param shrtArr
   *          the short array to convert
   * @return the resulting byte array.
   * @see PrByte#from(short)
   */
  public static byte[] from(short[] shrtArr) {
    byte[] tmp = new byte[shrtArr.length];
    for (int i = 0; i < shrtArr.length; i++) {
      tmp[i] = PrByte.from(shrtArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a int array to a byte array using {@link PrByte#from(int)}
   * 
   * @param iArr
   *          the int array to convert
   * @return the resulting byte array.
   * @see PrByte#from(int)
   */
  public static byte[] from(int[] iArr) {
    byte[] tmp = new byte[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = PrByte.from(iArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a double array to a byte array using {@link PrByte#from(double)}
   * 
   * @param dblArr
   *          the double array to convert
   * @return the resulting byte array.
   * @see PrByte#from(double)
   */
  public static byte[] from(double[] dblArr) {
    byte[] tmp = new byte[dblArr.length];
    for (int i = 0; i < dblArr.length; i++) {
      tmp[i] = PrByte.from(dblArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a float array to a byte array using {@link PrByte#from(float)}
   * 
   * @param fltArr
   *          the float array to convert
   * @return the resulting byte array.
   * @see PrByte#from(float)
   */
  public static byte[] from(float[] fltArr) {
    byte[] tmp = new byte[fltArr.length];
    for (int i = 0; i < fltArr.length; i++) {
      tmp[i] = PrByte.from(fltArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a boolean array to a byte array using {@link PrByte#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting byte array.
   * @see PrByte#from(boolean)
   */
  public static byte[] from(boolean[] boolArr) {
    byte[] tmp = new byte[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = PrByte.from(boolArr[i]);
    }
    return tmp;
  }
}
