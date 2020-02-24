
package com.company;
import javax.swing.*;
import java.awt.*;

public class gameWindows extends JFrame{
    public gameWindows(String name, int width, int height) {
        super(name);
        setSize(width, height);
        setLocation(100, 0);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel monEtiquette = new JLabel("Voici 1 JLabel");
        monEtiquette.setLayout(null);
        monEtiquette.setSize(100,100); monEtiquette.setLocation(400,500);
        monEtiquette.setForeground(Color.green);
        monEtiquette.setLayout(null);

        JButton monBouton = new JButton("Voici 1 JButton");
        monBouton.setLayout(null);
        monBouton.setBounds(100,100,100,100);
        monBouton.setForeground(Color.green);
        monBouton.setBackground(Color.white);

        JTextField monChampsTexte = new JTextField("A éditer");
        monChampsTexte.setLayout(null);
        monChampsTexte.setBounds(120,110,150,40);
        monChampsTexte.setBackground(Color.white);



        JPanel monConteneur = new JPanel();
        monConteneur.setLayout(null);
        monConteneur.add(monBouton);
        monConteneur.add(monEtiquette);
        monConteneur.add(monChampsTexte);
        monConteneur.setBounds(10,10,getWidth(),getHeight());
        monConteneur.setBackground(Color.black);

        add(monConteneur);

    }
}