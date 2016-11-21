package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class IntTest {

  @Test
  public void fromLong() {
    assertThat(Int.from(1L), is(1));
    assertThat(Int.from(Long.MAX_VALUE), is(-1));
    assertThat(Int.from(Long.MAX_VALUE - 1), is(-2));
  }

  @Test
  public void fromDouble() {
    assertThat(Int.from(1.0), is(1));
    assertThat(Int.from(1.3), is(1));
    assertThat(Int.from(Double.MAX_VALUE), is(2147483647));
  }

  @Test
  public void fromFloat() {
    assertThat(Int.from((float) 1), is(1));
    assertThat(Int.from((float) 1.3), is(1));
    assertThat(Int.from(Float.MAX_VALUE), is(2147483647));
  }

  @Test
  public void fromBoolean() {
    assertThat(Int.from(true), is(1));
    assertThat(Int.from(false), is(0));
  }

}
