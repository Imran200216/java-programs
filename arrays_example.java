public class arrays_example {
  public static void main(String[] args) {

    /// array type integer
    int[] nums = { 2, 3, 4, 5, 6, 7 };

    for (int i : nums) {
      System.out.println(i);
    }

    /// array type String
    String[] alpha = { "abc", "bcd", "cde" };

    for (String i : alpha) {
      System.out.println(i);
    }

    /// array type float
    Float[] floats = { 20f, 30f, 40f };
    for (Float i : floats) {
      System.out.println(i);
    }

    /// array type characters
    char[] characters = { 'a', 'b', 'c' };

    for (char i : characters) {
      System.out.println(i);
    }

    /// array type double
    Double[] doubles = { 20.0, 30.0, 40.0 };

    for (Double d : doubles) {
      System.out.println(d);
    }

  }
}
