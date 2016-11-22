package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrDoubleArrayTest {
  @Test
  public void fromInt() {
    assertThat(PrDoubleArray.from(new int[] { 1, Integer.MAX_VALUE, Integer.MAX_VALUE - 1 }),
        is(new double[] { 1, 2147483647, 2147483646 }));
  }

  @Test
  public void fromShort() {
    assertThat(PrDoubleArray.from(new short[] { 1, Short.MAX_VALUE }), is(new double[] { 1, 32767 }));
  }

  @Test
  public void fromByte() {
    assertThat(PrDoubleArray.from(new byte[] { 1, Byte.MAX_VALUE }), is(new double[] { 1, 127 }));
  }

  @Test
  public void fromChar() {
    assertThat(PrDoubleArray.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new double[] { 0, 65535, 1 }));
  }

  @Test
  public void fromFloat() {
    assertThat(PrDoubleArray.from(new float[] { 1f, Float.MAX_VALUE }), is(new double[] { 1, 3.4028234663852886E38 }));
  }

  @Test
  public void fromLong() {
    assertThat(PrDoubleArray.from(new long[] { 1L, Long.MAX_VALUE }), is(new double[] { 1, 9223372036854775807f }));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrDoubleArray.from(new boolean[] { true, false }), is(new double[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(PrDoubleArray.join(";", 1.0, 2.5), is("1.0;2.5"));
  }
}
