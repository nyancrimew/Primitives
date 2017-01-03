package ch.deletescape.primitives;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void reverse() {
    assertThat(Strings.reverse("Test"), is("tseT"));
    assertThat(Strings.reverse("Tri"), is("irT"));
    assertThat(Strings.reverse("T"), is("T"));
    assertThat(Strings.reverse(""), is(""));
    assertThat(Strings.reverse(null), is((String) null));
  }

  @Test
  public void simpleFormat() {
    assertThat(Strings.simpleFormat("{}", "Test"), is("Test"));
    assertThat(Strings.simpleFormat("{} {}", "Test", "Test 2"), is("Test Test 2"));
    assertThat(Strings.simpleFormat("No elements supplied"), is("No elements supplied"));
    assertThat(Strings.simpleFormat("No elements supplied", (Object[]) null), is("No elements supplied"));
    assertThat(Strings.simpleFormat("{} {}", "Test", null), is("Test null"));
    assertThat(Strings.simpleFormat("{} {}", "{}", "Test"), is("{} Test"));
    assertThat(Strings.simpleFormat("{}", 1), is("1"));
  }

  @Test
  public void simpleFormatNotEnoughElements() {
    thrown.expect(SimpleFormatException.class);
    thrown.expectMessage(is("Number of elements (1) and tokens (2) doesn't match."));
    Strings.simpleFormat("{} {}", "Test");
  }

  @Test
  public void simpleFormatTooManyElements() {
    thrown.expect(SimpleFormatException.class);
    thrown.expectMessage(is("Number of elements (3) and tokens (1) doesn't match."));
    Strings.simpleFormat("{}", "Test", "Test 2", "Test 3");
  }

  @Test
  public void repeat() {
    assertThat(Strings.repeat(5, ' '), is("     "));
    assertThat(Strings.repeat(5, 'a', ' '), is("a a a a a "));
    assertThat(Strings.repeat(3, "tst"), is("tsttsttst"));
    assertThat(Strings.repeat(2, ""), is(""));
  }
}
