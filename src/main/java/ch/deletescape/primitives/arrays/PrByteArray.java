package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.PrByte;

public final class PrByteArray {
  private static Random random;

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

  /**
   * Convenience method for {@link Random#nextBytes(byte[])}, the first time this method is called a
   * new
   * {@link Random} instance is created
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom byte values.
   * @see Random
   */
  public static byte[] random(int size) {
    if (random == null) {
      random = new Random();
    }
    byte[] tmp = new byte[size];
    random.nextBytes(tmp);
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
  public static String join(CharSequence delimiter, byte... elements) {
    String[] tmp = new String[elements.length];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = Byte.toString(elements[i]);
    }
    return String.join(delimiter, tmp);
  }

  /**
   * Concatenate any number of byte arrays
   * 
   * @param arrays
   *          the {@code byte} arrays to concatenate
   * @return an {@code byte} array cotaining the values of all {@code arrays}
   */
  public static byte[] concatAll(byte[]... arrays) {
    int totalLength = 0;
    for (byte[] array : arrays) {
      totalLength += array.length;
    }
    byte[] result = new byte[totalLength];
    int offset = 0;
    for (byte[] array : arrays) {
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
  public static boolean contains(byte[] array, byte value) {
    for (byte item : array) {
      if (item == value) {
        return true;
      }
    }
    return false;
  }
}
