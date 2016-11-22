package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrBoolArrayTest {
  @Test
  public void fromLong() {
    assertThat(PrBoolArray.from(new long[] { 1L, Long.MAX_VALUE }), is(new boolean[] { true, false }));
  }

  @Test
  public void fromInt() {
    assertThat(PrBoolArray.from(new int[] { 1, Integer.MAX_VALUE }), is(new boolean[] { true, false }));
  }

  @Test
  public void fromShort() {
    assertThat(PrBoolArray.from(new short[] { 1, Short.MAX_VALUE }), is(new boolean[] { true, false }));
  }

  @Test
  public void fromChar() {
    assertThat(PrBoolArray.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new boolean[] { false, false, true }));
  }

  @Test
  public void fromDouble() {
    assertThat(PrBoolArray.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new boolean[] { true, false, false }));
  }

  @Test
  public void fromFloat() {
    assertThat(PrBoolArray.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new boolean[] { true, false, false }));
  }

  @Test
  public void fromByte() {
    assertThat(PrBoolArray.from(new byte[] { 1, 2 }), is(new boolean[] { true, false }));
  }

  @Test
  public void join() {
    assertThat(PrBoolArray.join(";", true, false), is("true;false"));
  }
}
