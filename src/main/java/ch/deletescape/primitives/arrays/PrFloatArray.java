package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.PrFloat;

public final class PrFloatArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrFloatArray() {
  }

  /**
   * Converts a int array to a float array
   * 
   * @param iArr
   *          the int array to convert
   * @return the resulting float array.
   */
  public static float[] from(int[] iArr) {
    float[] tmp = new float[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = iArr[i];
    }
    return tmp;
  }

  /**
   * Converts a char array to a float array
   * 
   * @param cArr
   *          the char array to convert
   * @return the resulting float array.
   */
  public static float[] from(char[] cArr) {
    float[] tmp = new float[cArr.length];
    for (int i = 0; i < cArr.length; i++) {
      tmp[i] = cArr[i];
    }
    return tmp;
  }

  /**
   * Converts a byte array to a float array
   * 
   * @param bArr
   *          the byte array to convert
   * @return the resulting float array.
   */
  public static float[] from(byte[] bArr) {
    float[] tmp = new float[bArr.length];
    for (int i = 0; i < bArr.length; i++) {
      tmp[i] = bArr[i];
    }
    return tmp;
  }

  /**
   * Converts a short array to a float array
   * 
   * @param shrtArr
   *          the short array to convert
   * @return the resulting float array.
   */
  public static float[] from(short[] iArr) {
    float[] tmp = new float[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = iArr[i];
    }
    return tmp;
  }

  /**
   * Converts a double array to a float array using {@link PrFloat#from(double)}
   * 
   * @param dblArr
   *          the double array to convert
   * @return the resulting float array.
   * @see PrFloat#from(double)
   */
  public static float[] from(double[] dblArr) {
    float[] tmp = new float[dblArr.length];
    for (int i = 0; i < dblArr.length; i++) {
      tmp[i] = PrFloat.from(dblArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a long array to a float array
   * 
   * @param lngArr
   *          the long array to convert
   * @return the resulting float array.
   */
  public static float[] from(long[] lngArr) {
    float[] tmp = new float[lngArr.length];
    for (int i = 0; i < lngArr.length; i++) {
      tmp[i] = lngArr[i];
    }
    return tmp;
  }

  /**
   * Converts a boolean array to a float array using {@link PrFloat#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting float array.
   * @see PrFloat#from(boolean)
   */
  public static float[] from(boolean[] boolArr) {
    float[] tmp = new float[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = PrFloat.from(boolArr[i]);
    }
    return tmp;
  }

  /**
   * Creates an array of random float values using {@link PrFloat#random()}
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom float values.
   * @see Random
   * @see PrFloat#random()
   */
  public static float[] random(int size) {
    float[] tmp = new float[size];
    for (int i = 0; i < size; i++) {
      tmp[i] = PrFloat.random();
    }
    return tmp;
  }
}
