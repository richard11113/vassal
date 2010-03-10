package VASSAL.tools.nio.file;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public abstract class PathToStringTest extends AbstractPathMethodTest {
  protected final String input;

  public PathToStringTest(FSHandler fac, String input, Object expected) {
    super(fac, expected);

    this.input = input;
  }

  protected void doTest() {
    assertEquals(expected, fs.getPath(input).toString());
  }
}