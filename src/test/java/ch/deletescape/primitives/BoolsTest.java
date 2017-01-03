package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BoolsTest {
  @Test
  public void fromByte() {
    assertThat(Bools.from((byte) 1), is(true));
    assertThat(Bools.from((byte) -1), is(false));
  }

  @Test
  public void fromLong() {
    assertThat(Bools.from(1L), is(true));
    assertThat(Bools.from(Long.MAX_VALUE), is(false));
  }

  @Test
  public void fromInt() {
    assertThat(Bools.from(1), is(true));
    assertThat(Bools.from(Integer.MAX_VALUE), is(false));
  }

  @Test
  public void fromShort() {
    assertThat(Bools.from((short) 1), is(true));
    assertThat(Bools.from(Short.MAX_VALUE), is(false));
  }

  @Test
  public void fromChar() {
    assertThat(Bools.from('\0'), is(false));
    assertThat(Bools.from(Character.MAX_VALUE), is(false));
    assertThat(Bools.from((char) 1), is(true));
  }

  @Test
  public void fromDouble() {
    assertThat(Bools.from(1.0), is(true));
    assertThat(Bools.from(1.3), is(false));
    assertThat(Bools.from(Double.MAX_VALUE), is(false));
  }

  @Test
  public void fromFloat() {
    assertThat(Bools.from(1f), is(true));
    assertThat(Bools.from(1.3f), is(false));
    assertThat(Bools.from(Float.MAX_VALUE), is(false));
  }

  // Calls the #random() method for coverage reasons
  @Test
  public void random() {
    Bools.random();
  }

}
