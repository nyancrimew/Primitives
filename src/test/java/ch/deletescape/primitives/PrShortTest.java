package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrShortTest {
  @Test
  public void fromChar() {
    assertThat(PrShort.from((char) 1), is((short) 1));
    assertThat(PrShort.from('\0'), is((short) 0));
  }

  @Test
  public void fromLong() {
    assertThat(PrShort.from(1L), is((short) 1));
    assertThat(PrShort.from(Long.MAX_VALUE), is((short) -1));
    assertThat(PrShort.from(Long.MAX_VALUE - 1), is((short) -2));
  }

  @Test
  public void fromInt() {
    assertThat(PrShort.from(1), is((short) 1));
    assertThat(PrShort.from(Integer.MAX_VALUE), is((short) -1));
  }

  @Test
  public void fromDouble() {
    assertThat(PrShort.from(1.0), is((short) 1));
    assertThat(PrShort.from(1.3), is((short) 1));
    assertThat(PrShort.from(Double.MAX_VALUE), is((short) -1));
  }

  @Test
  public void fromFloat() {
    assertThat(PrShort.from(1f), is((short) 1));
    assertThat(PrShort.from(1.3f), is((short) 1));
    assertThat(PrShort.from(Float.MAX_VALUE), is((short) -1));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrShort.from(true), is((short) 1));
    assertThat(PrShort.from(false), is((short) 0));
  }

}
