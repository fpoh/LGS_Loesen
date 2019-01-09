

//############# Von Fabian Pohlink #############


package main.app;

public class Vektor implements IVektor {

    private double[] vektor;
    private int size;

    public Vektor(int pSize) {
        vektor = new double[pSize];
        size = pSize;
    }

    public boolean setCell (double pValue, int pZeile) {

        if (pZeile < 0 || pZeile >= size) {
            return false;
        }

        vektor[pZeile] = pValue;

        return true;
    }

    public double getCell (int pZeile) {
        return vektor[pZeile];
    }

    public String toString () {
        String ausgabe = "";

        for (int i = 0; i < size; i++) {
            ausgabe = ausgabe + vektor[i] + "\n";
        }

        return ausgabe;
    }

    public int getSize() {
        return size;
    }
}
