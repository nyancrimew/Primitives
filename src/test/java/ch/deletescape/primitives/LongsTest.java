package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LongsTest {
  @Test
  public void fromByte() {
    assertThat(Longs.from((byte) 1), is(1L));
    assertThat(Longs.from(Byte.MAX_VALUE), is(127L));
  }

  @Test
  public void fromInt() {
    assertThat(Longs.from(1), is((long) 1));
    assertThat(Longs.from(Integer.MAX_VALUE), is(2147483647L));
  }

  @Test
  public void fromShort() {
    assertThat(Longs.from((short) 1), is((long) 1));
    assertThat(Longs.from(Short.MAX_VALUE), is((long) 32767));
  }

  @Test
  public void fromChar() {
    assertThat(Longs.from('\0'), is((long) 0));
    assertThat(Longs.from(Character.MAX_VALUE), is((long) 65535));
    assertThat(Longs.from((char) 1), is((long) 1));
  }

  @Test
  public void fromDouble() {
    assertThat(Longs.from(1.0), is(1L));
    assertThat(Longs.from(1.3), is(1L));
    assertThat(Longs.from(Double.MAX_VALUE), is(9223372036854775807L));
  }

  @Test
  public void fromFloat() {
    assertThat(Longs.from(1f), is(1L));
    assertThat(Longs.from(1.3f), is(1L));
    assertThat(Longs.from(Float.MAX_VALUE), is(9223372036854775807L));
  }

  @Test
  public void fromBoolean() {
    assertThat(Longs.from(true), is(1L));
    assertThat(Longs.from(false), is(0L));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    Longs.random();
  }
}
