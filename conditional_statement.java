
public class conditional_statement {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         * Conditional Statements
         * 1. If conditional stament
         * 2. If else conditional statement
         * 3. Else if conditional statement
         * 4. Switch conditonal statement
         */

        int a = 5;
        int b = 20;
        int c = 30;

        /// if statement
        if (a == 5) {
            System.out.println("A is equal");
        }

        /// if else statement
        if (a < b) {
            System.out.println("A is smaller");
        } else {
            System.out.println("A is not smaller");
        }

        /// else if statement
        if (a > b && a > c) {
            System.out.println("A is greater than all numbers");
        } else if (b > a && b > c) {
            System.out.println("B is greater than all numbers");
        } else {
            System.out.println("C is greater than all numbers");
        }

        /// Switch statement
        int day = 4;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

    }
}
