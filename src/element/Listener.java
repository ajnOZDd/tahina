package element;
import java.awt.event.* ;
import java.util.Random;

import connect.Connect;

public class Listener implements KeyListener {
    Parametre b ;
    int countN ;
    int countJoueur ;
    Point p ;
    Boolean confirmationMarquage=false ;
    Random rand = new Random() ;
    String nameJoueurtirer ;
    ListenerMouse m ;
    String [] chanceTir ={"marque", "rebondir"}; 
    String prevision ;
    Generalisation gen ;
    public String getPrevision() {
        return prevision;
    }
    public String getNameJoueurtirer() {
        return nameJoueurtirer;
    }
    public Boolean getConfirmationMarquage() {
        return confirmationMarquage;
    }
    
    public Listener(Parametre but){
    b=but ;
    
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       if (e.getKeyChar()=='b'){
        countN+=1 ;
       }
       if (e.getKeyChar()=='t'){
           try {
            System.out.print("tir");
            b.addGen(getNameJoueurtirer());
            System.out.println(chanceTir[rand.nextInt(chanceTir.length)]);
            prevision = chanceTir[rand.nextInt(chanceTir.length)];
            
           } catch (Exception e1) {
            System.out.println(e1);
           }
        }
       
    }
    

    public void pointGagner (){
        
    }
       
    

    @Override
    public void keyReleased(KeyEvent e) {
        
       
        
    }

    
}
