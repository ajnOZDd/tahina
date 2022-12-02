package element;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connect.Connect;

public class Generalisation {
    PreparedStatement statement ;
    ResultSet set ;
    String maka ;
    Connect co  ;
    public Object [] insertion (String nomTable ,Object[]requette){
    maka="";
     for ( int i =0 ; i<requette.length-1; i++){
        maka= maka+""+requette[i]+"," ;
     }
     maka= maka+requette[requette.length-1] ;
     co= new Connect() ;
     try {
     co.co() ;
     String value = "insert into "+nomTable+" values (getSeq(),"+maka+")";
     statement = co.co().prepareStatement(value);
     System.out.print(value+"/n");
     set= statement.executeQuery();
     co.co().close(); 
     } catch (SQLException e) {
        e.printStackTrace();
     }
     
     return requette ;
    }
    public void insertStepbyStep (String Table ,Object [] param1) {
    
      try {
          co= new Connect();
          co.co();
          
          for (int i = 0 ; i<param1.length ; i++){
              statement = co.co().prepareStatement("insert into "+Table+" values (getseq(),"+param1[i]+")") ;
              set = statement.executeQuery();
          }
          co.co().close();
      } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
      
      }
    public Object [] select (String nomTable ,Object[]requette){
        for ( int i =0 ; i<requette.length-1; i++){
           maka= maka+requette[i]+"," ;
        }
        maka= maka+requette[requette.length-1] ;
        co= new Connect() ;
        try {
        co.co() ;
        String value = "select "+maka+"from"+nomTable+" ";
        statement = co.co().prepareStatement(value);
        System.out.print(value);
        co.co().close(); 
        } catch (SQLException e) {
           e.printStackTrace();
        }
        
        return requette ;
    }
}
