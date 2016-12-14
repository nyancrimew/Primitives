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

  @Test
  public void findSequence() {
    assertThat(PrCharArray.findSequence(2, new char[] { 1, 2, 1, 3 }, (char) 2, (char) 1), is(-1));
    assertThat(PrCharArray.findSequence(2, new char[] { 1, 2, 1, 2 }, (char) 1, (char) 2), is(2));

    assertThat(PrCharArray.findSequence(new char[] { 1, 2, 1, 3 }, (char) 2, (char) 1), is(1));
    assertThat(PrCharArray.findSequence(new char[] { 1, 2, 1, 3 }, (char) 1, (char) 3), is(2));
    assertThat(PrCharArray.findSequence(new char[] { 1, 2, 1, 3 }, (char) 1, (char) 1), is(-1));
    assertThat(PrCharArray.findSequence(new char[] { 1, 2, 1, 3 }, (char) 3), is(3));
    assertThat(PrCharArray.findSequence(new char[] { 1, 2, 1, 3 }, (char) 4), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(PrCharArray.countSequence(2, new char[] { 1, 2, 1, 3 }, (char) 2, (char) 1), is(0));
    assertThat(PrCharArray.countSequence(1, new char[] { 1, 2, 1, 3 }, (char) 1), is(1));

    assertThat(PrCharArray.countSequence(new char[] { 1, 2, 1, 3 }, (char) 2, (char) 1), is(1));
    assertThat(PrCharArray.countSequence(new char[] { 1, 2, 1, 3 }, (char) 1), is(2));
    assertThat(PrCharArray.countSequence(new char[] { 1, 2, 1, 3 }, (char) 4), is(0));
  }

  @Test
  public void insert() {
    assertThat(PrCharArray.insert(new char[] { 'a', 'b', 'c', 'd' }, new char[] { 'x', 'y' }, 2),
        is(new char[] { 'a', 'b', 'x', 'y', 'c', 'd' }));
    assertThat(PrCharArray.insert(new char[] { 'a', 'b', 'c', 'd' }, new char[0], 0),
        is(new char[] { 'a', 'b', 'c', 'd' }));
    assertThat(PrCharArray.insert(new char[] { 'a', 'b', 'c', 'd' }, new char[] { 'x', 'y' }, 5),
        is(new char[] { 'a', 'b', 'c', 'd', 'x', 'y' }));
    assertThat(PrCharArray.insert(new char[] { 'a', 'b', 'c', 'd' }, new char[] { 'x', 'y' }, -4),
        is(new char[] { 'x', 'y', 'a', 'b', 'c', 'd' }));
  }

  @Test
  public void append() {
    assertThat(PrCharArray.append(new char[] { 'a', 'b', 'c', 'd' }, 'x', 'y'),
        is(new char[] { 'a', 'b', 'c', 'd', 'x', 'y' }));
    assertThat(PrCharArray.append(new char[] { 'a', 'b', 'c', 'd' }), is(new char[] { 'a', 'b', 'c', 'd' }));
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    PrCharArray.random(1);
  }
}
