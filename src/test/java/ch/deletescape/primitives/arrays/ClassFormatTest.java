package ch.deletescape.primitives.arrays;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * "Pseudo test" to get coverage for private empty constructors.
 * Yes, I don't like this. Yes it is ugly, but it makes the coverage reports a lot more readable
 * 
 * @author deletescape
 */
public class ClassFormatTest {

  @Test
  public void test() throws Exception {
    Class<?>[] classes = new Class[] { PrBoolArray.class, PrByteArray.class, PrCharArray.class, PrDoubleArray.class,
        PrFloatArray.class, PrIntArray.class, PrLongArray.class, PrShortArray.class };
    for (Class<?> clazz : classes) {

      // Class should be final
      int classModifiers = clazz.getModifiers();
      assertTrue(clazz.getName() + " is not final!", Modifier.isFinal(classModifiers));

      Constructor<?> constructor = clazz.getDeclaredConstructor();
      // Constructor should be private
      int modifiers = constructor.getModifiers();
      assertTrue("Default constructor in " + clazz.getName() + " is not private!", Modifier.isPrivate(modifiers));

      constructor.setAccessible(true);
      constructor.newInstance();
    }
  }

}
