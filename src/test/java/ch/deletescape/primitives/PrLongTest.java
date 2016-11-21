package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrLongTest {

  @Test
  public void fromDouble() {
    assertThat(PrLong.from(1.0), is(1L));
    assertThat(PrLong.from(1.3), is(1L));
    assertThat(PrLong.from(Double.MAX_VALUE), is(9223372036854775807L));
  }

  @Test
  public void fromFloat() {
    assertThat(PrLong.from(1f), is(1L));
    assertThat(PrLong.from(1.3f), is(1L));
    assertThat(PrLong.from(Float.MAX_VALUE), is(9223372036854775807L));
  }

  @Test
  public void fromBoolean() {
    assertThat(PrLong.from(true), is(1L));
    assertThat(PrLong.from(false), is(0L));
  }

}
