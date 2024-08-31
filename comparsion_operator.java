public class comparsion_operator {

    public static void main(String[] args) {

        /*
         * Assignment operator
         * 1. Equal to - ==
         * 2. Not Equal to - !=
         * 3. Greater than - >
         * 4. Lesser than - <
         * 5. Greater than equal to - >=
         * 6. Lesser than equal to - <=
         */

        int a = 30;
        int b = 10;
        int c = 30;
        int d = 10;

        /// equal operation
        if (a == c) {
            System.out.println("The A and C values are equal");
        }

        /// not equal operation
        if (a != b) {
            System.out.println("The A and B values are not equal");
        }

        /// greater than operation
        if (a > b) {
            System.out.println("The A is greater");
        } else {

            System.out.println("The B is greater");
        }

        /// lesser than operation
        if (a < b) {
            System.out.println("The A is lesser");
        } else {

            System.out.println("The B is lesser");
        }

        /// greater than or equal to
        if (a >= c) {
            System.out.println("The A is greater and equal");
        } else {

            System.out.println("not greater and equal");
        }

        /// lesser than or equal to
        if (b <= d) {
            System.out.println("The b is lesser and equal");
        } else {
            System.out.println("not lesser and equal");
        }

    }

}
