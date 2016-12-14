package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrFloatTest {
  @Test
  public void fromByte() {
    assertThat(PrFloat.from((byte) 1), is(1f));
    assertThat(PrFloat.from(Byte.MAX_VALUE), is(127f));
  }

  @Test
  public void fromLong() {
    assertThat(PrFloat.from(1L), is((float) 1));
    assertThat(PrFloat.from(Long.MAX_VALUE), is(9.223372E18F));
    assertThat(PrFloat.from(Long.MAX_VALUE - 1), is(9.223372E18F));
  }

  @Test
  public void fromInt() {
    assertThat(PrFloat.from(1), is((float) 1));
    assertThat(PrFloat.from(Integer.MAX_VALUE), is(2.14748365E9F));
  }

  @Test
  public void fromShort() {
    assertThat(PrFloat.from((short) 1), is((float) 1));
    assertThat(PrFloat.from(Short.MAX_VALUE), is((float) 32767));
  }

  @Test
  public void fromChar() {
    assertThat(PrFloat.from('\0'), is((float) 0));
    assertThat(PrFloat.from(Character.MAX_VALUE), is((float) 65535));
    assertThat(PrFloat.from((char) 1), is((float) 1));
  }

  @Test
  public void fromDouble() {
    assertThat(PrFloat.from(1.0), is(1f));
    assertThat(PrFloat.from(1.3), is(1.3f));
    assertThat(PrFloat.from(Double.MAX_VALUE), is(Float.POSITIVE_INFINITY));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrFloat.from(true), is(1f));
    assertThat(PrFloat.from(false), is(0f));
  }

  @Test
  public void equality() {
    assertThat(PrFloat.equality(1f, PrFloat.from(1), 0.001f), is(true));
    assertThat(PrFloat.equality(1f, 0.999f, 0.001f), is(true));
    assertThat(PrFloat.equality(1f, 1.3f, 0.001f), is(false));
    assertThat(PrFloat.equality(1f, 1.3f, 1f), is(true));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    PrFloat.random();
  }
}
