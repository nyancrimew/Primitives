package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FloatArraysTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  private static final float ONE_THIRD = 1 / 3f;

  @Test
  public void fromInt() {
    assertThat(FloatArrays.from(new int[] { 1, Integer.MAX_VALUE, Integer.MAX_VALUE - 1 }),
        is(new float[] { 1, 2147483647, 2147483646 }));
  }

  @Test
  public void fromShort() {
    assertThat(FloatArrays.from(new short[] { 1, Short.MAX_VALUE }), is(new float[] { 1, 32767 }));
  }

  @Test
  public void fromByte() {
    assertThat(FloatArrays.from(new byte[] { 1, Byte.MAX_VALUE }), is(new float[] { 1, 127 }));
  }

  @Test
  public void fromChar() {
    assertThat(FloatArrays.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new float[] { 0, 65535, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(FloatArrays.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }),
        is(new float[] { 1, 1.3f, Float.POSITIVE_INFINITY }));
  }

  @Test
  public void fromLong() {
    assertThat(FloatArrays.from(new long[] { 1L, Long.MAX_VALUE }), is(new float[] { 1, 9223372036854775807f }));
  }

  @Test
  public void fromBoolean() {
    assertThat(FloatArrays.from(new boolean[] { true, false }), is(new float[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(FloatArrays.join(";", 1f, 1.5f), is("1.0;1.5"));
  }

  @Test
  public void concat() {
    assertThat(FloatArrays.concatAll(new float[] { 1, 3.34f }, new float[] { -2, 5 }),
        is(new float[] { 1, 3.34f, -2, 5 }));
  }

  @Test
  public void contains() {
    assertThat(FloatArrays.contains(new float[] { 1, 3 }, 3), is(true));
    assertThat(FloatArrays.contains(new float[] { 1, 3 }, 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(FloatArrays.distinct(new float[] { 1, 2, 1, 3 }), is(new float[] { 1, 2, 3 }));
    assertThat(FloatArrays.distinct(new float[0]), is(new float[0]));
  }

  @Test
  public void findSequence() {
    assertThat(FloatArrays.findSequence(2, new float[] { 1, 2, 1, 3 }, 2, 1), is(-1));
    assertThat(FloatArrays.findSequence(2, new float[] { 1, 2, 1, 2 }, 1, 2), is(2));

    assertThat(FloatArrays.findSequence(new float[] { 1, 2, 1, 3 }, 2, 1), is(1));
    assertThat(FloatArrays.findSequence(new float[] { 1, 2, 1, 3 }, 1, 3), is(2));
    assertThat(FloatArrays.findSequence(new float[] { 1, 2, 1, 3 }, 1, 1), is(-1));
    assertThat(FloatArrays.findSequence(new float[] { 1, 2, 1, 3 }, (float) 3), is(3));
    assertThat(FloatArrays.findSequence(new float[] { 1, 2, 1, 3 }, (float) 4), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(FloatArrays.countSequence(2, new float[] { 1, 2, 1, 3 }, 2, 1), is(0));
    assertThat(FloatArrays.countSequence(1, new float[] { 1, 2, 1, 3 }, (float) 1), is(1));

    assertThat(FloatArrays.countSequence(new float[] { 1, 2, 1, 3 }, 2, 1), is(1));
    assertThat(FloatArrays.countSequence(new float[] { 1, 2, 1, 3 }, (float) 1), is(2));
    assertThat(FloatArrays.countSequence(new float[] { 1, 2, 1, 3 }, (float) 4), is(0));
  }

  @Test
  public void insert() {
    assertThat(FloatArrays.insert(new float[] { 1, 2, 3, 4 }, new float[] { 10, 11 }, 2),
        is(new float[] { 1, 2, 10, 11, 3, 4 }));
    assertThat(FloatArrays.insert(new float[] { 1, 2, 3, 4 }, new float[0], 0), is(new float[] { 1, 2, 3, 4 }));
    assertThat(FloatArrays.insert(new float[] { 1, 2, 3, 4 }, new float[] { 10, 11 }, 5),
        is(new float[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(FloatArrays.insert(new float[] { 1, 2, 3, 4 }, new float[] { 10, 11 }, -4),
        is(new float[] { 10, 11, 1, 2, 3, 4 }));
  }

  @Test
  public void append() {
    assertThat(FloatArrays.append(new float[] { 1, 2, 3, 4 }, 10, 11), is(new float[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(FloatArrays.append(new float[] { 1, 2, 3, 4 }), is(new float[] { 1, 2, 3, 4 }));
  }

  @Test
  public void min() {
    assertThat(FloatArrays.min(1), is(1f));
    assertThat(FloatArrays.min(-3, 5, -6), is(-6f));
    assertThat(FloatArrays.min(-3, -3, -3), is(-3f));
  }

  @Test
  public void max() {
    assertThat(FloatArrays.max(1), is(1f));
    assertThat(FloatArrays.max(-3, 5, -6), is(5f));
    assertThat(FloatArrays.max(-3, -3, -3), is(-3f));
  }

  @Test
  public void avg() {
    assertThat(FloatArrays.avg(1), is(1f));
    assertThat(FloatArrays.avg(-3, 5, -6), is(-(1 + ONE_THIRD)));
    assertThat(FloatArrays.avg(-3, -3, -3), is(-3f));
  }

  @Test
  public void sum() {
    assertThat(FloatArrays.sum(1), is(1f));
    assertThat(FloatArrays.sum(1, 2, 3), is(6f));
    assertThat(FloatArrays.sum(-3, -3, -3), is(-9f));
    assertThat(FloatArrays.sum(new float[0]), is(0f));
  }

  @Test
  public void minEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get min value from empty array"));
    FloatArrays.min(new float[0]);
  }

  @Test
  public void maxEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get max value from empty array"));
    FloatArrays.max(new float[0]);
  }

  @Test
  public void avgEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get average value from empty array"));
    FloatArrays.avg(new float[0]);
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    FloatArrays.random(1);
  }
}
