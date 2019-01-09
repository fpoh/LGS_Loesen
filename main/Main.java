package main;//############# Von Fabian Pohlink #############

import main.gui.Fenster;

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
