package bank.management.system;

import java.sql.*;

public class con {

    Connection connection;

    Statement statement;

    public con(){
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Meharban@7500");
            statement=connection.createStatement();

        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
