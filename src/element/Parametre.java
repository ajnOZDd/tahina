package element;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import affichage.Affichage;
import connect.Connect;

public class Parametre  {
    String [][] nomJoueurEquipe1 = {{"j1", "j2", "j3","J4"},{"chelsea"}} ;
    String [][]nomJoueurEquipe2 = {{"JoueurEnemy1", "JoueurEnemy2", "JoueurEnemy3", "JoueurEnemy4"},{"bull"}} ;
    Generalisation gen ;
    String maka ;
    JButton [] equipe1 = new JButton[nomJoueurEquipe1[0].length] ;
    JButton [] equipe2 =new JButton[nomJoueurEquipe2[0].length];
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    ArrayList<String> nomList = new ArrayList<String>();
    String noJoueur  ;
    String nomEquipe ;
    int PointGagnant ;
     public void  bt (Affichage f , ListenerMouse m){
     int deplacementX = 100 ;
     
     for (int i = 0 ; i<equipe1.length ; i++){
     equipe1[i]= new JButton(nomJoueurEquipe1[0][i]);
     equipe1[i].setBounds(deplacementX, 120, 50, 15);
     equipe2[i] = new JButton(nomJoueurEquipe2[0][i]);
     equipe2[i].setBounds(deplacementX, 150, 50, 15);
     deplacementX+=75 ;
     //add equipe in frame
     f.add(equipe1[i]);
     f.add(equipe2[i]);
     //maka anarenle equipe
     //parametreEquipe
     equipe1[i].addMouseListener(m);
     equipe2[i].addMouseListener(m);
     equipe1[i].setFocusable(false);
     equipe2[i].setFocusable(false);
     //add JButton in arraylist
     buttons.add(equipe1[i]);
     buttons.add(equipe2[i]);
     nomList.add(nomJoueurEquipe1[1][0]);
     nomList.add(nomJoueurEquipe2[1][0]);
     /*insert equipe
        gen= new Generalisation();
        Object [] p = {"'"+nomList.get(0)+"'",nomJoueurEquipe1[0].length , "'"+nomJoueurEquipe1[0][i]+"'"};
        gen.insertion("equipe", p);
    */
    /* 
    gen= new Generalisation();
    Object [] p = {"'"+nomList.get(1)+"'",nomJoueurEquipe2[0].length , "'"+nomJoueurEquipe2[0][i]+"'"};
    gen.insertion("equipe", p);
    */
     }
     
    } 
    public void addGen (String maka){
        for (int i = 0 ; i<buttons.size() ;i++){
            if (maka==buttons.get(i).getText()){
            noJoueur =" "+buttons.get(i).getText()+" ";
            nomEquipe =nomList.get(i)  ;
            System.out.println("le joueur"+noJoueur+"tir");
            System.out.println("le joueur etait dans l'equipe"+nomEquipe);

            }
        }
    }

    public void marque (Listener l){
        if(l.getPrevision()=="marque"){
        PointGagnant+=2 ;

        }else{

        }
    }


  
}
