
public class string_methods {
    public static void main(String[] args) {

        String hello = "This is my number";
        String boy = "Imran";

        /// find the length of the string
        int countHelloWord = hello.length();
        System.out.println(countHelloWord);

        /// upper case and lower case
        String upperCaseConversion = hello.toUpperCase();
        System.out.println(upperCaseConversion);

        String lowerCaseConversion = hello.toLowerCase();
        System.out.println(lowerCaseConversion);

        /// finding the character in a string
        int findSpecificWord = hello.indexOf("number");
        System.out.println(findSpecificWord);

        /// Concatenation
        String concatWord = hello + boy;
        System.out.println(concatWord);
        // 0r
        System.out.println(hello.concat(boy));

    }
}
