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
