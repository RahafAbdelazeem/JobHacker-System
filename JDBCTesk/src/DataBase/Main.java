package Task1;

import java.sql.*;
class sqlconnction {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/computercompany", "root", "Pass@word1");
            Statement statement1 = connect.createStatement();
            ResultSet result = statement1.executeQuery("SELECT * FROM devices");
            while (result.next()) {
                System.out.println(result.getString("device ID") + " "
                        + result.getString("device Name")+ " "
                        + result.getString("device category")+ " "
                        +result.getString("device fees") );
            }

            connect.close();
        }catch ( Exception e ){ System.out.println(e);}
    }
}// write your code here
