package lambda;

import java.util.function.*;

public class FunctionalInterfacesOOB {

    public static void runPredicate(int value) {
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(String.format("Input value more than 5: %s", predicate.test(value)));
    }

    public static void runBinaryOperator(int first, int second) {
        BinaryOperator<Integer> binaryOperator = (x, y) -> x > y ? x : y;
        System.out.println(String.format("Which of inputs is more: %s", binaryOperator.apply(first, second).toString()));
    }

    public static void runFunction(int value) {
        Function<Integer, String> function = x -> String.format("Input value is: %s", x);
        System.out.println(function.apply(value));
    }

    public static void runConsumer(int value) {
        Consumer<Integer> consumer = x -> System.out.println(String.format("Input value is: %s", x));
        consumer.accept(value);
    }

    public static void runSupplier() {
        Supplier<String> supplier = () -> "Simplest example of Supplier<T>";
        System.out.println(supplier.get());
    }

}
