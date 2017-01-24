package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LongArraysTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  private static final double ONE_THIRD = 1 / 3.0;

  @Test
  public void fromInt() {
    assertThat(LongArrays.from(new int[] { 1, Integer.MAX_VALUE, Integer.MAX_VALUE - 1 }),
        is(new long[] { 1, 2147483647, 2147483646 }));
  }

  @Test
  public void fromShort() {
    assertThat(LongArrays.from(new short[] { 1, Short.MAX_VALUE }), is(new long[] { 1, 32767 }));
  }

  @Test
  public void fromByte() {
    assertThat(LongArrays.from(new byte[] { 1, Byte.MAX_VALUE }), is(new long[] { 1, 127 }));
  }

  @Test
  public void fromChar() {
    assertThat(LongArrays.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new long[] { 0, 65535, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(LongArrays.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }),
        is(new long[] { 1, 1, 9223372036854775807L }));
  }

  @Test
  public void fromFloat() {
    assertThat(LongArrays.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }),
        is(new long[] { 1, 1, 9223372036854775807L }));
  }

  @Test
  public void fromBoolean() {
    assertThat(LongArrays.from(new boolean[] { true, false }), is(new long[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(LongArrays.join(";", 2, 6), is("2;6"));
  }

  @Test
  public void concat() {
    assertThat(LongArrays.concatAll(new long[] { 1, 3 }, new long[] { -2, 5 }), is(new long[] { 1, 3, -2, 5 }));
  }

  @Test
  public void contains() {
    assertThat(LongArrays.contains(new long[] { 1, 3 }, 3), is(true));
    assertThat(LongArrays.contains(new long[] { 1, 3 }, 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(LongArrays.distinct(new long[] { 1, 2, 1, 3 }), is(new long[] { 1, 2, 3 }));
    assertThat(LongArrays.distinct(new long[0]), is(new long[0]));
  }

  @Test
  public void findSequence() {
    assertThat(LongArrays.findSequence(2, new long[] { 1, 2, 1, 3 }, 2, 1), is(-1));
    assertThat(LongArrays.findSequence(2, new long[] { 1, 2, 1, 2 }, 1, 2), is(2));

    assertThat(LongArrays.findSequence(new long[] { 1, 2, 1, 3 }, 2, 1), is(1));
    assertThat(LongArrays.findSequence(new long[] { 1, 2, 1, 3 }, 1, 3), is(2));
    assertThat(LongArrays.findSequence(new long[] { 1, 2, 1, 3 }, 1, 1), is(-1));
    assertThat(LongArrays.findSequence(new long[] { 1, 2, 1, 3 }, (long) 3), is(3));
    assertThat(LongArrays.findSequence(new long[] { 1, 2, 1, 3 }, (long) 4), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(LongArrays.countSequence(2, new long[] { 1, 2, 1, 3 }, 2, 1), is(0));
    assertThat(LongArrays.countSequence(1, new long[] { 1, 2, 1, 3 }, (long) 1), is(1));

    assertThat(LongArrays.countSequence(new long[] { 1, 2, 1, 3 }, 2, 1), is(1));
    assertThat(LongArrays.countSequence(new long[] { 1, 2, 1, 3 }, (long) 1), is(2));
    assertThat(LongArrays.countSequence(new long[] { 1, 2, 1, 3 }, (long) 4), is(0));
  }

  @Test
  public void insert() {
    assertThat(LongArrays.insert(new long[] { 1, 2, 3, 4 }, new long[] { 10, 11 }, 2),
        is(new long[] { 1, 2, 10, 11, 3, 4 }));
    assertThat(LongArrays.insert(new long[] { 1, 2, 3, 4 }, new long[0], 0), is(new long[] { 1, 2, 3, 4 }));
    assertThat(LongArrays.insert(new long[] { 1, 2, 3, 4 }, new long[] { 10, 11 }, 5),
        is(new long[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(LongArrays.insert(new long[] { 1, 2, 3, 4 }, new long[] { 10, 11 }, -4),
        is(new long[] { 10, 11, 1, 2, 3, 4 }));
  }

  @Test
  public void append() {
    assertThat(LongArrays.append(new long[] { 1, 2, 3, 4 }, 10, 11), is(new long[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(LongArrays.append(new long[] { 1, 2, 3, 4 }), is(new long[] { 1, 2, 3, 4 }));
  }

  @Test
  public void min() {
    assertThat(LongArrays.min(1), is(1L));
    assertThat(LongArrays.min(-3, 5, -6), is(-6L));
    assertThat(LongArrays.min(-3, -3, -3), is(-3L));
  }

  @Test
  public void max() {
    assertThat(LongArrays.max(1), is(1L));
    assertThat(LongArrays.max(-3, 5, -6), is(5L));
    assertThat(LongArrays.max(-3, -3, -3), is(-3L));
  }

  @Test
  public void avg() {
    assertThat(LongArrays.avg(1), is(1.0));
    assertThat(LongArrays.avg(-3, 5, -6), is(-(1 + ONE_THIRD)));
    assertThat(LongArrays.avg(-3, -3, -3), is(-3.0));
  }

  @Test
  public void sum() {
    assertThat(LongArrays.sum(1), is(1L));
    assertThat(LongArrays.sum(1, 2, 3), is(6L));
    assertThat(LongArrays.sum(-3, -3, -3), is(-9L));
    assertThat(LongArrays.sum(new long[0]), is(0L));
  }

  @Test
  public void minEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get min value from empty array"));
    LongArrays.min(new long[0]);
  }

  @Test
  public void maxEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get max value from empty array"));
    LongArrays.max(new long[0]);
  }

  @Test
  public void avgEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get average value from empty array"));
    LongArrays.avg(new long[0]);
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    LongArrays.random(1);
  }
}
