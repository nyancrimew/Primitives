package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrByteArrayTest {
  @Test
  public void fromLong() {
    assertThat(PrByteArray.from(new long[] { 1L, Long.MAX_VALUE, Long.MAX_VALUE - 1 }), is(new byte[] { 1, -1, -2 }));
  }

  @Test
  public void fromInt() {
    assertThat(PrByteArray.from(new int[] { 1, Integer.MAX_VALUE }), is(new byte[] { 1, -1 }));
  }

  @Test
  public void fromShort() {
    assertThat(PrByteArray.from(new short[] { 1, Short.MAX_VALUE }), is(new byte[] { 1, -1 }));
  }

  @Test
  public void fromChar() {
    assertThat(PrByteArray.from(new char[] { '\0', Character.MAX_VALUE, 1 }), is(new byte[] { 0, -1, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(PrByteArray.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new byte[] { 1, 1, -1 }));
  }

  @Test
  public void fromFloat() {
    assertThat(PrByteArray.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new byte[] { 1, 1, -1 }));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrByteArray.from(new boolean[] { true, false }), is(new byte[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(PrByteArray.join(";", (byte) 1, (byte) 5, (byte) 30), is("1;5;30"));
  }

  @Test
  public void concat() {
    assertThat(PrByteArray.concatAll(new byte[] { 1, 3 }, new byte[] { -2, 5 }), is(new byte[] { 1, 3, -2, 5 }));
  }

  @Test
  public void contains() {
    assertThat(PrByteArray.contains(new byte[] { 1, 3 }, (byte) 3), is(true));
    assertThat(PrByteArray.contains(new byte[] { 1, 3 }, (byte) 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(PrByteArray.distinct(new byte[] { 1, 2, 1, 3 }), is(new byte[] { 1, 2, 3 }));
    assertThat(PrByteArray.distinct(new byte[0]), is(new byte[0]));
  }

  @Test
  public void findSequence() {
    assertThat(PrByteArray.findSequence(2, new byte[] { 1, 2, 1, 3 }, (byte) 2, (byte) 1), is(-1));
    assertThat(PrByteArray.findSequence(2, new byte[] { 1, 2, 1, 2 }, (byte) 1, (byte) 2), is(2));

    assertThat(PrByteArray.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 2, (byte) 1), is(1));
    assertThat(PrByteArray.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 1, (byte) 3), is(2));
    assertThat(PrByteArray.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 1, (byte) 1), is(-1));
    assertThat(PrByteArray.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 3), is(3));
    assertThat(PrByteArray.findSequence(new byte[] { 1, 2, 1, 3 }, (byte) 4), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(PrByteArray.countSequence(2, new byte[] { 1, 2, 1, 3 }, (byte) 2, (byte) 1), is(0));
    assertThat(PrByteArray.countSequence(1, new byte[] { 1, 2, 1, 3 }, (byte) 1), is(1));

    assertThat(PrByteArray.countSequence(new byte[] { 1, 2, 1, 3 }, (byte) 2, (byte) 1), is(1));
    assertThat(PrByteArray.countSequence(new byte[] { 1, 2, 1, 3 }, (byte) 1), is(2));
    assertThat(PrByteArray.countSequence(new byte[] { 1, 2, 1, 3 }, (byte) 4), is(0));
  }

  @Test
  public void insert() {
    assertThat(PrByteArray.insert(new byte[] { 1, 2, 3, 4 }, new byte[] { 10, 11 }, 2),
        is(new byte[] { 1, 2, 10, 11, 3, 4 }));
    assertThat(PrByteArray.insert(new byte[] { 1, 2, 3, 4 }, new byte[0], 0), is(new byte[] { 1, 2, 3, 4 }));
    assertThat(PrByteArray.insert(new byte[] { 1, 2, 3, 4 }, new byte[] { 10, 11 }, 5),
        is(new byte[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(PrByteArray.insert(new byte[] { 1, 2, 3, 4 }, new byte[] { 10, 11 }, -4),
        is(new byte[] { 10, 11, 1, 2, 3, 4 }));
  }

  @Test
  public void append() {
    assertThat(PrByteArray.append(new byte[] { 1, 2, 3, 4 }, (byte) 10, (byte) 11),
        is(new byte[] { 1, 2, 3, 4, 10, 11 }));
    assertThat(PrByteArray.append(new byte[] { 1, 2, 3, 4 }), is(new byte[] { 1, 2, 3, 4 }));
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    PrByteArray.random(1);
  }
}
