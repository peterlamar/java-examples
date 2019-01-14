package lambda;

import java.util.Date;

interface Stringifiable<T> {

    String stringify(T t);

}

public class FunctionalInterfaceExample {

    public static void runFunctionInterfaceExample() {

        Stringifiable<Integer> intExample = x -> String.format("String value for int: %s", x.toString());
        Stringifiable<StringBuffer> sbExample = x -> String.format("String value for StringBuffer: %s", x.toString());
        Stringifiable<Date> dateExample = x -> String.format("String value for Date: %s", x.toString());

        System.out.println(intExample.stringify(5));
        System.out.println(sbExample.stringify(new StringBuffer("some string")));
        System.out.println(dateExample.stringify(new Date(111222333)));
    }

}
