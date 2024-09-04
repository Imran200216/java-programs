
import java.util.Arrays;

public class array_methods {

    public static void main(String[] args) {

        int[] a = { 20, 30, 50, 40 };
        int[] b = { 20, 30, 50, 40 };

        // Check if the arrays are equal
        boolean arrayEqual = Arrays.equals(a, b);

        // Print the result
        System.out.println(arrayEqual); // Should print true

        /// array length
        int arrayLength = a.length;

        System.out.println(arrayLength);

        /// array sorting
        Arrays.sort(a);
        /// while sorting it should be typed cast to string
        System.out.println(Arrays.toString(a));

        /// array copy
        /// Copies first 5 elements
        int[] newArray = Arrays.copyOf(a, 4);

        System.out.println(Arrays.toString(newArray));

        /// adding of two arrays
        // Calculate the length of the new array
        int[] result = new int[a.length + b.length];

        // Copy elements from the first array to the result array
        System.arraycopy(a, 0, result, 0, a.length);

        // Copy elements from the second array to the result array
        System.arraycopy(b, 0, result, a.length, b.length);

        // Print the concatenated array
        System.out.println(Arrays.toString(result));

    }

}
