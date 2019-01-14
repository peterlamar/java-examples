package lambda;

import java.util.concurrent.atomic.AtomicInteger;

interface Changeable {

    void changeValue();

}

public class LocalAndGlobalVariablesExample {

    private int first = 10;
    private int second = 5;

    /* It's possible to change global variables as in any other general places */
    public void useGlobalVariables() {

        Changeable global = () -> {
            first = 22;
            this.second = 33;
        };

        System.out.println(String.format("Before global variables changing: %s and %s", first, second));
        global.changeValue();
        System.out.println(String.format("After global variables changing: %s and %s", first, second));
    }

    /* It's impossible to change simple local variables because any local variable which need to use in lambda must be final.
     * But there are some sneaky tricks like arrays and atomics */
    public void useLocalVariables() {

        final int[] localFirst = {7};
        AtomicInteger localSecond = new AtomicInteger(8);

        Changeable local = () -> {
            localFirst[0] = 33;
            localSecond.set(44);
        };

        System.out.println(String.format("Before local variables changing: %s and %s", localFirst[0], localSecond));
        local.changeValue();
        System.out.println(String.format("After local variables changing: %s and %s", localFirst[0], localSecond));
    }

}
