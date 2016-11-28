package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrCharTest {
  @Test
  public void fromLong() {
    assertThat(PrChar.from(1L), is((char) 1));
    assertThat(PrChar.from(Long.MAX_VALUE), is((char) -1));
    assertThat(PrChar.from(Long.MAX_VALUE - 1), is((char) -2));
  }

  @Test
  public void fromInt() {
    assertThat(PrChar.from(1), is((char) 1));
    assertThat(PrChar.from(Integer.MAX_VALUE), is((char) -1));
  }

  @Test
  public void fromByte() {
    assertThat(PrChar.from((byte) 1), is((char) 1));
    assertThat(PrChar.from(Byte.MAX_VALUE), is((char) 127));
  }

  @Test
  public void fromShort() {
    assertThat(PrChar.from((short) 1), is((char) 1));
    assertThat(PrChar.from(Short.MAX_VALUE), is((char) 32767));
  }

  @Test
  public void fromDouble() {
    assertThat(PrChar.from(1.0), is((char) 1));
    assertThat(PrChar.from(1.3), is((char) 1));
    assertThat(PrChar.from(Double.MAX_VALUE), is((char) -1));
  }

  @Test
  public void fromFloat() {
    assertThat(PrChar.from(1f), is((char) 1));
    assertThat(PrChar.from(1.3f), is((char) 1));
    assertThat(PrChar.from(Float.MAX_VALUE), is((char) -1));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrChar.from(true), is((char) 1));
    assertThat(PrChar.from(false), is((char) 0));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    PrChar.random();
  }
}
