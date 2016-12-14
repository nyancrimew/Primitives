package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrDoubleTest {
  @Test
  public void fromByte() {
    assertThat(PrDouble.from((byte) 1), is((double) 1));
    assertThat(PrDouble.from(Byte.MAX_VALUE), is((double) 127));
  }

  @Test
  public void fromLong() {
    assertThat(PrDouble.from(1L), is((double) 1));
    assertThat(PrDouble.from(Long.MAX_VALUE), is(9.223372036854776E18));
    assertThat(PrDouble.from(Long.MAX_VALUE - 1), is(9.223372036854776E18));
  }

  @Test
  public void fromInt() {
    assertThat(PrDouble.from(1), is((double) 1));
    assertThat(PrDouble.from(Integer.MAX_VALUE), is(2.147483647E9));
  }

  @Test
  public void fromShort() {
    assertThat(PrDouble.from((short) 1), is((double) 1));
    assertThat(PrDouble.from(Short.MAX_VALUE), is((double) 32767));
  }

  @Test
  public void fromChar() {
    assertThat(PrDouble.from('\0'), is((double) 0));
    assertThat(PrDouble.from(Character.MAX_VALUE), is((double) 65535));
    assertThat(PrDouble.from((char) 1), is((double) 1));
  }

  @Test
  public void fromFloat() {
    assertThat(PrDouble.from(1f), is((double) 1));
    // assertThat(PrDouble.from(1.3f), is((double) 1));
    assertThat(PrDouble.from(Float.MAX_VALUE), is(3.4028234663852886E38));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrDouble.from(true), is(1.0));
    assertThat(PrDouble.from(false), is(0.0));
  }

  @Test
  public void equality() {
    assertThat(PrDouble.equality(1d, PrDouble.from(true), 0.001), is(true));
    assertThat(PrDouble.equality(1., 0.9999, 0.001), is(true));
    assertThat(PrDouble.equality(1d, 1.3, 0.001), is(false));
    assertThat(PrDouble.equality(1d, 1.3, 1), is(true));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    PrDouble.random();
  }
}
