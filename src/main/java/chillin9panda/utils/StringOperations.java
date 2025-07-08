package chillin9panda.utils;

public class StringOperations {
  /**
   *
   *
   * <ul>
   *   <li>Convert the String to lowercase
   *   <li>Remove special characters
   *   <li>Remove spaces
   * </ul>
   *
   * @parma input a String
   * @return slugified version of the word or phrase
   */
  public static String slugify(String input) {
    return input.toLowerCase().replaceAll("[^a-z0-9]", "").replaceAll("\\s+", "").trim();
  }
}
