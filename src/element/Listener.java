package element;
import java.awt.event.* ;
import java.util.Random;

import connect.Connect;

public class Listener implements KeyListener {
    Button b ;
    int count ;
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
    
    public Listener(Button but, ListenerMouse mi){
    b=but ;
    m=mi;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       if (e.getKeyChar()=='b'){
        count+=1 ;
       }
       if (e.getKeyChar()=='t'){
           try {
            System.out.println("tirer"+getNameJoueurtirer());
            System.out.println(chanceTir[rand.nextInt(chanceTir.length)]);
            prevision = chanceTir[rand.nextInt(chanceTir.length)];
            if (prevision=="marque"){
            gen= new Generalisation();
            
            gen.insert(nameJoueurtirer, chanceTir);
            }
           
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
