package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BoolArraysTest {
  @Test
  public void fromLong() {
    assertThat(BoolArrays.from(new long[] { 1L, Long.MAX_VALUE }), is(new boolean[] { true, false }));
  }

  @Test
  public void fromInt() {
    assertThat(BoolArrays.from(new int[] { 1, Integer.MAX_VALUE }), is(new boolean[] { true, false }));
  }

  @Test
  public void fromShort() {
    assertThat(BoolArrays.from(new short[] { 1, Short.MAX_VALUE }), is(new boolean[] { true, false }));
  }

  @Test
  public void fromChar() {
    assertThat(BoolArrays.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new boolean[] { false, false, true }));
  }

  @Test
  public void fromDouble() {
    assertThat(BoolArrays.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new boolean[] { true, false, false }));
  }

  @Test
  public void fromFloat() {
    assertThat(BoolArrays.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new boolean[] { true, false, false }));
  }

  @Test
  public void fromByte() {
    assertThat(BoolArrays.from(new byte[] { 1, 2 }), is(new boolean[] { true, false }));
  }

  @Test
  public void join() {
    assertThat(BoolArrays.join(";", true, false), is("true;false"));
  }

  @Test
  public void concat() {
    assertThat(BoolArrays.concatAll(new boolean[] { true, false }, new boolean[] { false, false }),
        is(new boolean[] { true, false, false, false }));
  }

  @Test
  public void contains() {
    assertThat(BoolArrays.contains(new boolean[] { true, false }, true), is(true));
    assertThat(BoolArrays.contains(new boolean[] { false, false }, true), is(false));
  }

  @Test
  public void distinct() {
    assertThat(BoolArrays.distinct(new boolean[] { true, true, false, true }), is(new boolean[] { true, false }));
    assertThat(BoolArrays.distinct(new boolean[] { false, true, false, true }), is(new boolean[] { false, true }));
    assertThat(BoolArrays.distinct(new boolean[] { false, false, false, false }), is(new boolean[] { false }));
    assertThat(BoolArrays.distinct(new boolean[0]), is(new boolean[0]));
  }

  @Test
  public void findSequence() {
    assertThat(BoolArrays.findSequence(2, new boolean[] { true, false, true, true }, false, true), is(-1));
    assertThat(BoolArrays.findSequence(2, new boolean[] { true, false, false, true }, false, true), is(2));

    assertThat(BoolArrays.findSequence(new boolean[] { true, false, true, true }, false, true), is(1));
    assertThat(BoolArrays.findSequence(new boolean[] { true, false, true, true }, true, true), is(2));
    assertThat(BoolArrays.findSequence(new boolean[] { true, false, true, true }, false, false), is(-1));
    assertThat(BoolArrays.findSequence(new boolean[] { true, false, true, true }, false), is(1));
    assertThat(BoolArrays.findSequence(new boolean[] { true, true, true }, false), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(BoolArrays.countSequence(2, new boolean[] { true, false, true, false }, false, true), is(0));
    assertThat(BoolArrays.countSequence(1, new boolean[] { true, false, true, false }, true), is(1));

    assertThat(BoolArrays.countSequence(new boolean[] { true, false, true, false }, false, true), is(1));
    assertThat(BoolArrays.countSequence(new boolean[] { true, false, true, false }, false), is(2));
    assertThat(BoolArrays.countSequence(new boolean[] { true, true, true, true }, false), is(0));
  }

  @Test
  public void insert() {
    assertThat(BoolArrays.insert(new boolean[] { true, false, true, true }, new boolean[] { true, false }, 2),
        is(new boolean[] { true, false, true, false, true, true }));
    assertThat(BoolArrays.insert(new boolean[] { true, false, true, true }, new boolean[0], 0),
        is(new boolean[] { true, false, true, true }));
    assertThat(BoolArrays.insert(new boolean[] { true, false, true, true }, new boolean[] { false, true }, 5),
        is(new boolean[] { true, false, true, true, false, true }));
    assertThat(BoolArrays.insert(new boolean[] { true, false, true, true }, new boolean[] { false, false }, -4),
        is(new boolean[] { false, false, true, false, true, true }));
  }

  @Test
  public void append() {
    assertThat(BoolArrays.append(new boolean[] { true, false, true, true }, false, true),
        is(new boolean[] { true, false, true, true, false, true }));
    assertThat(BoolArrays.append(new boolean[] { true, false, true, true }),
        is(new boolean[] { true, false, true, true }));
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    BoolArrays.random(1);
  }
}
