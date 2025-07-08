package chillin9panda.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringOperationsTest {
  @Test
  void slugifyTest() {

    String[][] testCases = {
        { "Hello world!", "helloworld" },
        { "Java@123", "java123" },
        { "blank_space", "blankspace" }
    };

    for (String[] testCase : testCases) {
      String input = testCase[0];
      String expected = testCase[1];

      assertEquals(expected, StringOperations.slugify(input));
    }
  }

  @Test
  void extractNumbers() {
    String[][] testCases = {
        { "1h2i3!", "123" },
        { "Java123", "123" },
        { "01blank_space", "01" }
    };

    for (String[] testCase : testCases) {
      String input = testCase[0];
      String expected = testCase[1];

      assertEquals(expected, StringOperations.extractNumbers(input));
    }
  }
}
