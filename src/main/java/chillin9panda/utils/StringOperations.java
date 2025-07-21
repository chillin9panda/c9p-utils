package chillin9panda.utils;

public class StringOperations {
  /**
   *
   *
   * <ul>
   * <li>Convert the String to lowercase
   * <li>Remove special characters
   * <li>Remove spaces
   * </ul>
   *
   * @param input String
   * @return slugified version of the word or phrase
   */
  public static String slugify(String input) {
    return input.toLowerCase().replaceAll("[^a-z0-9]", "").replaceAll("\\s+", "").trim();
  }

  /**
   * @param input String
   * @return numbers from a given input string.
   */
  public static String extractNumbers(String input) {
    if (null == input) {
      return "";
    }

    return input.replaceAll("[^0-9]", "");
  }

  /**
   * @param input String
   * @return replace multiple whitespace characters with a single space.
   */
  public static String normalizeWhitespace(String input) {
    if (input == null) {
      return "";
    }

    return input.trim().replaceAll("\\s+", " ");
  }

}
