package ch.deletescape.primitives.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CharArraysTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromLong() {
    assertThat(CharArrays.from(new long[] { 1L, Long.MAX_VALUE, Long.MAX_VALUE - 1 }),
        is(new char[] { 1, (char) -1, (char) -2 }));
  }

  @Test
  public void fromInt() {
    assertThat(CharArrays.from(new int[] { 1, Integer.MAX_VALUE }), is(new char[] { 1, (char) -1 }));
  }

  @Test
  public void fromByte() {
    assertThat(CharArrays.from(new byte[] { 1, Byte.MAX_VALUE }), is(new char[] { 1, 127 }));
  }

  @Test
  public void fromShort() {
    assertThat(CharArrays.from(new short[] { 0, Short.MAX_VALUE, 1 }), is(new char[] { 0, (char) 32767, 1 }));
  }

  @Test
  public void fromDouble() {
    assertThat(CharArrays.from(new double[] { 1.0, 1.3, Double.MAX_VALUE }), is(new char[] { 1, 1, (char) -1 }));
  }

  @Test
  public void fromFloat() {
    assertThat(CharArrays.from(new float[] { 1f, 1.3f, Float.MAX_VALUE }), is(new char[] { 1, 1, (char) -1 }));
  }

  @Test
  public void fromBoolean() {
    assertThat(CharArrays.from(new boolean[] { true, false }), is(new char[] { 1, 0 }));
  }

  @Test
  public void join() {
    assertThat(CharArrays.join(";", 'a', 'b', ';'), is("a;b;;"));
  }

  @Test
  public void concat() {
    assertThat(CharArrays.concatAll(new char[] { 1, 3 }, new char[] { 'a', 5 }), is(new char[] { 1, 3, 'a', 5 }));
  }

  @Test
  public void contains() {
    assertThat(CharArrays.contains(new char[] { 1, 3 }, (char) 3), is(true));
    assertThat(CharArrays.contains(new char[] { 1, 3 }, (char) 5), is(false));
  }

  @Test
  public void distinct() {
    assertThat(CharArrays.distinct(new char[] { 1, 2, 1, 3 }), is(new char[] { 1, 2, 3 }));
    assertThat(CharArrays.distinct(new char[0]), is(new char[0]));
  }

  @Test
  public void findSequence() {
    assertThat(CharArrays.findSequence(2, new char[] { 1, 2, 1, 3 }, (char) 2, (char) 1), is(-1));
    assertThat(CharArrays.findSequence(2, new char[] { 1, 2, 1, 2 }, (char) 1, (char) 2), is(2));

    assertThat(CharArrays.findSequence(new char[] { 1, 2, 1, 3 }, (char) 2, (char) 1), is(1));
    assertThat(CharArrays.findSequence(new char[] { 1, 2, 1, 3 }, (char) 1, (char) 3), is(2));
    assertThat(CharArrays.findSequence(new char[] { 1, 2, 1, 3 }, (char) 1, (char) 1), is(-1));
    assertThat(CharArrays.findSequence(new char[] { 1, 2, 1, 3 }, (char) 3), is(3));
    assertThat(CharArrays.findSequence(new char[] { 1, 2, 1, 3 }, (char) 4), is(-1));
  }

  @Test
  public void countSequence() {
    assertThat(CharArrays.countSequence(2, new char[] { 1, 2, 1, 3 }, (char) 2, (char) 1), is(0));
    assertThat(CharArrays.countSequence(1, new char[] { 1, 2, 1, 3 }, (char) 1), is(1));

    assertThat(CharArrays.countSequence(new char[] { 1, 2, 1, 3 }, (char) 2, (char) 1), is(1));
    assertThat(CharArrays.countSequence(new char[] { 1, 2, 1, 3 }, (char) 1), is(2));
    assertThat(CharArrays.countSequence(new char[] { 1, 2, 1, 3 }, (char) 4), is(0));
  }

  @Test
  public void insert() {
    assertThat(CharArrays.insert(new char[] { 'a', 'b', 'c', 'd' }, new char[] { 'x', 'y' }, 2),
        is(new char[] { 'a', 'b', 'x', 'y', 'c', 'd' }));
    assertThat(CharArrays.insert(new char[] { 'a', 'b', 'c', 'd' }, new char[0], 0),
        is(new char[] { 'a', 'b', 'c', 'd' }));
    assertThat(CharArrays.insert(new char[] { 'a', 'b', 'c', 'd' }, new char[] { 'x', 'y' }, 5),
        is(new char[] { 'a', 'b', 'c', 'd', 'x', 'y' }));
    assertThat(CharArrays.insert(new char[] { 'a', 'b', 'c', 'd' }, new char[] { 'x', 'y' }, -4),
        is(new char[] { 'x', 'y', 'a', 'b', 'c', 'd' }));
  }

  @Test
  public void append() {
    assertThat(CharArrays.append(new char[] { 'a', 'b', 'c', 'd' }, 'x', 'y'),
        is(new char[] { 'a', 'b', 'c', 'd', 'x', 'y' }));
    assertThat(CharArrays.append(new char[] { 'a', 'b', 'c', 'd' }), is(new char[] { 'a', 'b', 'c', 'd' }));
  }

  @Test
  public void min() {
    assertThat(CharArrays.min('a'), is('a'));
    assertThat(CharArrays.min('a', 'b', 'c'), is('a'));
    assertThat(CharArrays.min('b', 'b', 'b'), is('b'));
  }

  @Test
  public void max() {
    assertThat(CharArrays.max('a'), is('a'));
    assertThat(CharArrays.max('a', 'b', 'c'), is('c'));
    assertThat(CharArrays.max('b', 'b', 'b'), is('b'));
  }

  @Test
  public void avg() {
    assertThat(CharArrays.avg((char) 1), is(1.0));
    assertThat(CharArrays.avg(new char[] { 1, 2, 3 }), is(2.0));
    assertThat(CharArrays.avg(new char[] { 2, 2, 2 }), is(2.0));
  }

  @Test
  public void minEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get min value from empty array"));
    CharArrays.min(new char[0]);
  }

  @Test
  public void maxEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get max value from empty array"));
    CharArrays.max(new char[0]);
  }

  @Test
  public void avgEmptyArray() {
    thrown.expect(InvalidArrayException.class);
    thrown.expectMessage(is("Can't get average value from empty array"));
    CharArrays.avg(new char[0]);
  }

  // Calls the #random(int) method for coverage reasons
  @Test
  public void random() {
    CharArrays.random(1);
  }
}
