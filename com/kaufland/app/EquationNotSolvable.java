
//############# Von Fabian Pohlink #############

package com.kaufland.app;

public class EquationNotSolvable extends Exception {
    public EquationNotSolvable() {
        super("Das LGS ist nicht mit der Cramerschen Regel lösbar");
    }
}
