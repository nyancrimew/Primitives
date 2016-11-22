package ch.deletescape.primitives.arrays;

import java.util.Random;

import ch.deletescape.primitives.PrChar;

public final class PrCharArray {
  /**
   * Private Constructor to prevent initialization
   */
  private PrCharArray() {
  }

  /**
   * Converts a long array to a char array using {@link PrChar#from(long)}
   * 
   * @param lngArr
   *          the long array to convert
   * @return the resulting char array.
   * @see PrChar#from(long)
   */
  public static char[] from(long[] lngArr) {
    char[] tmp = new char[lngArr.length];
    for (int i = 0; i < lngArr.length; i++) {
      tmp[i] = PrChar.from(lngArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a short array to a char array using {@link PrChar#from(short)}
   * 
   * @param shrtArr
   *          the short array to convert
   * @return the resulting char array.
   * @see PrChar#from(short)
   */
  public static char[] from(short[] shrtArr) {
    char[] tmp = new char[shrtArr.length];
    for (int i = 0; i < shrtArr.length; i++) {
      tmp[i] = PrChar.from(shrtArr[i]);
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
      tmp[i] = PrChar.from(bArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a int array to a char array using {@link PrChar#from(int)}
   * 
   * @param iArr
   *          the int array to convert
   * @return the resulting char array.
   * @see PrChar#from(int)
   */
  public static char[] from(int[] iArr) {
    char[] tmp = new char[iArr.length];
    for (int i = 0; i < iArr.length; i++) {
      tmp[i] = PrChar.from(iArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a double array to a char array using {@link PrChar#from(double)}
   * 
   * @param dblArr
   *          the double array to convert
   * @return the resulting char array.
   * @see PrChar#from(double)
   */
  public static char[] from(double[] dblArr) {
    char[] tmp = new char[dblArr.length];
    for (int i = 0; i < dblArr.length; i++) {
      tmp[i] = PrChar.from(dblArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a float array to a char array using {@link PrChar#from(float)}
   * 
   * @param fltArr
   *          the float array to convert
   * @return the resulting char array.
   * @see PrChar#from(float)
   */
  public static char[] from(float[] fltArr) {
    char[] tmp = new char[fltArr.length];
    for (int i = 0; i < fltArr.length; i++) {
      tmp[i] = PrChar.from(fltArr[i]);
    }
    return tmp;
  }

  /**
   * Converts a boolean array to a char array using {@link PrChar#from(boolean)}
   * 
   * @param boolArr
   *          the boolean array to convert
   * @return the resulting char array.
   * @see PrChar#from(boolean)
   */
  public static char[] from(boolean[] boolArr) {
    char[] tmp = new char[boolArr.length];
    for (int i = 0; i < boolArr.length; i++) {
      tmp[i] = PrChar.from(boolArr[i]);
    }
    return tmp;
  }

  /**
   * Creates an array of random char values using {@link PrChar#random()}
   * 
   * @param size
   *          the amount of random values
   * @return an array pseudorandom char values.
   * @see Random
   * @see PrChar#random()
   */
  public static char[] random(int size) {
    char[] tmp = new char[size];
    for (int i = 0; i < size; i++) {
      tmp[i] = PrChar.random();
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
}
