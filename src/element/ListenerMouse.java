package element;
import java.awt.event.*;
public class ListenerMouse implements MouseListener{
    Listener list ;
    Parametre btn;
    Generalisation gen ;
    int CountAlternationPasse=(-1);
    int nombrePasse ;
    String joueurPasseBefore ;
    String joueurPasseActual ;
    int countNombrePasse ;
    String nameJoueurtirer ;

    public ListenerMouse(Parametre butt, Listener lister){
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
          if (e.getSource()==btn.buttons.get(i)){
          if (list.countN==1 ){
            CountAlternationPasse+=1;
            if (CountAlternationPasse==0){
            System.out.println("Arbitre lance le Ballon");
            }
            if (CountAlternationPasse==1){
            System.out.println(btn.buttons.get(i).getText()+"recupere la balle");
            joueurPasseBefore=btn.buttons.get(i).getText() ;
            System.out.println(joueurPasseBefore);
            }
            if (CountAlternationPasse==2){
            System.out.println("passe"+btn.buttons.get(i).getText()+"");
            joueurPasseActual=btn.buttons.get(i).getText();
            System.out.println(joueurPasseActual);
            gen= new Generalisation();
            Object [] insertvalue ={"'"+joueurPasseActual+ "'", "'"+joueurPasseBefore+ "'"};
            gen.insertion("passe", insertvalue);
            CountAlternationPasse=0;
            }
            
            
            list.nameJoueurtirer=btn.buttons.get(i).getText();

          }else{
            System.out.println("attente de"+" "+btn.buttons.get(i).getText());
            list.countN=0 ;
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
