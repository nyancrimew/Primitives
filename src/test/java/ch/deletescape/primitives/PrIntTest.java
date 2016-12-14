package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrIntTest {

  @Test
  public void fromByte() {
    assertThat(PrInt.from((byte) 1), is(1));
    assertThat(PrInt.from(Byte.MAX_VALUE), is(127));
  }

  @Test
  public void fromShort() {
    assertThat(PrInt.from((short) 1), is(1));
    assertThat(PrInt.from(Short.MAX_VALUE), is(32767));
  }

  @Test
  public void fromChar() {
    assertThat(PrInt.from('\0'), is(0));
    assertThat(PrInt.from(Character.MAX_VALUE), is(65535));
    assertThat(PrInt.from((char) 1), is(1));
  }

  @Test
  public void fromLong() {
    assertThat(PrInt.from(1L), is(1));
    assertThat(PrInt.from(Long.MAX_VALUE), is(-1));
    assertThat(PrInt.from(Long.MAX_VALUE - 1), is(-2));
  }

  @Test
  public void fromDouble() {
    assertThat(PrInt.from(1.0), is(1));
    assertThat(PrInt.from(1.3), is(1));
    assertThat(PrInt.from(Double.MAX_VALUE), is(2147483647));
  }

  @Test
  public void fromFloat() {
    assertThat(PrInt.from(1f), is(1));
    assertThat(PrInt.from(1.3f), is(1));
    assertThat(PrInt.from(Float.MAX_VALUE), is(2147483647));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrInt.from(true), is(1));
    assertThat(PrInt.from(false), is(0));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    PrInt.random();
  }
}
