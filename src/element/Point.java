package element;

public class Point  {
    int pointEquipeGagnant ;
    int pointEquipePerdant ;
    String joueurMarquer ;
    public Point() {
        
    }
     
     
    public int pointEquipeGagnant(Listener l){
        if (l.getConfirmationMarquage()==true){
             for (int i = 0 ; i<l.b.nomButtonEquipe1.length ;i++){
            if (l.getNameJoueurtirer()==l.b.nomButtonEquipe1[i] || l.getNameJoueurtirer()==l.b.nomButtonEquipe2[i]){
                joueurMarquer =l.getNameJoueurtirer();
            }
        }
        System.out.println("joueur"+joueurMarquer);
        pointEquipeGagnant+=1 ;
        }
       

    return pointEquipeGagnant ;
    }
    
    public int pointEquipePerdant (){
    return pointEquipePerdant ;
    }


}
