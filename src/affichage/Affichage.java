package affichage ;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.event.*;
import element.Button;
import element.Listener;
import element.ListenerMouse;

import java.awt.* ;
import java.awt.event.* ;

public class Affichage extends JFrame {
    Listener KeyListener;
    ListenerMouse event ;
    Button k ;
    Affichage (){
    k = new Button();
    KeyListener=new Listener(k, event);
    event= new ListenerMouse(k, KeyListener);
    this.setLayout(null);
    k.bt(this, event);
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