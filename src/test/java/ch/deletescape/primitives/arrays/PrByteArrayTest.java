package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrByteArrayTest {
  @Test
  public void fromLong() {
    assertThat(PrByteArray.from(new long[] { 1L, Long.MAX_VALUE, Long.MAX_VALUE - 1 }), is(new byte[] { 1, -1, -2 }));
  }

  @Test
  public void fromInt() {
    assertThat(PrByteArray.from(new int[] { 1, Integer.MAX_VALUE }), is(new byte[] { 1, -1 }));
  }

  @Test
  public void fromShort() {
    assertThat(PrByteArray.from(new short[] { 1, Short.MAX_VALUE }), is(new byte[] { 1, -1 }));
  }

  @Test
  public void fromChar() {
    assertThat(PrByteArray.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new byte[] { 0, -1, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(PrByteArray.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new byte[] { 1, 1, -1 }));
  }

  @Test
  public void fromFloat() {
    assertThat(PrByteArray.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new byte[] { 1, 1, -1 }));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrByteArray.from(new boolean[] { true, false }), is(new byte[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(PrByteArray.join(";", (byte) 1, (byte) 5, (byte) 30), is("1;5;30"));
  }
}
