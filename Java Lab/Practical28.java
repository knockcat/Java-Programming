// 28. Write a Java program that interacts with database. It enables to-
// (a) Inserts the student name and roll number to database.
// (b) Fetch records from table 
// (c) Modify the records
// (d) Delete the records

import java.sql.*;

class JDBCTest{

 public static void main(String args[])
 {
  Connection con=null;
  try{
   Class.forName("com.mysql.jdbc.Driver");
   System.out.println("Success");
  }
  catch (Exception e)
  {
   System.out.println(e);
  }
  
  try{
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/knockcat?autoReconnect=true&useSSL=false", "root","gehu");
   System.out.println("connection extablished"); 
  }
  
  catch(Exception e)
  {
    System.out.println("Connection Not established");
  }
  
  try{
   Statement st = con.createStatement();
   st.executeUpdate("insert into emp (id, name)values(15,'KNOCKCAT')");
   st.executeUpdate("insert into emp (id, name)values(10,'VISHAL')");
  }
  catch(Exception e)
  {
   System.out.println("query not found");
  }
  
  try {
   Statement st = con.createStatement();
   // st.executeUpdate("insert into emp (id,name) values (5,'Vicky')");
   
   ResultSet rs = st.executeQuery("select * from emp");
   while(rs.next())
   {
    System.out.println(rs.getInt(1));
    System.out.println(rs.getString(2));
   }
  }
  catch(Exception e)
  {}
 
 }

}