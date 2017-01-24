package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.Doubles;

public final class DoubleArrays {
  private static final double DELTA = 0.001;

  /**
   * Private Constructor to prevent initialization
   */
  private DoubleArrays() {}

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
   * Converts a boolean array to a double array using {@link Doubles#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting double array.
   * @see Doubles#from(boolean)
   */
  public static double[] from(boolean[] boolArr) {
    double[] tmp = new double[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = Doubles.from(boolArr[i]);
    }
    return tmp;
  }

  /**
   * Creates an array of random double values using {@link Doubles#random()}
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom double values.
   * @see Random
   * @see Doubles#random()
   */
  public static double[] random(int size) {
    double[] tmp = new double[size];
    for (int i = 0; i < size; i++) {
      tmp[i] = Doubles.random();
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
   * Returns true if the array contains the specified value, a delta of
   * {@code 0.001} is used for equality checks
   * 
   * @param array
   *          the array to search for {@code value}
   * @param value
   *          the value to check for
   * @return whether or not {@code array} contains {@code value}
   */
  public static boolean contains(double[] array, double value) {
    for (double item : array) {
      if (Doubles.equality(item, value, DELTA)) {
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
        tmp[i++] = item;
      }
    }
    double[] distincts = new double[i];
    System.arraycopy(tmp, 0, distincts, 0, i);
    return distincts;
  }

  /**
   * Finds the first occurrence of a sequence of values in an array, a delta of
   * {@code 0.001} is used for equality checks
   * 
   * @param array
   *          the array to search
   * @param sequence
   *          the sequence to search for
   * @return the index of the first sequence occurrence inside {@code array} or {@code -1} if the
   *         sequence isn't found
   */
  public static int findSequence(double[] array, double... sequence) {
    return findSequence(0, array, sequence);
  }

  /**
   * Finds the first occurrence starting from {@code fromIndex} of a sequence of values in an array
   * 
   * @param fromIndex
   *          the index from where to start searching
   * @param array
   *          the array to search
   * @param sequence
   *          the sequence to search for
   * @return the index of the first sequence occurrence inside {@code array} or {@code -1} if the
   *         sequence isn't found
   */
  public static int findSequence(int fromIndex, double[] array, double... sequence) {
    int seqLen = sequence.length;
    int maxIdx = array.length - seqLen;
    for (int i = Math.min(fromIndex, maxIdx); i <= maxIdx; i++) {
      for (int j = 0; Doubles.equality(array[i + j], sequence[j], DELTA); j++) {
        if (j == seqLen - 1) {
          return i;
        }
      }
    }
    return -1;
  }

  /**
   * Counts the number of times {@code sequence} can be found inside {@code array}
   * 
   * @param array
   *          the array to search
   * @param sequence
   *          the sequence to search for
   * @return the number of occurrences of {@code sequence} inside {@code array}
   * @see #findSequence(double[], double...)
   */
  public static int countSequence(double[] array, double... sequence) {
    return countSequence(0, array, sequence);
  }

  /**
   * Counts the number of times {@code sequence} can be found inside {@code array}, starting from
   * {@code from index}
   * 
   * @param fromIndex
   *          the index from where to start searching
   * @param array
   *          the array to search
   * @param sequence
   *          the sequence to search for
   * @return the number of occurrences of {@code sequence} inside {@code array}
   * @see #findSequence(int, double[], double...)
   */
  public static int countSequence(int fromIndex, double[] array, double... sequence) {
    int count = 0;
    int idx = fromIndex;
    int len = sequence.length;
    int maxIdx = array.length - 1;
    while (idx < maxIdx && (idx = findSequence(idx, array, sequence)) != -1) {
      count++;
      idx += len;
    }
    return count;
  }

  /**
   * Insert an array into another one starting at the specified {@code index}
   * 
   * @param array
   *          the array where you want to insert the values
   * @param insert
   *          the array to insert into {@code array}
   * @param index
   *          the index from where to start inserting the values
   * @return a new array, based on a copy of {@code array} with {@code insert} inserted into it
   */
  public static double[] insert(double[] array, double[] insert, int index) {
    int lenArr = array.length;
    int lenIns = insert.length;
    int idx = Math.max(0, Math.min(lenArr, index));
    int offset = Math.min(idx + 1, lenArr);
    double[] arr = new double[lenArr + lenIns];
    System.arraycopy(array, 0, arr, 0, offset);
    System.arraycopy(insert, 0, arr, idx, lenIns);
    System.arraycopy(array, idx, arr, idx + lenIns, lenArr - idx);
    return arr;
  }

  /**
   * Append values to the end of a double array
   * 
   * @param array
   *          the array to append the values to
   * @param values
   *          the values to append
   * @return a new array consisting of all values of {@code array} and {@code values}.
   * @see #insert(double[], double[], int)
   */
  public static double[] append(double[] array, double... values) {
    return insert(array, values, array.length);
  }

  /**
   * Returns the greater of any number values.
   * 
   * @param values
   *          the values to compare
   * @return the biggest value from {@code values}
   */
  public static double max(double... values) {
    if (values.length == 0) {
      throw new InvalidArrayException("Can't get max value from empty array");
    }
    double max = values[0];
    for (double i : values) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }

  /**
   * Returns the smaller of any number of values.
   * 
   * @param values
   *          the values to compare
   * @return the smallest value from {@code values}
   */
  public static double min(double... values) {
    if (values.length == 0) {
      throw new InvalidArrayException("Can't get min value from empty array");
    }
    double min = values[0];
    for (double i : values) {
      if (i < min) {
        min = i;
      }
    }
    return min;
  }

  /**
   * Returns the average of any number of values.
   * 
   * @param values
   *          the values to compare
   * @return the average value of {@code values}
   */
  public static double avg(double... values) {
    int len = values.length;
    if (len == 0) {
      throw new InvalidArrayException("Can't get average value from empty array");
    }
    return sum(values) / len;
  }

  /**
   * Returns the sum of any number of values.
   * 
   * @param values
   *          the values to sum up
   * @return the sum of {@code values}
   */
  public static double sum(double... values) {
    double total = 0;
    for (double i : values) {
      total += i;
    }
    return total;
  }
}
