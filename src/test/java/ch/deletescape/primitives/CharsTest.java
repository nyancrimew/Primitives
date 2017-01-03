package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CharsTest {
  @Test
  public void fromLong() {
    assertThat(Chars.from(1L), is((char) 1));
    assertThat(Chars.from(Long.MAX_VALUE), is((char) -1));
    assertThat(Chars.from(Long.MAX_VALUE - 1), is((char) -2));
  }

  @Test
  public void fromInt() {
    assertThat(Chars.from(1), is((char) 1));
    assertThat(Chars.from(Integer.MAX_VALUE), is((char) -1));
  }

  @Test
  public void fromByte() {
    assertThat(Chars.from((byte) 1), is((char) 1));
    assertThat(Chars.from(Byte.MAX_VALUE), is((char) 127));
  }

  @Test
  public void fromShort() {
    assertThat(Chars.from((short) 1), is((char) 1));
    assertThat(Chars.from(Short.MAX_VALUE), is((char) 32767));
  }

  @Test
  public void fromDouble() {
    assertThat(Chars.from(1.0), is((char) 1));
    assertThat(Chars.from(1.3), is((char) 1));
    assertThat(Chars.from(Double.MAX_VALUE), is((char) -1));
  }

  @Test
  public void fromFloat() {
    assertThat(Chars.from(1f), is((char) 1));
    assertThat(Chars.from(1.3f), is((char) 1));
    assertThat(Chars.from(Float.MAX_VALUE), is((char) -1));
  }

  @Test
  public void fromBoolean() {
    assertThat(Chars.from(true), is((char) 1));
    assertThat(Chars.from(false), is((char) 0));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    Chars.random();
  }
}
