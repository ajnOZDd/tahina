package element;
import java.awt.event.*;
public class ListenerMouse implements MouseListener{
    Listener list ;
    Button btn;
    public ListenerMouse(Button butt, Listener lister){
    btn=butt ;
    list=lister ;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
   
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        for (int i = 0 ; i<btn.buttons.size() ; i++){
        if (e.getSource()==btn.buttons.get(i) ){
          if (list.count==1 && e.getSource()==btn.equipe1){
            System.out.println("passe"+" "+btn.buttons.get(i).getText());
          }else{
            System.out.println("attente de"+" "+btn.buttons.get(i).getText());
            list.count=0 ;
          }
        }
        
    }
    }
    

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
