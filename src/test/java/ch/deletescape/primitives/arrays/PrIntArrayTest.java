package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrIntArrayTest {
  @Test
  public void fromLong() {
    assertThat(PrIntArray.from(new long[] { 1L, Long.MAX_VALUE, Long.MAX_VALUE - 1 }), is(new int[] { 1, -1, -2 }));
  }

  @Test
  public void fromShort() {
    assertThat(PrIntArray.from(new short[] { 1, Short.MAX_VALUE }), is(new int[] { 1, 32767 }));
  }

  @Test
  public void fromByte() {
    assertThat(PrIntArray.from(new byte[] { 1, Byte.MAX_VALUE }), is(new int[] { 1, 127 }));
  }

  @Test
  public void fromChar() {
    assertThat(PrIntArray.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new int[] { 0, 65535, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(PrIntArray.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new int[] { 1, 1, 2147483647 }));
  }

  @Test
  public void fromFloat() {
    assertThat(PrIntArray.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new int[] { 1, 1, 2147483647 }));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrIntArray.from(new boolean[] { true, false }), is(new int[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(PrIntArray.join(";", 1, -20, 3), is("1;-20;3"));
  }
}
