package affichage ;

import javax.swing.*;
import javax.swing.event.*;
import element.Parametre;
import element.Listener;
import element.ListenerMouse;
import element.Point;

import java.awt.* ;
import java.awt.event.* ;
import java.sql.SQLException;

public class Affichage extends JFrame {
    Listener KeyListener;
    ListenerMouse event ;
    Parametre k ;
    Point point  ;
    JLabel lab ;
    Affichage () {
    //toutes les classes appelle
    k = new Parametre();
    KeyListener=new Listener(k);
    event= new ListenerMouse(k, KeyListener);
    point = new Point() ;
    lab = new JLabel("match");
    //toutes les fonctions
    k.bt(this, event);
    //reglage fenetre
    this.setLayout(new BorderLayout());
    this.setVisible(true);
    this.setSize(500 , 500);
    this.addKeyListener(KeyListener);
    this.addMouseListener(event);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setFocusable(true);
    this.add(lab, BorderLayout.NORTH);

    }

    public static void main (String[] args){
     Affichage afficher = new Affichage() ;
    }
}