
//############# Von Fabian Pohlink #############

package com.kaufland.app;

public class Rechner implements IRechner {

    public double determinante(Matrix pMatrix) {
        //NxN Matrix wird übergeben
        //Die Berechnen der Determinante funktioniert mit dieser Methode mit jeder NxN Matrix N>2


        Matrix newMatrix = konvZuObererDreiecksMatrix(pMatrix);
        //Matrix wird in eine obere DreiecksMatrix umgewandelt

        double det = 1;

        for (int i = 0; i < newMatrix.getSize(); i++) {
            det = det * newMatrix.getCell(i, i);
            //Das Produkt der oberen Dreiecksmatrix ist die Determinante
        }

        //Determinante der übergebenen Matrix wird zurück gegeben
        return det;
    }

    public Matrix konvZuObererDreiecksMatrix (Matrix pMatrix) {
        //NxN Matrix wird übergeben

        //pMatrix wird kopiert, damit die übergebene Matrix nicht verändert wird
        //und eine neue zurück gegeben wird

        Matrix matrix = new Matrix(pMatrix.getSize());

        for (int zeile = 0; zeile < matrix.getSize(); zeile++) {
            for (int spalte = 0; spalte < matrix.getSize(); spalte++) {
                matrix.setCell(pMatrix.getCell(zeile, spalte), zeile, spalte);
            }
        }

        //Ende des Kopiervorgangs


        //Nun Startet der eigentliche Vorgang
        //Die Matrix wird nun so umgeformt damit eine obere dreiecks matrix entsteht

        for (int i = 1; i < matrix.getSize(); i++) {
            double pivotElement = matrix.getCell(i - 1, i - 1);

            for (int zeile = i; zeile < matrix.getSize(); zeile++) {

                double multip;

                if (pivotElement == 0) {
                    multip = 0;
                }
                else {
                    multip = (0 - matrix.getCell(zeile, i - 1)) / pivotElement;
                }

                for (int spalte = i - 1; spalte < matrix.getSize(); spalte++) {
                    double newValue = matrix.getCell(zeile, spalte) + (matrix.getCell(i - 1, spalte) * multip);
                    matrix.setCell(newValue, zeile, spalte);
                }
            }
        }

        //Obere Dreiecksmatrix wird zurück gegeben
        return matrix;
    }

    public Vektor lgsLoesen(Matrix pKoeffMatrix, Vektor ergebnisVe) throws EquationNotSolvable { //Koeffizienten Matrix und Ergebnis Vektor wird übergeben
        double untereDet = determinante(pKoeffMatrix);

        if (untereDet != 0 && pKoeffMatrix.getSize() == ergebnisVe.getSize()) { //Bedingung damit die Cramersche Regel funktioniert
            Matrix aktMatrix;
            Vektor loesung = new Vektor(ergebnisVe.getSize());

            for (int i = 0; i < pKoeffMatrix.getSize(); i++) {
                aktMatrix = new Matrix(pKoeffMatrix.getSize());


                for (int spalte = 0; spalte < pKoeffMatrix.getSize(); spalte++) { //Es gibt soviele Lösungen wie die Anzahl der Spalten
                    //Nun wird die jeweilige Matrix erstellt für die jeweils obere Determinante einer Lösung
                    if (i == spalte) {
                        for (int zeile = 0; zeile < ergebnisVe.getSize(); zeile++) {
                            aktMatrix.setCell(ergebnisVe.getCell(zeile), zeile, spalte);
                        }
                    }
                    else {
                        for (int zeile = 0; zeile < pKoeffMatrix.getSize(); zeile++) {
                            aktMatrix.setCell(pKoeffMatrix.getCell(zeile, spalte), zeile, spalte);
                        }
                    }

                }
                loesung.setCell(determinante(aktMatrix) / untereDet, i);
            }
            return loesung; //Lösung wird als Vektor zurück gegeben
        }
        else {
            throw new EquationNotSolvable();
            //Wenn die untere Determinante 0 ist wird eine exception geworfen
        }
    }
}
