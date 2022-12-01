package connect;
import java.sql.*;
public class Connect {
    String hostname = "jdbc:oracle:thin:@localhost:1521:orcl" ;
    String username = "scott" ;
    String password = "etherion" ;
    Connection con ;
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Connection getCon() {
        return con;
    }

    public Connection co (){
        try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection(this.getHostname(),this.getUsername(),this.getPassword());
        
        } catch (Exception e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return con ;
    }


}
