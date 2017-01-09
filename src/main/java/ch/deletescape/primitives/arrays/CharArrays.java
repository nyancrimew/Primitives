package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.Chars;

public final class CharArrays {
  /**
   * Private Constructor to prevent initialization
   */
  private CharArrays() {}

  /**
   * Converts a long array to a char array using {@link Chars#from(long)}
   * 
   * @param lngArr
   *          the long array to convert
   * @return the resulting char array.
   * @see Chars#from(long)
   */
  public static char[] from(long[] lngArr) {
    char[] tmp = new char[lngArr.length];
    for (int i = 0; i < lngArr.length; i++) {
      tmp[i] = Chars.from(lngArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a short array to a char array using {@link Chars#from(short)}
   * 
   * @param shrtArr
   *          the short array to convert
   * @return the resulting char array.
   * @see Chars#from(short)
   */
  public static char[] from(short[] shrtArr) {
    char[] tmp = new char[shrtArr.length];
    for (int i = 0; i < shrtArr.length; i++) {
      tmp[i] = Chars.from(shrtArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a byte array to a char array
   * 
   * @param bArr
   *          the byte array to convert
   * @return the resulting char array.
   */
  public static char[] from(byte[] bArr) {
    char[] tmp = new char[bArr.length];
    for (int i = 0; i < bArr.length; i++) {
      tmp[i] = Chars.from(bArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a int array to a char array using {@link Chars#from(int)}
   * 
   * @param iArr
   *          the int array to convert
   * @return the resulting char array.
   * @see Chars#from(int)
   */
  public static char[] from(int[] iArr) {
    char[] tmp = new char[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = Chars.from(iArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a double array to a char array using {@link Chars#from(double)}
   * 
   * @param dblArr
   *          the double array to convert
   * @return the resulting char array.
   * @see Chars#from(double)
   */
  public static char[] from(double[] dblArr) {
    char[] tmp = new char[dblArr.length];
    for (int i = 0; i < dblArr.length; i++) {
      tmp[i] = Chars.from(dblArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a float array to a char array using {@link Chars#from(float)}
   * 
   * @param fltArr
   *          the float array to convert
   * @return the resulting char array.
   * @see Chars#from(float)
   */
  public static char[] from(float[] fltArr) {
    char[] tmp = new char[fltArr.length];
    for (int i = 0; i < fltArr.length; i++) {
      tmp[i] = Chars.from(fltArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a boolean array to a char array using {@link Chars#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting char array.
   * @see Chars#from(boolean)
   */
  public static char[] from(boolean[] boolArr) {
    char[] tmp = new char[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = Chars.from(boolArr[i]);
    }
    return tmp;
  }

  /**
   * Creates an array of random char values using {@link Chars#random()}
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom char values.
   * @see Random
   * @see Chars#random()
   */
  public static char[] random(int size) {
    char[] tmp = new char[size];
    for (int i = 0; i < size; i++) {
      tmp[i] = Chars.random();
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
  public static String join(CharSequence delimiter, char... elements) {
    String[] tmp = new String[elements.length];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = Character.toString(elements[i]);
    }
    return String.join(delimiter, tmp);
  }

  /**
   * Concatenate any number of char arrays
   * 
   * @param arrays
   *          the {@code char} arrays to concatenate
   * @return an {@code char} array cotaining the values of all {@code arrays}
   */
  public static char[] concatAll(char[]... arrays) {
    int totalLength = 0;
    for (char[] array : arrays) {
      totalLength += array.length;
    }
    char[] result = new char[totalLength];
    int offset = 0;
    for (char[] array : arrays) {
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
  public static boolean contains(char[] array, char value) {
    for (char item : array) {
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
  public static char[] distinct(char[] array) {
    char[] tmp = new char[array.length];
    int i = 0;
    for (char item : array) {
      if (!contains(tmp, item)) {
        tmp[i++] = item;
      }
    }
    char[] distincts = new char[i];
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
   * @see CharArrays#findSequence(int, char[], char...)
   */
  public static int findSequence(char[] array, char... sequence) {
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
  public static int findSequence(int fromIndex, char[] array, char... sequence) {
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
   * @see #findSequence(char[], char...)
   */
  public static int countSequence(char[] array, char... sequence) {
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
   * @see #findSequence(int, char[], char...)
   */
  public static int countSequence(int fromIndex, char[] array, char... sequence) {
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
  public static char[] insert(char[] array, char[] insert, int index) {
    int lenArr = array.length;
    int lenIns = insert.length;
    int idx = Math.max(0, Math.min(lenArr, index));
    int offset = Math.min(idx + 1, lenArr);
    char[] arr = new char[lenArr + lenIns];
    System.arraycopy(array, 0, arr, 0, offset);
    System.arraycopy(insert, 0, arr, idx, lenIns);
    System.arraycopy(array, idx, arr, idx + lenIns, lenArr - idx);
    return arr;
  }

  /**
   * Append values to the end of a char array
   * 
   * @param array
   *          the array to append the values to
   * @param values
   *          the values to append
   * @return a new array consisting of all values of {@code array} and {@code values}.
   * @see #insert(char[], char[], int)
   */
  public static char[] append(char[] array, char... values) {
    return insert(array, values, array.length);
  }

  /**
   * Returns the greater of any number values.
   * 
   * @param values
   *          the values to compare
   * @return the biggest value from {@code values}
   */
  public static char max(char... values) {
    if (values.length == 0) {
      throw new InvalidArrayException("Can't get max value from empty array");
    }
    char max = values[0];
    for (char i : values) {
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
  public static char min(char... values) {
    if (values.length == 0) {
      throw new InvalidArrayException("Can't get min value from empty array");
    }
    char min = values[0];
    for (char i : values) {
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
  public static double avg(char... values) {
    int len = values.length;
    if (len == 0) {
      throw new InvalidArrayException("Can't get average value from empty array");
    }
    char total = 0;
    for (char i : values) {
      total += i;
    }
    return total / (double) len;
  }
}
