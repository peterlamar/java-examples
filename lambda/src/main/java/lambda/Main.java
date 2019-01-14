package lambda;

public class Main {

    public static void main(String[] args) {
        FunctionalInterfaceExample.runFunctionInterfaceExample();

        LocalAndGlobalVariablesExample lgExample = new LocalAndGlobalVariablesExample();
        lgExample.useGlobalVariables();
        lgExample.useLocalVariables();

        MethodReferenceExample mrExample = new MethodReferenceExample();
        Returnable staticExample = MethodReferenceExample::getSomeFromStatic;
        System.out.println(staticExample.returnSome());
        Returnable dynamicExample = mrExample::getFromDynamic;
        System.out.println(dynamicExample.returnSome());

        FunctionalInterfacesOOB.runBinaryOperator(5, 7);
        FunctionalInterfacesOOB.runConsumer(6);
        FunctionalInterfacesOOB.runFunction(3);
        FunctionalInterfacesOOB.runPredicate(11);
        FunctionalInterfacesOOB.runSupplier();
    }

}
