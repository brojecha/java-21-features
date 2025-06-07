import java.util.Objects;

public class PatternMatchingFeatures {

    public static void main(String[] args) {
        System.out.println(checkObjectDataWithPatternMatchingWithSwitch("Hello",1));
        System.out.println(checkObjectDataWithPatternMatchingWithSwitch(100,1));
        System.out.println(checkObjectDataWithPatternMatchingWithSwitch(100L,1));
        System.out.println(checkObjectDataWithPatternMatchingWithSwitch(100.0,1));

    }

    /**
     *
     * @param obj
     *
     * Before pattern MAtching features in java 21 , we used instanceof keyword to check the type of object.
     * The code is not clean and hard to read and have a lot of type casting.
     */
    void checkObjectData(Object obj) {
        if(obj instanceof String) {
            String val = (String)obj;
            System.out.println(val.toUpperCase());
        } else if (obj instanceof  Integer) {
            Integer val = (Integer)obj;
            System.out.println(val + 1);
        }

        /**
         *  Java 21 features Pattern Matching with Switch case Concept Implemented.We streamline the code further.
         *  The code is clean and easy to read.
         */


    }

    /**
     *
     * @param myData
     * @param myVal
     * @return
     *
     * We can pass multiple parameters in pattern matching switch case and call the method with multiple parameters.
     */

    static String checkObjectDataWithPatternMatchingWithSwitch(Object myData,int myVal) {
        return switch (myData) {
            case Integer i -> "int value : "+ i;
            case String s -> "String case : "+s;
            case Double d -> "Double case : "+d;
            case Long l -> "Long case : "+l;
            default -> "Unknown";
        };
    }

    static String getStringData(int val){
        return String.valueOf(val);
    }
}
