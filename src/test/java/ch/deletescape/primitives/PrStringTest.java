package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrStringTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

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
    assertThat(PrString.simpleFormat("{} {}", "Test", "Test 2"), is("Test Test 2"));
    assertThat(PrString.simpleFormat("No elements supplied"), is("No elements supplied"));
    assertThat(PrString.simpleFormat("No elements supplied", null), is("No elements supplied"));
    assertThat(PrString.simpleFormat("{} {}", "Test", null), is("Test null"));
    assertThat(PrString.simpleFormat("{} {}", "{}", "Test"), is("{} Test"));
  }

  @Test
  public void simpleFormatNotEnoughElements() {
    thrown.expect(SimpleFormatException.class);
    thrown.expectMessage(is("Not enough elements supplied for \"{} {}\""));
    PrString.simpleFormat("{} {}", "Test");
  }

  @Test
  public void simpleFormatTooManyElements() {
    thrown.expect(SimpleFormatException.class);
    thrown.expectMessage(is("Too many elements supplied for \"{}\""));
    PrString.simpleFormat("{}", "Test", "Test 2", "Test 3");
  }

}
