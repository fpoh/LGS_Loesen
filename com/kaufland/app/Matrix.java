
//############# Von Fabian Pohlink #############



package com.kaufland.app;

public class Matrix implements IMatrix {
    private Vektor[] matrix;
    //private double[][] matrix;
    private int size;

    public Matrix (int pSize) {
        matrix = new Vektor[pSize];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new Vektor(pSize);
        }

        size = pSize;
    }

    public boolean setCell(double pWert, int pZeile, int pSpalte) {

        if (pZeile >= size || pSpalte >= size || pZeile < 0 || pSpalte < 0) {
            return false;
        }

        matrix[pSpalte].setCell(pWert, pZeile);

        return true;
    }

    public double getCell(int pZeile, int pSpalte) {
        return matrix[pSpalte].getCell(pZeile);
    }

    public String toString() {
        String ausgabe = "";

        for (int zeile = 0; zeile < size; zeile++) {
            for (int spalte = 0; spalte < size; spalte++) {
                ausgabe = ausgabe + matrix[spalte].getCell(zeile) + "    ";
            }
            ausgabe = ausgabe + "\n";
        }

        return ausgabe;
    }

    public int getSize() {
        return size;
    }
}
