package affichage ;

import javax.swing.*;
import javax.swing.event.*;
import element.Button;
import element.Listener;
import element.ListenerMouse;
import element.Point;

import java.awt.* ;
import java.awt.event.* ;
import java.sql.SQLException;

public class Affichage extends JFrame {
    Listener KeyListener;
    ListenerMouse event ;
    Button k ;
    Point point  ;
   JLabel lab ;
    Affichage () {
    //toutes les classes appelle
    k = new Button();
    KeyListener=new Listener(k, event);
    event= new ListenerMouse(k, KeyListener);
    point = new Point() ;
    lab = new JLabel("match");
    //toutes les fonctions
    k.bt(this, event);
    k.addGen();
    point.pointEquipeGagnant(KeyListener);
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