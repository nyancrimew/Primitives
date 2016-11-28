package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.PrFloat;

public final class PrFloatArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrFloatArray() {}

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
  public static float[] from(short[] shrtArr) {
    float[] tmp = new float[shrtArr.length];
    for (int i = 0; i < shrtArr.length; i++) {
      tmp[i] = shrtArr[i];
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
  public static String join(CharSequence delimiter, float... elements) {
    String[] tmp = new String[elements.length];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = Float.toString(elements[i]);
    }
    return String.join(delimiter, tmp);
  }

  /**
   * Concatenate any number of float arrays
   * 
   * @param arrays
   *          the {@code float} arrays to concatenate
   * @return an {@code float} array cotaining the values of all {@code arrays}
   */
  public static float[] concatAll(float[]... arrays) {
    int totalLength = 0;
    for (float[] array : arrays) {
      totalLength += array.length;
    }
    float[] result = new float[totalLength];
    int offset = 0;
    for (float[] array : arrays) {
      System.arraycopy(array, 0, result, offset, array.length);
      offset += array.length;
    }
    return result;
  }

  /**
   * Returns true if the array contains the specified value
   * 
   * @param array
   *          the array to search for {@code value}
   * @param value
   *          the value to check for
   * @return whether or not {@code array} contains {@code value}
   */
  public static boolean contains(float[] array, float value) {
    for (float item : array) {
      if (item == value) {
        return true;
      }
    }
    return false;
  }

  /**
   * Returns a new array containing only the unique values of the original array
   * 
   * @param array
   *          the array to search
   * @return only the distinct values in {@code array}
   */
  public static float[] distinct(float[] array) {
    float[] tmp = new float[array.length];
    int i = 0;
    for (float item : array) {
      if (!contains(tmp, item)) {
        tmp[i] = item;
        i++;
      }
    }
    float[] distincts = new float[i];
    System.arraycopy(tmp, 0, distincts, 0, i);
    return distincts;
  }
}
