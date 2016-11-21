package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrFloatTest {

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

}
