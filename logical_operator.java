public class logical_operator {
    public static void main(String[] args) {

        /*
         * Logical Operator
         * 1. And Operator
         * 2. Or Operator
         * 3. Not Operator
         */

        int a = 10;
        int b = 20;
        int c = 40;

        /// And Operator
        System.out.println((a > b) && (c > a) ? "A and C are greater" : "B is greater");

        /// Or Operator
        System.out.println((a > b) || (c > a) ? "A and C are greater" : "B is greater");

        /// not operator
        System.out.println((a != b) ? "They are different numbers" : "They are same numbers");

    }
}
