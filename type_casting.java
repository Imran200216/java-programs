public class type_casting {
    public static void main(String[] args) {

        /*
         * Two types of type casting
         * 1. Widening Casting
         * 2. Narrow Casting
         */

        /// Widening Casting
        int myInt = 20;
        /// it is automatically cast
        double myDouble = myInt;
        System.out.println(myDouble);

        /// Narrow Casting
        int myNewInt = 20;
        /// it is used to specify the data type to be changed
        double mynewDouble = (double) myNewInt;

        System.out.println(mynewDouble);

    }
}
