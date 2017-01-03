package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ShortArraysTest {
  @Test
  public void fromLong() {
    assertThat(ShortArrays.from(new long[] { 1L, Long.MAX_VALUE, Long.MAX_VALUE - 1 }), is(new short[] { 1, -1, -2 }));
  }

  @Test
  public void fromInt() {
    assertThat(ShortArrays.from(new int[] { 1, Integer.MAX_VALUE }), is(new short[] { 1, -1 }));
  }

  @Test
  public void fromByte() {
    assertThat(ShortArrays.from(new byte[] { 1, Byte.MAX_VALUE }), is(new short[] { 1, 127 }));
  }

  @Test
  public void fromChar() {
    assertThat(ShortArrays.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new short[] { 0, -1, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(ShortArrays.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new short[] { 1, 1, -1 }));
  }

  @Test
  public void fromFloat() {
    assertThat(ShortArrays.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new short[] { 1, 1, -1 }));
  }

  @Test
  public void fromBoolean() {
    assertThat(ShortArrays.from(new boolean[] { true, false }), is(new short[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(ShortArrays.join(";", (short) 1, (short) 2), is("1;2"));
  }

  @Test
  public void concat() {
    assertThat(ShortArrays.concatAll(new short[] { 1, 3 }, new short[] { -2, 5 }), is(new short[] { 1, 3, -2, 5 }));
  }

  @Test
  public void contains() {
    assertThat(ShortArrays.contains(new short[] { 1, 3 }, (short) 3), is(true));
    assertThat(ShortArrays.contains(new short[] { 1, 3 }, (short) 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(ShortArrays.distinct(new short[] { 1, 2, 1, 3 }), is(new short[] { 1, 2, 3 }));
    assertThat(ShortArrays.distinct(new short[0]), is(new short[0]));
  }

  @Test
  public void findSequence() {
    assertThat(ShortArrays.findSequence(2, new short[] { 1, 2, 1, 3 }, (short) 2, (short) 1), is(-1));
    assertThat(ShortArrays.findSequence(2, new short[] { 1, 2, 1, 2 }, (short) 1, (short) 2), is(2));

    assertThat(ShortArrays.findSequence(new short[] { 1, 2, 1, 3 }, (short) 2, (short) 1), is(1));
    assertThat(ShortArrays.findSequence(new short[] { 1, 2, 1, 3 }, (short) 1, (short) 3), is(2));
    assertThat(ShortArrays.findSequence(new short[] { 1, 2, 1, 3 }, (short) 1, (short) 1), is(-1));
    assertThat(ShortArrays.findSequence(new short[] { 1, 2, 1, 3 }, (short) 3), is(3));
    assertThat(ShortArrays.findSequence(new short[] { 1, 2, 1, 3 }, (short) 4), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(ShortArrays.countSequence(2, new short[] { 1, 2, 1, 3 }, (short) 2, (short) 1), is(0));
    assertThat(ShortArrays.countSequence(1, new short[] { 1, 2, 1, 3 }, (short) 1), is(1));

    assertThat(ShortArrays.countSequence(new short[] { 1, 2, 1, 3 }, (short) 2, (short) 1), is(1));
    assertThat(ShortArrays.countSequence(new short[] { 1, 2, 1, 3 }, (short) 1), is(2));
    assertThat(ShortArrays.countSequence(new short[] { 1, 2, 1, 3 }, (short) 4), is(0));
  }

  @Test
  public void insert() {
    assertThat(ShortArrays.insert(new short[] { 1, 2, 3, 4 }, new short[] { 10, 11 }, 2),
        is(new short[] { 1, 2, 10, 11, 3, 4 }));
    assertThat(ShortArrays.insert(new short[] { 1, 2, 3, 4 }, new short[0], 0), is(new short[] { 1, 2, 3, 4 }));
    assertThat(ShortArrays.insert(new short[] { 1, 2, 3, 4 }, new short[] { 10, 11 }, 5),
        is(new short[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(ShortArrays.insert(new short[] { 1, 2, 3, 4 }, new short[] { 10, 11 }, -4),
        is(new short[] { 10, 11, 1, 2, 3, 4 }));
  }

  @Test
  public void append() {
    assertThat(ShortArrays.append(new short[] { 1, 2, 3, 4 }, (short) 10, (short) 11),
        is(new short[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(ShortArrays.append(new short[] { 1, 2, 3, 4 }), is(new short[] { 1, 2, 3, 4 }));
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    ShortArrays.random(1);
  }
}
