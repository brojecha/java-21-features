import java.util.Date;

public class StringTemplateFeatures {
    public static void main(String[] args) {
        String name = "Java 21";
        String message = "Features !";
        /**
         * We can use format this way to print statements.
         */
        var printMessage = String.format("Printing %s %s!", name, message);
        System.out.println(printMessage);

        /**
         * We can format this By using Java 21 features called String Template
         */

        String printWholeMessage = STR."Printing, \{name}, \{message}!";
        System.out.println("Meesage :"+printWholeMessage);

        String currentDatae = STR."The Current date is ,\{new Date()}";
        System.out.println(currentDatae);

    }
}
