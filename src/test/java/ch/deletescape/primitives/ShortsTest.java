package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ShortsTest {
  @Test
  public void fromByte() {
    assertThat(Shorts.from((byte) 1), is((short) 1));
    assertThat(Shorts.from(Byte.MAX_VALUE), is((short) 127));
  }

  @Test
  public void fromChar() {
    assertThat(Shorts.from((char) 1), is((short) 1));
    assertThat(Shorts.from('\0'), is((short) 0));
  }

  @Test
  public void fromLong() {
    assertThat(Shorts.from(1L), is((short) 1));
    assertThat(Shorts.from(Long.MAX_VALUE), is((short) -1));
    assertThat(Shorts.from(Long.MAX_VALUE - 1), is((short) -2));
  }

  @Test
  public void fromInt() {
    assertThat(Shorts.from(1), is((short) 1));
    assertThat(Shorts.from(Integer.MAX_VALUE), is((short) -1));
  }

  @Test
  public void fromDouble() {
    assertThat(Shorts.from(1.0), is((short) 1));
    assertThat(Shorts.from(1.3), is((short) 1));
    assertThat(Shorts.from(Double.MAX_VALUE), is((short) -1));
  }

  @Test
  public void fromFloat() {
    assertThat(Shorts.from(1f), is((short) 1));
    assertThat(Shorts.from(1.3f), is((short) 1));
    assertThat(Shorts.from(Float.MAX_VALUE), is((short) -1));
  }

  @Test
  public void fromBoolean() {
    assertThat(Shorts.from(true), is((short) 1));
    assertThat(Shorts.from(false), is((short) 0));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    Shorts.random();
  }
}
