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

  @Test
  public void concat() {
    assertThat(PrLongArray.concatAll(new long[] { 1, 3 }, new long[] { -2, 5 }), is(new long[] { 1, 3, -2, 5 }));
  }

  @Test
  public void contains() {
    assertThat(PrLongArray.contains(new long[] { 1, 3 }, 3), is(true));
    assertThat(PrLongArray.contains(new long[] { 1, 3 }, 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(PrLongArray.distinct(new long[] { 1, 2, 1, 3 }), is(new long[] { 1, 2, 3 }));
    assertThat(PrLongArray.distinct(new long[0]), is(new long[0]));
  }

  @Test
  public void findSequence() {
    assertThat(PrLongArray.findSequence(2, new long[] { 1, 2, 1, 3 }, 2, 1), is(-1));
    assertThat(PrLongArray.findSequence(2, new long[] { 1, 2, 1, 2 }, 1, 2), is(2));

    assertThat(PrLongArray.findSequence(new long[] { 1, 2, 1, 3 }, 2, 1), is(1));
    assertThat(PrLongArray.findSequence(new long[] { 1, 2, 1, 3 }, 1, 3), is(2));
    assertThat(PrLongArray.findSequence(new long[] { 1, 2, 1, 3 }, 1, 1), is(-1));
    assertThat(PrLongArray.findSequence(new long[] { 1, 2, 1, 3 }, (long) 3), is(3));
    assertThat(PrLongArray.findSequence(new long[] { 1, 2, 1, 3 }, (long) 4), is(-1));
  }

  @Test
  public void insert() {
    assertThat(PrLongArray.insert(new long[] { 1, 2, 3, 4 }, new long[] { 10, 11 }, 2),
        is(new long[] { 1, 2, 10, 11, 3, 4 }));
    assertThat(PrLongArray.insert(new long[] { 1, 2, 3, 4 }, new long[0], 0), is(new long[] { 1, 2, 3, 4 }));
    assertThat(PrLongArray.insert(new long[] { 1, 2, 3, 4 }, new long[] { 10, 11 }, 5),
        is(new long[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(PrLongArray.insert(new long[] { 1, 2, 3, 4 }, new long[] { 10, 11 }, -4),
        is(new long[] { 10, 11, 1, 2, 3, 4 }));
  }

  @Test
  public void append() {
    assertThat(PrLongArray.append(new long[] { 1, 2, 3, 4 }, 10, 11), is(new long[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(PrLongArray.append(new long[] { 1, 2, 3, 4 }), is(new long[] { 1, 2, 3, 4 }));
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    PrLongArray.random(1);
  }
}
