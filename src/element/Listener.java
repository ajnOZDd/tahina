package element;
import java.awt.event.* ;

public class Listener implements KeyListener {
    Button b ;
    int count ;
    int countJoueur ;
    ListenerMouse m ;
    String [] chanceTir ={"marque", "rebondir"}; 
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
        for (int i = 0 ; i<b.buttons.size();i++){
            countJoueur = i ;
        }
        System.out.println("tir du joueur :"+" "+ countJoueur);
       }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
       
        
    }

    
}
