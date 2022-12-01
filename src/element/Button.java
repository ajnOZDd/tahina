package element;
import java.awt.Dimension;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import affichage.Affichage;

public class Button  {
    JPanel Panel  ;
    String [] nomButtonEquipe1 = {"joueur1", "joueur2", "joueur3","Joueur4" } ;
    String [] nomButtonEquipe2 = {"JoueurEnemy1", "JoueurEnemy2", "JoueurEnemy3", "JoueurEnemy4"} ;
    JButton [] equipe1 = new JButton[nomButtonEquipe1.length] ;
    JButton [] equipe2 =new JButton[nomButtonEquipe2.length];
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    
   

     public void  bt (Affichage f , ListenerMouse m){
     System.out.println(nomButtonEquipe2.length);
     int deplacementX = 50 ;
     for (int i = 0 ; i<equipe1.length ; i++){
     Panel = new JPanel();
     equipe1[i]= new JButton(nomButtonEquipe1[i]);
     equipe1[i].setBounds(deplacementX, 120, 50, 15);
     equipe2[i] = new JButton(nomButtonEquipe2[i]);
     equipe2[i].setBounds(deplacementX, 150, 50, 15);
     deplacementX+=75 ;
     f.add(equipe1[i]);
     f.add(equipe2[i]);
     equipe1[i].addMouseListener(m);
     equipe2[i].addMouseListener(m);
     equipe1[i].setFocusable(false);
     equipe2[i].setFocusable(false);
     buttons.add(equipe1[i]);
     buttons.add(equipe2[i]);
     }
    


    } 

  
}
