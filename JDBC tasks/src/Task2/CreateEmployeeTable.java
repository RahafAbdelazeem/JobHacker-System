package Task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 class CreateEmployeeTable {
     public static void main(String[] args){
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/mycompany", "root", "Pass@word1");
             Statement statement= connection.createStatement();
             statement.execute("Create  TABLE  employee(ID INT ,Fname varchar (255), Lname varchar(255),Sex varchar (255),  Age INT , Address varchar(255),phonenumber varchar(255),  vacationbalnce  varchar (255))");
              statement.execute("INSERT  INTO employee VALUES (1,'Ahmed', 'Maged','Male',50,'123 MainStreet',260-569-3245,30)");
              statement.execute("INSERT  INTO employee VALUES (2,'Morad', 'Ali','Male',48,'145 elr street',261-5678-3269,30)");
              statement.execute("INSERT  INTO employee VALUES (3,'Malika', 'Emad','Female',47,'178 okr street',262-5426-3219,20)");
              statement.execute("INSERT  INTO employee VALUES (4,'Mai', 'Ali','Female',20,'145 elr street',242-5789-3156,10)");
              statement.execute("INSERT  INTO employee VALUES (5,'mariam', 'Ameged','Female',22,'156 Mainstreet',360-1468-3594,23)");

              connection.close();

         } catch (SQLException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
     }
}
