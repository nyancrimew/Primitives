package ch.deletescape.primitives.arrays;

public class InvalidArrayException extends RuntimeException {

  private static final long serialVersionUID = -4396199372828547280L;

  public InvalidArrayException(String message) {
    super(message);
  }
}
