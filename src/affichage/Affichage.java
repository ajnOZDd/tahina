package affichage ;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.event.*;
import element.Button;
import element.Listener;
import element.ListenerMouse;
import element.Point;

import java.awt.* ;
import java.awt.event.* ;

public class Affichage extends JFrame {
    Listener KeyListener;
    ListenerMouse event ;
    Button k ;
    Point point  ;
   
    Affichage (){
    //toutes les classes appelle
    k = new Button();
    KeyListener=new Listener(k, event);
    event= new ListenerMouse(k, KeyListener);
    point = new Point() ;
    //toutes les fonctions
    k.bt(this, event);
    point.pointEquipeGagnant(KeyListener);
    //reglage fenetre
    this.setLayout(null);
    this.setVisible(true);
    this.setSize(500 , 500);
    this.addKeyListener(KeyListener);
    this.addMouseListener(event);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setFocusable(true);

    }

    public static void main (String[] args){
     Affichage afficher = new Affichage() ;
    }
}