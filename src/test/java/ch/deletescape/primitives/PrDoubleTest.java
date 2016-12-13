package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrDoubleTest {

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
