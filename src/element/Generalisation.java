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
    public Object [] insert (String nomTable ,Object[]requette){
     for ( int i =0 ; i<requette.length-1; i++){
        maka= maka+requette[i]+"," ;
     }
     maka= maka+requette[requette.length-1] ;
     co= new Connect() ;
     try {
     co.co() ;
     String value = "insert into "+nomTable+" values (getSeq(),"+maka+")";
     statement = co.co().prepareStatement(value);
     System.out.print(value);
     set= statement.executeQuery();
     co.co().close(); 
     } catch (SQLException e) {
        e.printStackTrace();
     }
     
     return requette ;
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
