package task2;

import java.sql.*;

public class batchupdating {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connector= DriverManager.getConnection("jdbc:mysql://localhost:3306/mycompany", "root", "Pass@word1");
            Statement statm= connector.createStatement();
           statm.executeUpdate("UPDATE  employee SET vacationbalnce= 45 WHERE   Age >45");
           statm.executeUpdate("UPDATE  employee SET fname=CONCAT (CASE WHEN SEX ='Male' then 'Mr.' ELSE  'Mrs.' END ,fname )");

             connector.close();
          } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}