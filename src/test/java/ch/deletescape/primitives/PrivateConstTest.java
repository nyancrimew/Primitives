package ch.deletescape.primitives;

import java.lang.reflect.Constructor;

import org.junit.Test;

/**
 * "Pseudo test" to get coverage for private empty constructors.
 * Yes, I don't like this. Yes it is ugly, but it makes the coverage reports a lot more readable
 * 
 * @author deletescape
 */
public class PrivateConstTest {

  @Test
  public void test() throws Exception {
    Class<?>[] classes = new Class[] { PrBool.class, PrByte.class, PrChar.class, PrDouble.class, PrFloat.class,
        PrInt.class, PrLong.class, PrShort.class, PrString.class };
    for (Class<?> clazz : classes) {
      Constructor<?> constructor = clazz.getDeclaredConstructor();
      constructor.setAccessible(true);
      constructor.newInstance();
    }
  }

}
