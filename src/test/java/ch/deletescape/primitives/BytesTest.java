package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BytesTest {
  @Test
  public void fromLong() {
    assertThat(Bytes.from(1L), is((byte) 1));
    assertThat(Bytes.from(Long.MAX_VALUE), is((byte) -1));
    assertThat(Bytes.from(Long.MAX_VALUE - 1), is((byte) -2));
  }

  @Test
  public void fromInt() {
    assertThat(Bytes.from(1), is((byte) 1));
    assertThat(Bytes.from(Integer.MAX_VALUE), is((byte) -1));
  }

  @Test
  public void fromShort() {
    assertThat(Bytes.from((short) 1), is((byte) 1));
    assertThat(Bytes.from(Short.MAX_VALUE), is((byte) -1));
  }

  @Test
  public void fromChar() {
    assertThat(Bytes.from('\0'), is((byte) 0));
    assertThat(Bytes.from(Character.MAX_VALUE), is((byte) -1));
    assertThat(Bytes.from((char) 1), is((byte) 1));
  }

  @Test
  public void fromDouble() {
    assertThat(Bytes.from(1.0), is((byte) 1));
    assertThat(Bytes.from(1.3), is((byte) 1));
    assertThat(Bytes.from(Double.MAX_VALUE), is((byte) -1));
  }

  @Test
  public void fromFloat() {
    assertThat(Bytes.from(1f), is((byte) 1));
    assertThat(Bytes.from(1.3f), is((byte) 1));
    assertThat(Bytes.from(Float.MAX_VALUE), is((byte) -1));
  }

  @Test
  public void fromBoolean() {
    assertThat(Bytes.from(true), is((byte) 1));
    assertThat(Bytes.from(false), is((byte) 0));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    Bytes.random();
  }

}
