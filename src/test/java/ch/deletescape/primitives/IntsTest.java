package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class IntsTest {

  @Test
  public void fromByte() {
    assertThat(Ints.from((byte) 1), is(1));
    assertThat(Ints.from(Byte.MAX_VALUE), is(127));
  }

  @Test
  public void fromShort() {
    assertThat(Ints.from((short) 1), is(1));
    assertThat(Ints.from(Short.MAX_VALUE), is(32767));
  }

  @Test
  public void fromChar() {
    assertThat(Ints.from('\0'), is(0));
    assertThat(Ints.from(Character.MAX_VALUE), is(65535));
    assertThat(Ints.from((char) 1), is(1));
  }

  @Test
  public void fromLong() {
    assertThat(Ints.from(1L), is(1));
    assertThat(Ints.from(Long.MAX_VALUE), is(-1));
    assertThat(Ints.from(Long.MAX_VALUE - 1), is(-2));
  }

  @Test
  public void fromDouble() {
    assertThat(Ints.from(1.0), is(1));
    assertThat(Ints.from(1.3), is(1));
    assertThat(Ints.from(Double.MAX_VALUE), is(2147483647));
  }

  @Test
  public void fromFloat() {
    assertThat(Ints.from(1f), is(1));
    assertThat(Ints.from(1.3f), is(1));
    assertThat(Ints.from(Float.MAX_VALUE), is(2147483647));
  }

  @Test
  public void fromBoolean() {
    assertThat(Ints.from(true), is(1));
    assertThat(Ints.from(false), is(0));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    Ints.random();
  }
}
