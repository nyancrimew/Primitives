package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.Ints;

public final class IntArrays {
  /**
   * Private Constructor to prevent initialization
   */
  private IntArrays() {}

  /**
   * Converts a long array to a int array using {@link Ints#from(long)}
   * 
   * @param lngArr
   *          the long array to convert
   * @return the resulting int array.
   * @see Ints#from(long)
   */
  public static int[] from(long[] lngArr) {
    int[] tmp = new int[lngArr.length];
    for (int i = 0; i < lngArr.length; i++) {
      tmp[i] = Ints.from(lngArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a char array to a int array
   * 
   * @param cArr
   *          the char array to convert
   * @return the resulting int array.
   */
  public static int[] from(char[] cArr) {
    int[] tmp = new int[cArr.length];
    for (int i = 0; i < cArr.length; i++) {
      tmp[i] = cArr[i];
    }
    return tmp;
  }

  /**
   * Converts a byte array to a int array
   * 
   * @param bArr
   *          the byte array to convert
   * @return the resulting int array.
   */
  public static int[] from(byte[] bArr) {
    int[] tmp = new int[bArr.length];
    for (int i = 0; i < bArr.length; i++) {
      tmp[i] = bArr[i];
    }
    return tmp;
  }

  /**
   * Converts a short array to a int array
   * 
   * @param shrtArr
   *          the short array to convert
   * @return the resulting int array.
   */
  public static int[] from(short[] shrtArr) {
    int[] tmp = new int[shrtArr.length];
    for (int i = 0; i < shrtArr.length; i++) {
      tmp[i] = shrtArr[i];
    }
    return tmp;
  }

  /**
   * Converts a double array to a int array using {@link Ints#from(double)}
   * 
   * @param dblArr
   *          the double array to convert
   * @return the resulting int array.
   * @see Ints#from(double)
   */
  public static int[] from(double[] dblArr) {
    int[] tmp = new int[dblArr.length];
    for (int i = 0; i < dblArr.length; i++) {
      tmp[i] = Ints.from(dblArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a float array to a int array using {@link Ints#from(float)}
   * 
   * @param fltArr
   *          the float array to convert
   * @return the resulting int array.
   * @see Ints#from(float)
   */
  public static int[] from(float[] fltArr) {
    int[] tmp = new int[fltArr.length];
    for (int i = 0; i < fltArr.length; i++) {
      tmp[i] = Ints.from(fltArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a boolean array to a int array using {@link Ints#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting int array.
   * @see Ints#from(boolean)
   */
  public static int[] from(boolean[] boolArr) {
    int[] tmp = new int[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = Ints.from(boolArr[i]);
    }
    return tmp;
  }

  /**
   * Creates an array of random int values using {@link Ints#random()}
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom int values.
   * @see Random
   * @see Ints#random()
   */
  public static int[] random(int size) {
    int[] tmp = new int[size];
    for (int i = 0; i < size; i++) {
      tmp[i] = Ints.random();
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
  public static String join(CharSequence delimiter, int... elements) {
    String[] tmp = new String[elements.length];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = Integer.toString(elements[i]);
    }
    return String.join(delimiter, tmp);
  }

  /**
   * Concatenate any number of int arrays
   * 
   * @param arrays
   *          the {@code int} arrays to concatenate
   * @return an {@code int} array cotaining the values of all {@code arrays}
   */
  public static int[] concatAll(int[]... arrays) {
    int totalLength = 0;
    for (int[] array : arrays) {
      totalLength += array.length;
    }
    int[] result = new int[totalLength];
    int offset = 0;
    for (int[] array : arrays) {
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
  public static boolean contains(int[] array, int value) {
    for (int item : array) {
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
  public static int[] distinct(int[] array) {
    int[] tmp = new int[array.length];
    int i = 0;
    for (int item : array) {
      if (!contains(tmp, item)) {
        tmp[i++] = item;
      }
    }
    int[] distincts = new int[i];
    System.arraycopy(tmp, 0, distincts, 0, i);
    return distincts;
  }

  /**
   * Finds the first occurrence of a sequence of values in an array
   * 
   * @param array
   *          the array to search
   * @param sequence
   *          the sequence to search for
   * @return the index of the first sequence occurrence inside {@code array} or {@code -1} if the
   *         sequence isn't found
   */
  public static int findSequence(int[] array, int... sequence) {
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
  public static int findSequence(int fromIndex, int[] array, int... sequence) {
    int seqLen = sequence.length;
    int maxIdx = array.length - seqLen;
    for (int i = Math.min(fromIndex, maxIdx); i <= maxIdx; i++) {
      for (int j = 0; array[i + j] == sequence[j]; j++) {
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
   * @see #findSequence(int[], int...)
   */
  public static int countSequence(int[] array, int... sequence) {
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
   * @see #findSequence(int, int[], int...)
   */
  public static int countSequence(int fromIndex, int[] array, int... sequence) {
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
  public static int[] insert(int[] array, int[] insert, int index) {
    int lenArr = array.length;
    int lenIns = insert.length;
    int idx = Math.max(0, Math.min(lenArr, index));
    int offset = Math.min(idx + 1, lenArr);
    int[] arr = new int[lenArr + lenIns];
    System.arraycopy(array, 0, arr, 0, offset);
    System.arraycopy(insert, 0, arr, idx, lenIns);
    System.arraycopy(array, idx, arr, idx + lenIns, lenArr - idx);
    return arr;
  }

  /**
   * Append values to the end of a int array
   * 
   * @param array
   *          the array to append the values to
   * @param values
   *          the values to append
   * @return a new array consisting of all values of {@code array} and {@code values}.
   * @see #insert(int[], int[], int)
   */
  public static int[] append(int[] array, int... values) {
    return insert(array, values, array.length);
  }

  /**
   * Returns the greater of any number values.
   * 
   * @param values
   *          the values to compare
   * @return the biggest value from {@code values}
   */
  public static int max(int... values) {
    if (values.length == 0) {
      throw new InvalidArrayException("Can't get max value from empty array");
    }
    int max = values[0];
    for (int i : values) {
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
  public static int min(int... values) {
    if (values.length == 0) {
      throw new InvalidArrayException("Can't get min value from empty array");
    }
    int min = values[0];
    for (int i : values) {
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
  public static double avg(int... values) {
    int len = values.length;
    if (len == 0) {
      throw new InvalidArrayException("Can't get average value from empty array");
    }
    return sum(values) / (double) len;
  }

  /**
   * Returns the sum of any number of values.
   * 
   * @param values
   *          the values to sum up
   * @return the sum of {@code values}
   */
  public static int sum(int... values) {
    int total = 0;
    for (int i : values) {
      total += i;
    }
    return total;
  }
}
