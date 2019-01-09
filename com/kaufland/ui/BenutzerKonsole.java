package com.kaufland.ui;

import com.kaufland.app.EquationNotSolvable;
import com.kaufland.app.Matrix;
import com.kaufland.app.Rechner;
import com.kaufland.app.Vektor;

import java.util.Scanner;

public class BenutzerKonsole {

    public BenutzerKonsole () {
        eingabe();
    }

    private void eingabe() {
        System.out.print("Anzahl Variablen: ");

        Scanner scanner = new Scanner(System.in);
        String sizeAbfrage =  scanner.next();

        try {
            int size = Integer.parseInt(sizeAbfrage);

            Matrix koeffMatrix = new Matrix(scanner.nextInt());
            Vektor ergebnisV = new Vektor(koeffMatrix.getSize());

            for (int zeile = 0; zeile < koeffMatrix.getSize(); zeile++) {
                System.out.print(zeile + 1 + ": ");
                for (int spalte = 0; spalte < koeffMatrix.getSize(); spalte++) {
                    System.out.print("x" + (spalte + 1) + "*");
                    koeffMatrix.setCell(scanner.nextDouble(), zeile, spalte);
                    if (spalte < koeffMatrix.getSize() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.print(" = ");
                ergebnisV.setCell(scanner.nextDouble(), zeile);
            }

            try {
                System.out.println(new Rechner().lgsLoesen(koeffMatrix, ergebnisV).toString());
            }
            catch (EquationNotSolvable e) {
                System.out.println("Es ist ein Fehler aufgetreten: " + e);
            }
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
}
