package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrLongArrayTest {
  @Test
  public void fromInt() {
    assertThat(PrLongArray.from(new int[] { 1, Integer.MAX_VALUE, Integer.MAX_VALUE - 1 }),
        is(new long[] { 1, 2147483647, 2147483646 }));
  }

  @Test
  public void fromShort() {
    assertThat(PrLongArray.from(new short[] { 1, Short.MAX_VALUE }), is(new long[] { 1, 32767 }));
  }

  @Test
  public void fromByte() {
    assertThat(PrLongArray.from(new byte[] { 1, Byte.MAX_VALUE }), is(new long[] { 1, 127 }));
  }

  @Test
  public void fromChar() {
    assertThat(PrLongArray.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new long[] { 0, 65535, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(PrLongArray.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }),
        is(new long[] { 1, 1, 9223372036854775807L }));
  }

  @Test
  public void fromFloat() {
    assertThat(PrLongArray.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }),
        is(new long[] { 1, 1, 9223372036854775807L }));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrLongArray.from(new boolean[] { true, false }), is(new long[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(PrLongArray.join(";", 2, 6), is("2;6"));
  }
}
