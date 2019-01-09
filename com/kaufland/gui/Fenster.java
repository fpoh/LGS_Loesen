
//############# Von Fabian Pohlink #############

package com.kaufland.gui;

import com.kaufland.app.EquationNotSolvable;
import com.kaufland.app.Matrix;
import com.kaufland.app.Rechner;
import com.kaufland.app.Vektor;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenster extends JFrame {

    private JPanel contentPane;
    private JTextField inp_x11;
    private JTextField inp_x12;
    private JTextField inp_x13;
    private JTextField inp_x21;
    private JTextField inp_x22;
    private JTextField inp_x23;
    private JLabel lblX_1;
    private JLabel lblX_2;
    private JLabel lblX_3;
    private JTextField inp_x31;
    private JTextField inp_x32;
    private JTextField inp_x33;
    private JLabel lblX_4;
    private JLabel lblX_5;
    private JLabel lblX_6;
    private JTextField inp_e1;
    private JTextField inp_e2;
    private JTextField inp_e3;
    private JLabel lblErgebnis;
    private JTextField e1;
    private JTextField e2;
    private JTextField e3;
    private JLabel lblX_7;
    private JLabel lblX_8;
    private JLabel lblX_9;


    public Fenster() {
        setResizable(false);
        setTitle("Cramersche Regel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 448, 265);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblGleichung = new JLabel("Gleichung 1:");
        lblGleichung.setBounds(10, 14, 73, 14);
        contentPane.add(lblGleichung);

        JLabel lblGleichung_1 = new JLabel("Gleichung 2:");
        lblGleichung_1.setBounds(10, 45, 73, 14);
        contentPane.add(lblGleichung_1);

        JLabel lblGleichung_2 = new JLabel("Gleichung 3:");
        lblGleichung_2.setBounds(10, 76, 73, 14);
        contentPane.add(lblGleichung_2);

        inp_x11 = new JTextField();
        inp_x11.setBounds(93, 14, 44, 20);
        contentPane.add(inp_x11);
        inp_x11.setColumns(10);

        inp_x12 = new JTextField();
        inp_x12.setColumns(10);
        inp_x12.setBounds(93, 45, 44, 20);
        contentPane.add(inp_x12);

        inp_x13 = new JTextField();
        inp_x13.setColumns(10);
        inp_x13.setBounds(93, 76, 44, 20);
        contentPane.add(inp_x13);

        JLabel lblX = new JLabel("* X1 +");
        lblX.setBounds(147, 14, 46, 14);
        contentPane.add(lblX);

        JLabel label = new JLabel("* X1 +");
        label.setBounds(147, 45, 46, 14);
        contentPane.add(label);

        JLabel label_1 = new JLabel("* X1 +");
        label_1.setBounds(147, 76, 46, 14);
        contentPane.add(label_1);

        inp_x21 = new JTextField();
        inp_x21.setColumns(10);
        inp_x21.setBounds(190, 14, 44, 20);
        contentPane.add(inp_x21);

        inp_x22 = new JTextField();
        inp_x22.setColumns(10);
        inp_x22.setBounds(190, 45, 44, 20);
        contentPane.add(inp_x22);

        inp_x23 = new JTextField();
        inp_x23.setColumns(10);
        inp_x23.setBounds(190, 76, 44, 20);
        contentPane.add(inp_x23);

        lblX_1 = new JLabel("* X2 +");
        lblX_1.setBounds(244, 14, 46, 14);
        contentPane.add(lblX_1);

        lblX_2 = new JLabel("* X2 +");
        lblX_2.setBounds(244, 45, 46, 14);
        contentPane.add(lblX_2);

        lblX_3 = new JLabel("* X2 +");
        lblX_3.setBounds(244, 76, 46, 14);
        contentPane.add(lblX_3);

        inp_x31 = new JTextField();
        inp_x31.setColumns(10);
        inp_x31.setBounds(288, 14, 44, 20);
        contentPane.add(inp_x31);

        inp_x32 = new JTextField();
        inp_x32.setColumns(10);
        inp_x32.setBounds(288, 45, 44, 20);
        contentPane.add(inp_x32);

        inp_x33 = new JTextField();
        inp_x33.setColumns(10);
        inp_x33.setBounds(288, 76, 44, 20);
        contentPane.add(inp_x33);

        lblX_4 = new JLabel("* X3 =");
        lblX_4.setBounds(342, 14, 46, 14);
        contentPane.add(lblX_4);

        lblX_5 = new JLabel("* X3 =");
        lblX_5.setBounds(342, 45, 46, 14);
        contentPane.add(lblX_5);

        lblX_6 = new JLabel("* X3 =");
        lblX_6.setBounds(342, 76, 46, 14);
        contentPane.add(lblX_6);

        inp_e1 = new JTextField();
        inp_e1.setColumns(10);
        inp_e1.setBounds(385, 14, 44, 20);
        contentPane.add(inp_e1);

        inp_e2 = new JTextField();
        inp_e2.setColumns(10);
        inp_e2.setBounds(385, 45, 44, 20);
        contentPane.add(inp_e2);

        inp_e3 = new JTextField();
        inp_e3.setColumns(10);
        inp_e3.setBounds(385, 76, 44, 20);
        contentPane.add(inp_e3);

        lblErgebnis = new JLabel("Ergebnis:");
        lblErgebnis.setBounds(10, 121, 91, 14);
        contentPane.add(lblErgebnis);

        e1 = new JTextField();
        e1.setEditable(false);
        e1.setColumns(10);
        e1.setBounds(113, 137, 44, 20);
        contentPane.add(e1);

        e2 = new JTextField();
        e2.setEditable(false);
        e2.setColumns(10);
        e2.setBounds(113, 168, 44, 20);
        contentPane.add(e2);

        e3 = new JTextField();
        e3.setEditable(false);
        e3.setColumns(10);
        e3.setBounds(113, 199, 44, 20);
        contentPane.add(e3);

        lblX_7 = new JLabel("X1");
        lblX_7.setBounds(91, 143, 46, 14);
        contentPane.add(lblX_7);

        lblX_8 = new JLabel("X2");
        lblX_8.setBounds(91, 174, 46, 14);
        contentPane.add(lblX_8);

        lblX_9 = new JLabel("X3");
        lblX_9.setBounds(91, 205, 46, 14);
        contentPane.add(lblX_9);

        JButton btnBerechnen = new JButton("berechnen");
        btnBerechnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                    werteAbfragen();
                }
        });
        btnBerechnen.setBounds(325, 199, 104, 23);
        contentPane.add(btnBerechnen);
    }

    private void werteAbfragen () {
        Matrix matrix = new Matrix(3);
        Vektor vektor = new Vektor (3);

        try {
            matrix.setCell(Double.parseDouble(inp_x11.getText()), 0, 0);
            matrix.setCell(Double.parseDouble(inp_x21.getText()), 0, 1);
            matrix.setCell(Double.parseDouble(inp_x31.getText()), 0, 2);

            matrix.setCell(Double.parseDouble(inp_x12.getText()), 1, 0);
            matrix.setCell(Double.parseDouble(inp_x22.getText()), 1, 1);
            matrix.setCell(Double.parseDouble(inp_x32.getText()), 1, 2);

            matrix.setCell(Double.parseDouble(inp_x13.getText()), 2, 0);
            matrix.setCell(Double.parseDouble(inp_x23.getText()), 2, 1);
            matrix.setCell(Double.parseDouble(inp_x33.getText()), 2, 2);

            vektor.setCell(Double.parseDouble(inp_e1.getText()), 0);
            vektor.setCell(Double.parseDouble(inp_e2.getText()), 1);
            vektor.setCell(Double.parseDouble(inp_e3.getText()), 2);

            try {
                Vektor ergebnis = new Rechner().lgsLoesen(matrix, vektor);
                ergebnisAnzeigen(ergebnis);
            }
            catch (EquationNotSolvable e) {
                JOptionPane.showMessageDialog(this, "Nicht lösbar! " + e);
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Fehler! Bitte überprüfen sie ihre Eingabe. " + e);
        }

    }

    private void ergebnisAnzeigen(Vektor pErgebnis) {
        e1.setText(pErgebnis.getCell(0) + "");
        e2.setText(pErgebnis.getCell(1) + "");
        e3.setText(pErgebnis.getCell(2) + "");
    }
}
