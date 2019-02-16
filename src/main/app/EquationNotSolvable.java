
//############# Von Fabian Pohlink #############

package main.app;

public class EquationNotSolvable extends Exception {
    public EquationNotSolvable() {
        super("Das LGS ist nicht mit der Cramerschen Regel lösbar");
    }
}
