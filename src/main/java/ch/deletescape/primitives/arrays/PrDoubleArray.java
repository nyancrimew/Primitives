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

  /**
   * Concatenate any number of double arrays
   * 
   * @param arrays
   *          the {@code double} arrays to concatenate
   * @return an {@code double} array cotaining the values of all {@code arrays}
   */
  public static double[] concatAll(double[]... arrays) {
    int totalLength = 0;
    for (double[] array : arrays) {
      totalLength += array.length;
    }
    double[] result = new double[totalLength];
    int offset = 0;
    for (double[] array : arrays) {
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
  public static boolean contains(double[] array, double value) {
    for (double item : array) {
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
  public static double[] distinct(double[] array) {
    double[] tmp = new double[array.length];
    int i = 0;
    for (double item : array) {
      if (!contains(tmp, item)) {
        tmp[i] = item;
        i++;
      }
    }
    double[] distincts = new double[i];
    System.arraycopy(tmp, 0, distincts, 0, i);
    return distincts;
  }
}
