
//############# Von Fabian Pohlink #############

package main.app;

import java.io.IOException;

public interface IRechner {
    public double determinante(Matrix pMatrix);
    public Matrix konvZuObererDreiecksMatrix(Matrix pMatrix);
    public Vektor lgsLoesen(Matrix pKoeffMatrix, Vektor ergebnisVe) throws IOException, EquationNotSolvable;
}