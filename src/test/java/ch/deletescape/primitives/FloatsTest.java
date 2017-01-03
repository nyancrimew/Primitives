package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FloatsTest {
  @Test
  public void fromByte() {
    assertThat(Floats.from((byte) 1), is(1f));
    assertThat(Floats.from(Byte.MAX_VALUE), is(127f));
  }

  @Test
  public void fromLong() {
    assertThat(Floats.from(1L), is((float) 1));
    assertThat(Floats.from(Long.MAX_VALUE), is(9.223372E18F));
    assertThat(Floats.from(Long.MAX_VALUE - 1), is(9.223372E18F));
  }

  @Test
  public void fromInt() {
    assertThat(Floats.from(1), is((float) 1));
    assertThat(Floats.from(Integer.MAX_VALUE), is(2.14748365E9F));
  }

  @Test
  public void fromShort() {
    assertThat(Floats.from((short) 1), is((float) 1));
    assertThat(Floats.from(Short.MAX_VALUE), is((float) 32767));
  }

  @Test
  public void fromChar() {
    assertThat(Floats.from('\0'), is((float) 0));
    assertThat(Floats.from(Character.MAX_VALUE), is((float) 65535));
    assertThat(Floats.from((char) 1), is((float) 1));
  }

  @Test
  public void fromDouble() {
    assertThat(Floats.from(1.0), is(1f));
    assertThat(Floats.from(1.3), is(1.3f));
    assertThat(Floats.from(Double.MAX_VALUE), is(Float.POSITIVE_INFINITY));
  }

  @Test
  public void fromBoolean() {
    assertThat(Floats.from(true), is(1f));
    assertThat(Floats.from(false), is(0f));
  }

  @Test
  public void equality() {
    assertThat(Floats.equality(1f, Floats.from(1), 0.001f), is(true));
    assertThat(Floats.equality(1f, 0.999f, 0.001f), is(true));
    assertThat(Floats.equality(1f, 1.3f, 0.001f), is(false));
    assertThat(Floats.equality(1f, 1.3f, 1f), is(true));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    Floats.random();
  }
}
