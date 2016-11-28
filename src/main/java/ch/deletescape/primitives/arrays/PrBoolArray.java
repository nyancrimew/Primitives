package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.PrBool;

public final class PrBoolArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrBoolArray() {}

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

  /**
   * Creates an array of random boolean values using {@link PrBool#random()}
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom boolean values.
   * @see Random
   * @see PrBool#random()
   */
  public static boolean[] random(int size) {
    boolean[] tmp = new boolean[size];
    for (int i = 0; i < size; i++) {
      tmp[i] = PrBool.random();
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
  public static String join(CharSequence delimiter, boolean... elements) {
    String[] tmp = new String[elements.length];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = elements[i] ? "true" : "false";
    }
    return String.join(delimiter, tmp);
  }

  /**
   * Concatenate any number of boolean arrays
   * 
   * @param arrays
   *          the {@code boolean} arrays to concatenate
   * @return an {@code boolean} array cotaining the values of all {@code arrays}
   */
  public static boolean[] concatAll(boolean[]... arrays) {
    int totalLength = 0;
    for (boolean[] array : arrays) {
      totalLength += array.length;
    }
    boolean[] result = new boolean[totalLength];
    int offset = 0;
    for (boolean[] array : arrays) {
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
  public static boolean contains(boolean[] array, boolean value) {
    for (boolean item : array) {
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
  public static boolean[] distinct(boolean[] array) {
    if (array.length == 0) {
      return new boolean[0];
    }
    boolean first = array[0];
    if (contains(array, !first)) {
      return new boolean[] { first, !first };
    } else {
      return new boolean[] { first };
    }
  }
}
