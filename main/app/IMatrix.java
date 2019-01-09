

//############# Von Fabian Pohlink #############

package main.app;

public interface IMatrix {
    public boolean setCell(double pWert, int pZeile, int pSpalte);
    public double getCell(int pZeile, int pSpalte);
    public String toString();
    public int getSize();
}
