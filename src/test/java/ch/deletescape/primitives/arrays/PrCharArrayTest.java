package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrCharArrayTest {
  @Test
  public void fromLong() {
    assertThat(PrCharArray.from(new long[] { 1L, Long.MAX_VALUE, Long.MAX_VALUE - 1 }),
        is(new char[] { 1, (char) -1, (char) -2 }));
  }

  @Test
  public void fromInt() {
    assertThat(PrCharArray.from(new int[] { 1, Integer.MAX_VALUE }), is(new char[] { 1, (char) -1 }));
  }

  @Test
  public void fromByte() {
    assertThat(PrCharArray.from(new byte[] { 1, Byte.MAX_VALUE }), is(new char[] { 1, 127 }));
  }

  @Test
  public void fromShort() {
    assertThat(PrCharArray.from(new short[] { 0, Short.MAX_VALUE, 1 }), is(new char[] { 0, (char) 32767, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(PrCharArray.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new char[] { 1, 1, (char) -1 }));
  }

  @Test
  public void fromFloat() {
    assertThat(PrCharArray.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new char[] { 1, 1, (char) -1 }));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrCharArray.from(new boolean[] { true, false }), is(new char[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(PrCharArray.join(";", 'a', 'b', ';'), is("a;b;;"));
  }

  @Test
  public void concat() {
    assertThat(PrCharArray.concatAll(new char[] { 1, 3 }, new char[] { 'a', 5 }), is(new char[] { 1, 3, 'a', 5 }));
  }

  @Test
  public void contains() {
    assertThat(PrCharArray.contains(new char[] { 1, 3 }, (char) 3), is(true));
    assertThat(PrCharArray.contains(new char[] { 1, 3 }, (char) 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(PrCharArray.distinct(new char[] { 1, 2, 1, 3 }), is(new char[] { 1, 2, 3 }));
    assertThat(PrCharArray.distinct(new char[0]), is(new char[0]));
  }
}
