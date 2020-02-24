
package com.company;
import javax.swing.*;
import java.awt.*;

public class gameWindows extends JFrame{

    public JButton monBoutonFuséee;


    public gameWindows(String name, int width, int height) {
        super(name);
        setSize(width, height);
        setLocation(100, 0);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel monEtiquette = new JLabel("Crazy Rocket");
        monEtiquette.setLayout(null);
        monEtiquette.setSize(300,300);
        monEtiquette.setLocation(700,100);
        monEtiquette.setForeground(Color.red);
        monEtiquette.setLayout(null);

        monBoutonFuséee  = new JButton("Jouer avec une fusée");
        monBoutonFuséee.setLayout(null);
        monBoutonFuséee.setBounds(100,100,100,100);
        monBoutonFuséee.setForeground(Color.green);
        monBoutonFuséee.setBackground(Color.white);

        JTextField monChampsTexte = new JTextField("A éditer");
        monChampsTexte.setLayout(null);
        monChampsTexte.setBounds(120,110,150,40);
        monChampsTexte.setBackground(Color.white);



        JPanel monConteneur = new JPanel();
        monConteneur.setLayout(null);
        monConteneur.add(monBoutonFuséee);
        monConteneur.add(monEtiquette);
        monConteneur.add(monChampsTexte);
        monConteneur.setBounds(10,10,getWidth(),getHeight());
        monConteneur.setBackground(Color.black);

        add(monConteneur);

    }
}