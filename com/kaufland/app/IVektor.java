

//############# Von Fabian Pohlink #############

package com.kaufland.app;

public interface IVektor {
    public boolean setCell (double pValue, int pZeile);
    public double getCell (int pZeile);
    public String toString ();
    public int getSize();
}
