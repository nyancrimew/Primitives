package ch.deletescape.primitives.arrays;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

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
      int constructorModifiers = constructor.getModifiers();
      assertTrue("Default constructor in " + clazz.getName() + " is not private!",
          Modifier.isPrivate(constructorModifiers));

      for (Method method : clazz.getDeclaredMethods()) {
        // Methods should be static
        int methodModifiers = method.getModifiers();
        assertTrue(method.toGenericString() + " is not static!", Modifier.isStatic(methodModifiers));
      }

      // Get coverage on the private constructor
      constructor.setAccessible(true);
      constructor.newInstance();
    }
  }

}
