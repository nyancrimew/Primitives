package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrStringTest {

  @Test
  public void reverse() {
    assertThat(PrString.reverse("Test"), is("tseT"));
    assertThat(PrString.reverse("Tri"), is("irT"));
    assertThat(PrString.reverse("T"), is("T"));
    assertThat(PrString.reverse(""), is(""));
    assertThat(PrString.reverse(null), is((String) null));
  }

  @Test
  public void simpleFormat() {
    assertThat(PrString.simpleFormat("{}", "Test"), is("Test"));
    assertThat(PrString.simpleFormat("No elements supplied"), is("No elements supplied"));
    assertThat(PrString.simpleFormat("{} {}", "Test", null), is("Test null"));
    // TODO: Throw Exception in the following cases:
    assertThat(PrString.simpleFormat("{} {}", "Test"), is("Test {}"));
    assertThat(PrString.simpleFormat("{}", "Test", "Test 2", "Test 3"), is("Test"));
  }

}
