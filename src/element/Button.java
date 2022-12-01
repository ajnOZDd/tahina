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

public class Button  {
    JPanel Panel  ;
    String [] nomEquipe = {"chelsea", "leakears"};
    String [] nomButtonEquipe1 = {"j1", "j2", "j3","J4" } ;
    String [] nomButtonEquipe2 = {"JoueurEnemy1", "JoueurEnemy2", "JoueurEnemy3", "JoueurEnemy4"} ;
    String maka ;
    JButton [] equipe1 = new JButton[nomButtonEquipe1.length] ;
    JButton [] equipe2 =new JButton[nomButtonEquipe2.length];
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    Connect connect ;
     public void  bt (Affichage f , ListenerMouse m){
     int deplacementX = 100 ;
     for (int i = 0 ; i<equipe1.length ; i++){
     equipe1[i]= new JButton(nomButtonEquipe1[i]);
     equipe1[i].setBounds(deplacementX, 120, 50, 15);
     equipe2[i] = new JButton(nomButtonEquipe2[i]);
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
     }
     

    } 
    public void addGen () {
    
    try {
        connect= new Connect();
        connect.co();
        PreparedStatement statement ;
        ResultSet set;
        for (int i = 0 ; i<equipe1.length ; i++){
            statement = connect.co().prepareStatement("insert into equipe values (getseq(),'"+nomEquipe[1]+"',"+nomButtonEquipe1.length+",'"+nomButtonEquipe1[i]+"')") ;
            set = statement.executeQuery();
        }
        connect.co().close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    }

  
}
