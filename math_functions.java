public class math_functions {
    public static void main(String[] args) {

        int a = 30;
        int b = 40;

        /// to find the max value
        int maxValue = Math.max(a, b);
        System.out.println(maxValue);

        /// to find the min value
        int minValue = Math.min(a, b);
        System.out.println(minValue);

        /// to find the square root value
        int squareValue = (int) Math.sqrt(a);
        System.out.println(squareValue);

        /// to make the absolute value
        int absoluteValue = Math.abs(a);
        System.out.println(absoluteValue);

        /// to generate the random number
        int randomNumber = (int) (Math.random() * 101);
        /// the above sentence means the 0 to 100 is the random value to be generated
        System.out.println(randomNumber);
    }
}
