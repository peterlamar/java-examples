package lambda;

interface Returnable {
    String returnSome();
}

public class MethodReferenceExample {

    public static String getSomeFromStatic() {
        return "String from static method";
    }

    public String getFromDynamic() {
        return "String from dynamic method";
    }
}
