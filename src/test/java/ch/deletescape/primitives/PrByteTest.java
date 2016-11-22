package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrByteTest {
  @Test
  public void fromLong() {
    assertThat(PrByte.from(1L), is((byte) 1));
    assertThat(PrByte.from(Long.MAX_VALUE), is((byte) -1));
    assertThat(PrByte.from(Long.MAX_VALUE - 1), is((byte) -2));
  }

  @Test
  public void fromInt() {
    assertThat(PrByte.from(1), is((byte) 1));
    assertThat(PrByte.from(Integer.MAX_VALUE), is((byte) -1));
  }

  @Test
  public void fromShort() {
    assertThat(PrByte.from((short) 1), is((byte) 1));
    assertThat(PrByte.from(Short.MAX_VALUE), is((byte) -1));
  }

  @Test
  public void fromChar() {
    assertThat(PrByte.from('\0'), is((byte) 0));
    assertThat(PrByte.from(Character.MAX_VALUE), is((byte) -1));
    assertThat(PrByte.from((char) 1), is((byte) 1));
  }

  @Test
  public void fromDouble() {
    assertThat(PrByte.from(1.0), is((byte) 1));
    assertThat(PrByte.from(1.3), is((byte) 1));
    assertThat(PrByte.from(Double.MAX_VALUE), is((byte) -1));
  }

  @Test
  public void fromFloat() {
    assertThat(PrByte.from(1f), is((byte) 1));
    assertThat(PrByte.from(1.3f), is((byte) 1));
    assertThat(PrByte.from(Float.MAX_VALUE), is((byte) -1));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrByte.from(true), is((byte) 1));
    assertThat(PrByte.from(false), is((byte) 0));
  }

}
