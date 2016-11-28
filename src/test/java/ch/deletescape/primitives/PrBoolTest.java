package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrBoolTest {
  @Test
  public void fromByte() {
    assertThat(PrBool.from((byte) 1), is(true));
    assertThat(PrBool.from((byte) -1), is(false));
  }

  @Test
  public void fromLong() {
    assertThat(PrBool.from(1L), is(true));
    assertThat(PrBool.from(Long.MAX_VALUE), is(false));
  }

  @Test
  public void fromInt() {
    assertThat(PrBool.from(1), is(true));
    assertThat(PrBool.from(Integer.MAX_VALUE), is(false));
  }

  @Test
  public void fromShort() {
    assertThat(PrBool.from((short) 1), is(true));
    assertThat(PrBool.from(Short.MAX_VALUE), is(false));
  }

  @Test
  public void fromChar() {
    assertThat(PrBool.from('\0'), is(false));
    assertThat(PrBool.from(Character.MAX_VALUE), is(false));
    assertThat(PrBool.from((char) 1), is(true));
  }

  @Test
  public void fromDouble() {
    assertThat(PrBool.from(1.0), is(true));
    assertThat(PrBool.from(1.3), is(false));
    assertThat(PrBool.from(Double.MAX_VALUE), is(false));
  }

  @Test
  public void fromFloat() {
    assertThat(PrBool.from(1f), is(true));
    assertThat(PrBool.from(1.3f), is(false));
    assertThat(PrBool.from(Float.MAX_VALUE), is(false));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    PrBool.random();
  }

}
