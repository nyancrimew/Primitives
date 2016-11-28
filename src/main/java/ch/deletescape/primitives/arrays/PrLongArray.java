package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.PrLong;

public final class PrLongArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrLongArray() {}

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
  public static long[] from(short[] shrtArr) {
    long[] tmp = new long[shrtArr.length];
    for (int i = 0; i < shrtArr.length; i++) {
      tmp[i] = shrtArr[i];
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

  /**
   * Creates an array of random long values using {@link PrLong#random()}
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom long values.
   * @see Random
   * @see PrLong#random()
   */
  public static long[] random(int size) {
    long[] tmp = new long[size];
    for (int i = 0; i < size; i++) {
      tmp[i] = PrLong.random();
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
  public static String join(CharSequence delimiter, long... elements) {
    String[] tmp = new String[elements.length];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = Long.toString(elements[i]);
    }
    return String.join(delimiter, tmp);
  }

  /**
   * Concatenate any number of long arrays
   * 
   * @param arrays
   *          the {@code long} arrays to concatenate
   * @return an {@code long} array cotaining the values of all {@code arrays}
   */
  public static long[] concatAll(long[]... arrays) {
    int totalLength = 0;
    for (long[] array : arrays) {
      totalLength += array.length;
    }
    long[] result = new long[totalLength];
    int offset = 0;
    for (long[] array : arrays) {
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
  public static boolean contains(long[] array, long value) {
    for (long item : array) {
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
  public static long[] distinct(long[] array) {
    long[] tmp = new long[array.length];
    int i = 0;
    for (long item : array) {
      if (!contains(tmp, item)) {
        tmp[i] = item;
        i++;
      }
    }
    long[] distincts = new long[i];
    System.arraycopy(tmp, 0, distincts, 0, i);
    return distincts;
  }
}
