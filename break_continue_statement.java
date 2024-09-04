public class break_continue_statement {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {

            /// break statement
            if (i == 4) {
                break;
            }

            System.err.println(i);
        }

        for (int i = 1; i < 10; i++) {

            /// Continue statement
            if (i == 4) {
                continue;
            }

            System.err.println(i);
        }

    }
}
