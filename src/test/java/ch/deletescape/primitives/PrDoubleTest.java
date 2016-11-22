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

}
