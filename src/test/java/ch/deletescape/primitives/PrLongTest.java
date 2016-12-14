package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrLongTest {
  @Test
  public void fromByte() {
    assertThat(PrLong.from((byte) 1), is(1L));
    assertThat(PrLong.from(Byte.MAX_VALUE), is(127L));
  }

  @Test
  public void fromInt() {
    assertThat(PrLong.from(1), is((long) 1));
    assertThat(PrLong.from(Integer.MAX_VALUE), is(2147483647L));
  }

  @Test
  public void fromShort() {
    assertThat(PrLong.from((short) 1), is((long) 1));
    assertThat(PrLong.from(Short.MAX_VALUE), is((long) 32767));
  }

  @Test
  public void fromChar() {
    assertThat(PrLong.from('\0'), is((long) 0));
    assertThat(PrLong.from(Character.MAX_VALUE), is((long) 65535));
    assertThat(PrLong.from((char) 1), is((long) 1));
  }

  @Test
  public void fromDouble() {
    assertThat(PrLong.from(1.0), is(1L));
    assertThat(PrLong.from(1.3), is(1L));
    assertThat(PrLong.from(Double.MAX_VALUE), is(9223372036854775807L));
  }

  @Test
  public void fromFloat() {
    assertThat(PrLong.from(1f), is(1L));
    assertThat(PrLong.from(1.3f), is(1L));
    assertThat(PrLong.from(Float.MAX_VALUE), is(9223372036854775807L));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrLong.from(true), is(1L));
    assertThat(PrLong.from(false), is(0L));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    PrLong.random();
  }
}
