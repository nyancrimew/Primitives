package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrShortArrayTest {
  @Test
  public void fromLong() {
    assertThat(PrShortArray.from(new long[] { 1L, Long.MAX_VALUE, Long.MAX_VALUE - 1 }), is(new short[] { 1, -1, -2 }));
  }

  @Test
  public void fromInt() {
    assertThat(PrShortArray.from(new int[] { 1, Integer.MAX_VALUE }), is(new short[] { 1, -1 }));
  }

  @Test
  public void fromByte() {
    assertThat(PrShortArray.from(new byte[] { 1, Byte.MAX_VALUE }), is(new short[] { 1, 127 }));
  }

  @Test
  public void fromChar() {
    assertThat(PrShortArray.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new short[] { 0, -1, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(PrShortArray.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new short[] { 1, 1, -1 }));
  }

  @Test
  public void fromFloat() {
    assertThat(PrShortArray.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new short[] { 1, 1, -1 }));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrShortArray.from(new boolean[] { true, false }), is(new short[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(PrShortArray.join(";", (short) 1, (short) 2), is("1;2"));
  }

  @Test
  public void concat() {
    assertThat(PrShortArray.concatAll(new short[] { 1, 3 }, new short[] { -2, 5 }), is(new short[] { 1, 3, -2, 5 }));
  }

  @Test
  public void contains() {
    assertThat(PrShortArray.contains(new short[] { 1, 3 }, (short) 3), is(true));
    assertThat(PrShortArray.contains(new short[] { 1, 3 }, (short) 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(PrShortArray.distinct(new short[] { 1, 2, 1, 3 }), is(new short[] { 1, 2, 3 }));
    assertThat(PrShortArray.distinct(new short[0]), is(new short[0]));
  }

  @Test
  public void findSequence() {
    assertThat(PrShortArray.findSequence(2, new short[] { 1, 2, 1, 3 }, (short) 2, (short) 1), is(-1));
    assertThat(PrShortArray.findSequence(2, new short[] { 1, 2, 1, 2 }, (short) 1, (short) 2), is(2));

    assertThat(PrShortArray.findSequence(new short[] { 1, 2, 1, 3 }, (short) 2, (short) 1), is(1));
    assertThat(PrShortArray.findSequence(new short[] { 1, 2, 1, 3 }, (short) 1, (short) 3), is(2));
    assertThat(PrShortArray.findSequence(new short[] { 1, 2, 1, 3 }, (short) 1, (short) 1), is(-1));
    assertThat(PrShortArray.findSequence(new short[] { 1, 2, 1, 3 }, (short) 3), is(3));
    assertThat(PrShortArray.findSequence(new short[] { 1, 2, 1, 3 }, (short) 4), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(PrShortArray.countSequence(2, new short[] { 1, 2, 1, 3 }, (short) 2, (short) 1), is(0));
    assertThat(PrShortArray.countSequence(1, new short[] { 1, 2, 1, 3 }, (short) 1), is(1));

    assertThat(PrShortArray.countSequence(new short[] { 1, 2, 1, 3 }, (short) 2, (short) 1), is(1));
    assertThat(PrShortArray.countSequence(new short[] { 1, 2, 1, 3 }, (short) 1), is(2));
    assertThat(PrShortArray.countSequence(new short[] { 1, 2, 1, 3 }, (short) 4), is(0));
  }

  @Test
  public void insert() {
    assertThat(PrShortArray.insert(new short[] { 1, 2, 3, 4 }, new short[] { 10, 11 }, 2),
        is(new short[] { 1, 2, 10, 11, 3, 4 }));
    assertThat(PrShortArray.insert(new short[] { 1, 2, 3, 4 }, new short[0], 0), is(new short[] { 1, 2, 3, 4 }));
    assertThat(PrShortArray.insert(new short[] { 1, 2, 3, 4 }, new short[] { 10, 11 }, 5),
        is(new short[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(PrShortArray.insert(new short[] { 1, 2, 3, 4 }, new short[] { 10, 11 }, -4),
        is(new short[] { 10, 11, 1, 2, 3, 4 }));
  }

  @Test
  public void append() {
    assertThat(PrShortArray.append(new short[] { 1, 2, 3, 4 }, (short) 10, (short) 11),
        is(new short[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(PrShortArray.append(new short[] { 1, 2, 3, 4 }), is(new short[] { 1, 2, 3, 4 }));
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    PrShortArray.random(1);
  }
}
