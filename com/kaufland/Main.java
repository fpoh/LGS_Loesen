//############# Von Fabian Pohlink #############

package com.kaufland;

import com.kaufland.gui.Fenster;
import com.kaufland.ui.BenutzerKonsole;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //new BenutzerKonsole();

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Fenster frame = new Fenster();
                    frame.setVisible(true);
                } catch (Exception e) {
                   e.printStackTrace();
                }
            }
        });
    }
}
