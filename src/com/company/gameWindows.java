
package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;


public class gameWindows extends JFrame implements KeyListener, ActionListener {

    public JButton monBoutonFuséee;
    public JTextField monChampsTexte;
    public JLabel monEtiquette;
    public JLabel myRocket;
    public JLabel myM;
    public JPanel myLitleRocket;
    public JPanel monConteneur;
    public JPanel myMe;
    int timerMeteorite = 0;



    public gameWindows(String name, int width, int height) {
        super(name);
        setSize(width, height);
        setLocation(100, 0);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //création de la fusée
        Fusee BFR = new Fusee();

        monEtiquette = new JLabel("Crazy Rocket");
        monEtiquette.setLayout(null);
        monEtiquette.setSize(300,100);
        monEtiquette.setLocation(700,100);
        monEtiquette.setForeground(Color.red);
        monEtiquette.setLayout(null);

        monBoutonFuséee  = new JButton("Jouer avec une fusée");
        monBoutonFuséee.setLayout(null);
        monBoutonFuséee.setBounds(100,100,100,100);
        monBoutonFuséee.setForeground(Color.green);
        monBoutonFuséee.setBackground(Color.white);

        monChampsTexte = new JTextField("A éditer");
        monChampsTexte.setLayout(null);
        monChampsTexte.setBounds(120,110,150,40);
        monChampsTexte.setBackground(Color.white);

        //fuse dans l'écran test deplacement
        myRocket = new JLabel();
        myRocket.setSize(35,100);
        myRocket.setLocation(0,0);
        myRocket.setLayout(null);

        myLitleRocket = new JPanel();
        myLitleRocket.setBounds(BFR.fPos.getpX(), BFR.fPos.getpY(), 35, 100);
        myLitleRocket.setBackground(Color.red);
        myLitleRocket.add(myRocket);
        // fin de fusée

        // météorite provisoir pour tester

        Timer mtime = new Timer(500, this);
        mtime.start();
        myM = new JLabel();
        myM.setSize(35,100);
        myM.setLocation(0,0);
        myM.setLayout(null);

        myMe = new JPanel();
        myMe.setBounds(200, 0, 35, 100);
        myMe.setBackground(Color.green);
        myMe.add(myM);
        //fin météorite


        monConteneur = new JPanel();
        monConteneur.setBounds(10,10,getWidth(),getHeight());
        monConteneur.setBackground(Color.black);
        monConteneur.add(myLitleRocket);
        monConteneur.add(monBoutonFuséee);
        monConteneur.add(monEtiquette);
        monConteneur.add(monChampsTexte);
        monConteneur.add(myMe);
        monConteneur.setLayout(null);

        add(monConteneur);

        // récupère l'info de la touche
        addKeyListener(this);
        }





    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == keyEvent.VK_LEFT) {
            int nX = myLitleRocket.getX() - 10;
            int nY = myLitleRocket.getY();
            myLitleRocket.setLocation(nX, nY);
        }

        if (keyEvent.getKeyCode() == keyEvent.VK_RIGHT) {
            int nX = myLitleRocket.getX() + 10;
            int nY = myLitleRocket.getY();
            myLitleRocket.setLocation(nX, nY);
        }

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {}

    @Override
    public void keyReleased(KeyEvent keyEvent) {}

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        timerMeteorite++;
        int nX = myMe.getX();
        int nY = myMe.getY() + 10;
        myMe.setLocation(nX, nY);

    }
}