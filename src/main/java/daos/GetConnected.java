package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnected {

    public static final String URL = "jdbc:mysql://localhost:3306/veggies";
    public static final String USER = "test";
    public static final String PASS = "test";

    public static Connection getConnected(){
        try{
            DriverManager.getConnection(URL,USER,PASS);
            return DriverManager.getConnection(URL,USER,PASS);
        } catch(SQLException sqle){
            throw new RuntimeException("Error connecting to database");
        }
    }
    public static void main(String[] args){
        Connection connection = GetConnected.getConnected();
    }
}
