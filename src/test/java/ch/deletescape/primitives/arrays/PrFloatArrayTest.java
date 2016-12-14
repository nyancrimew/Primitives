package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrFloatArrayTest {
  @Test
  public void fromInt() {
    assertThat(PrFloatArray.from(new int[] { 1, Integer.MAX_VALUE, Integer.MAX_VALUE - 1 }),
        is(new float[] { 1, 2147483647, 2147483646 }));
  }

  @Test
  public void fromShort() {
    assertThat(PrFloatArray.from(new short[] { 1, Short.MAX_VALUE }), is(new float[] { 1, 32767 }));
  }

  @Test
  public void fromByte() {
    assertThat(PrFloatArray.from(new byte[] { 1, Byte.MAX_VALUE }), is(new float[] { 1, 127 }));
  }

  @Test
  public void fromChar() {
    assertThat(PrFloatArray.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new float[] { 0, 65535, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(PrFloatArray.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }),
        is(new float[] { 1, 1.3f, Float.POSITIVE_INFINITY }));
  }

  @Test
  public void fromLong() {
    assertThat(PrFloatArray.from(new long[] { 1L, Long.MAX_VALUE }), is(new float[] { 1, 9223372036854775807f }));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrFloatArray.from(new boolean[] { true, false }), is(new float[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(PrFloatArray.join(";", 1f, 1.5f), is("1.0;1.5"));
  }

  @Test
  public void concat() {
    assertThat(PrFloatArray.concatAll(new float[] { 1, 3.34f }, new float[] { -2, 5 }),
        is(new float[] { 1, 3.34f, -2, 5 }));
  }

  @Test
  public void contains() {
    assertThat(PrFloatArray.contains(new float[] { 1, 3 }, 3), is(true));
    assertThat(PrFloatArray.contains(new float[] { 1, 3 }, 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(PrFloatArray.distinct(new float[] { 1, 2, 1, 3 }), is(new float[] { 1, 2, 3 }));
    assertThat(PrFloatArray.distinct(new float[0]), is(new float[0]));
  }

  @Test
  public void findSequence() {
    assertThat(PrFloatArray.findSequence(2, new float[] { 1, 2, 1, 3 }, 2, 1), is(-1));
    assertThat(PrFloatArray.findSequence(2, new float[] { 1, 2, 1, 2 }, 1, 2), is(2));

    assertThat(PrFloatArray.findSequence(new float[] { 1, 2, 1, 3 }, 2, 1), is(1));
    assertThat(PrFloatArray.findSequence(new float[] { 1, 2, 1, 3 }, 1, 3), is(2));
    assertThat(PrFloatArray.findSequence(new float[] { 1, 2, 1, 3 }, 1, 1), is(-1));
    assertThat(PrFloatArray.findSequence(new float[] { 1, 2, 1, 3 }, (float) 3), is(3));
    assertThat(PrFloatArray.findSequence(new float[] { 1, 2, 1, 3 }, (float) 4), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(PrFloatArray.countSequence(2, new float[] { 1, 2, 1, 3 }, 2, 1), is(0));
    assertThat(PrFloatArray.countSequence(1, new float[] { 1, 2, 1, 3 }, (float) 1), is(1));

    assertThat(PrFloatArray.countSequence(new float[] { 1, 2, 1, 3 }, 2, 1), is(1));
    assertThat(PrFloatArray.countSequence(new float[] { 1, 2, 1, 3 }, (float) 1), is(2));
    assertThat(PrFloatArray.countSequence(new float[] { 1, 2, 1, 3 }, (float) 4), is(0));
  }

  @Test
  public void insert() {
    assertThat(PrFloatArray.insert(new float[] { 1, 2, 3, 4 }, new float[] { 10, 11 }, 2),
        is(new float[] { 1, 2, 10, 11, 3, 4 }));
    assertThat(PrFloatArray.insert(new float[] { 1, 2, 3, 4 }, new float[0], 0), is(new float[] { 1, 2, 3, 4 }));
    assertThat(PrFloatArray.insert(new float[] { 1, 2, 3, 4 }, new float[] { 10, 11 }, 5),
        is(new float[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(PrFloatArray.insert(new float[] { 1, 2, 3, 4 }, new float[] { 10, 11 }, -4),
        is(new float[] { 10, 11, 1, 2, 3, 4 }));
  }

  @Test
  public void append() {
    assertThat(PrFloatArray.append(new float[] { 1, 2, 3, 4 }, 10, 11), is(new float[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(PrFloatArray.append(new float[] { 1, 2, 3, 4 }), is(new float[] { 1, 2, 3, 4 }));
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    PrFloatArray.random(1);
  }
}
