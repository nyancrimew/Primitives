package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ByteArraysTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  private static final double ONE_THIRD = 1 / 3.0;

  @Test
  public void fromLong() {
    assertThat(ByteArrays.from(new long[] { 1L, Long.MAX_VALUE, Long.MAX_VALUE - 1 }), is(new byte[] { 1, -1, -2 }));
  }

  @Test
  public void fromInt() {
    assertThat(ByteArrays.from(new int[] { 1, Integer.MAX_VALUE }), is(new byte[] { 1, -1 }));
  }

  @Test
  public void fromShort() {
    assertThat(ByteArrays.from(new short[] { 1, Short.MAX_VALUE }), is(new byte[] { 1, -1 }));
  }

  @Test
  public void fromChar() {
    assertThat(ByteArrays.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new byte[] { 0, -1, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(ByteArrays.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new byte[] { 1, 1, -1 }));
  }

  @Test
  public void fromFloat() {
    assertThat(ByteArrays.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new byte[] { 1, 1, -1 }));
  }

  @Test
  public void fromBoolean() {
    assertThat(ByteArrays.from(new boolean[] { true, false }), is(new byte[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(ByteArrays.join(";", (byte) 1, (byte) 5, (byte) 30), is("1;5;30"));
  }

  @Test
  public void concat() {
    assertThat(ByteArrays.concatAll(new byte[] { 1, 3 }, new byte[] { -2, 5 }), is(new byte[] { 1, 3, -2, 5 }));
  }

  @Test
  public void contains() {
    assertThat(ByteArrays.contains(new byte[] { 1, 3 }, (byte) 3), is(true));
    assertThat(ByteArrays.contains(new byte[] { 1, 3 }, (byte) 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(ByteArrays.distinct(new byte[] { 1, 2, 1, 3 }), is(new byte[] { 1, 2, 3 }));
    assertThat(ByteArrays.distinct(new byte[0]), is(new byte[0]));
  }

  @Test
  public void findSequence() {
    assertThat(ByteArrays.findSequence(2, new byte[] { 1, 2, 1, 3 }, (byte) 2, (byte) 1), is(-1));
    assertThat(ByteArrays.findSequence(2, new byte[] { 1, 2, 1, 2 }, (byte) 1, (byte) 2), is(2));

    assertThat(ByteArrays.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 2, (byte) 1), is(1));
    assertThat(ByteArrays.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 1, (byte) 3), is(2));
    assertThat(ByteArrays.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 1, (byte) 1), is(-1));
    assertThat(ByteArrays.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 3), is(3));
    assertThat(ByteArrays.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 4), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(ByteArrays.countSequence(2, new byte[] { 1, 2, 1, 3 }, (byte) 2, (byte) 1), is(0));
    assertThat(ByteArrays.countSequence(1, new byte[] { 1, 2, 1, 3 }, (byte) 1), is(1));

    assertThat(ByteArrays.countSequence(new byte[] { 1, 2, 1, 3 }, (byte) 2, (byte) 1), is(1));
    assertThat(ByteArrays.countSequence(new byte[] { 1, 2, 1, 3 }, (byte) 1), is(2));
    assertThat(ByteArrays.countSequence(new byte[] { 1, 2, 1, 3 }, (byte) 4), is(0));
  }

  @Test
  public void insert() {
    assertThat(ByteArrays.insert(new byte[] { 1, 2, 3, 4 }, new byte[] { 10, 11 }, 2),
        is(new byte[] { 1, 2, 10, 11, 3, 4 }));
    assertThat(ByteArrays.insert(new byte[] { 1, 2, 3, 4 }, new byte[0], 0), is(new byte[] { 1, 2, 3, 4 }));
    assertThat(ByteArrays.insert(new byte[] { 1, 2, 3, 4 }, new byte[] { 10, 11 }, 5),
        is(new byte[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(ByteArrays.insert(new byte[] { 1, 2, 3, 4 }, new byte[] { 10, 11 }, -4),
        is(new byte[] { 10, 11, 1, 2, 3, 4 }));
  }

  @Test
  public void append() {
    assertThat(ByteArrays.append(new byte[] { 1, 2, 3, 4 }, (byte) 10, (byte) 11),
        is(new byte[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(ByteArrays.append(new byte[] { 1, 2, 3, 4 }), is(new byte[] { 1, 2, 3, 4 }));
  }

  @Test
  public void min() {
    assertThat(ByteArrays.min((byte) 1), is((byte) 1));
    assertThat(ByteArrays.min(new byte[] { -3, 5, -6 }), is((byte) -6));
    assertThat(ByteArrays.min(new byte[] { -3, -3, -3 }), is((byte) -3L));
  }

  @Test
  public void max() {
    assertThat(ByteArrays.max((byte) 1), is((byte) 1));
    assertThat(ByteArrays.max(new byte[] { -3, 5, -6 }), is((byte) 5));
    assertThat(ByteArrays.max(new byte[] { -3, -3, -3 }), is((byte) -3));
  }

  @Test
  public void avg() {
    assertThat(ByteArrays.avg((byte) 1), is(1.0));
    assertThat(ByteArrays.avg(new byte[] { -3, 5, -6 }), is(-(1 + ONE_THIRD)));
    assertThat(ByteArrays.avg(new byte[] { -3, -3, -3 }), is(-3.0));
  }

  @Test
  public void sum() {
    assertThat(ByteArrays.sum((byte) 1), is((byte) 1));
    assertThat(ByteArrays.sum(new byte[] { 1, 2, 3 }), is((byte) 6));
    assertThat(ByteArrays.sum(new byte[] { -3, -3, -3 }), is((byte) -9));
    assertThat(ByteArrays.sum(new byte[0]), is((byte) 0));
  }

  @Test
  public void minEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get min value from empty array"));
    ByteArrays.min(new byte[0]);
  }

  @Test
  public void maxEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get max value from empty array"));
    ByteArrays.max(new byte[0]);
  }

  @Test
  public void avgEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get average value from empty array"));
    ByteArrays.avg(new byte[0]);
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    ByteArrays.random(1);
    // To cover the case where we already have a random object
    ByteArrays.random(1);
  }
}
