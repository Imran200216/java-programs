
import java.util.Scanner;

public class user_input {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();

        /// integer input
        int result = a + b;
        System.out.println("The result is" + result);

        /// char input
        System.out.println("Give me the input of character: ");
        char characterInput = inputScanner.nextLine().charAt(0);

        System.out.println(characterInput);

        /// float input
        System.out.println("Give me the input of float: ");
        float floatInput = inputScanner.nextFloat();

        System.out.println(floatInput);

        /// double input
        System.out.println("Give me the input of double: ");
        double doubleInput = inputScanner.nextDouble();

        System.out.println(doubleInput);

        /// string input
        System.out.println("Give me the input of string: ");
        String StringInput = inputScanner.nextLine();

        System.out.println(StringInput);

    }
}
