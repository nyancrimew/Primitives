package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoublesTest {
  @Test
  public void fromByte() {
    assertThat(Doubles.from((byte) 1), is((double) 1));
    assertThat(Doubles.from(Byte.MAX_VALUE), is((double) 127));
  }

  @Test
  public void fromLong() {
    assertThat(Doubles.from(1L), is((double) 1));
    assertThat(Doubles.from(Long.MAX_VALUE), is(9.223372036854776E18));
    assertThat(Doubles.from(Long.MAX_VALUE - 1), is(9.223372036854776E18));
  }

  @Test
  public void fromInt() {
    assertThat(Doubles.from(1), is((double) 1));
    assertThat(Doubles.from(Integer.MAX_VALUE), is(2.147483647E9));
  }

  @Test
  public void fromShort() {
    assertThat(Doubles.from((short) 1), is((double) 1));
    assertThat(Doubles.from(Short.MAX_VALUE), is((double) 32767));
  }

  @Test
  public void fromChar() {
    assertThat(Doubles.from('\0'), is((double) 0));
    assertThat(Doubles.from(Character.MAX_VALUE), is((double) 65535));
    assertThat(Doubles.from((char) 1), is((double) 1));
  }

  @Test
  public void fromFloat() {
    assertThat(Doubles.from(1f), is((double) 1));
    // assertThat(PrDouble.from(1.3f), is((double) 1));
    assertThat(Doubles.from(Float.MAX_VALUE), is(3.4028234663852886E38));
  }

  @Test
  public void fromBoolean() {
    assertThat(Doubles.from(true), is(1.0));
    assertThat(Doubles.from(false), is(0.0));
  }

  @Test
  public void equality() {
    assertThat(Doubles.equality(1d, Doubles.from(true), 0.001), is(true));
    assertThat(Doubles.equality(1., 0.9999, 0.001), is(true));
    assertThat(Doubles.equality(1d, 1.3, 0.001), is(false));
    assertThat(Doubles.equality(1d, 1.3, 1), is(true));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    Doubles.random();
  }
}
