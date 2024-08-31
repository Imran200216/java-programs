
import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();

        int result = a + b;
        System.out.println("The result is" + result);
    }
}
