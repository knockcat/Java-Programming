// 28. Write a Java program that interacts with database. It enables to-
// (a) Inserts the student name and roll number to database.
// (b) Fetch records from table 
// (c) Modify the records
// (d) Delete the records


import java.sql.*;
import java.util.Scanner;

class JDBCTest{
  public static void main(String[] args)
  {
      try{
            Connection con = null;
            Scanner sc = new Scanner(System.in);

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","1234");
            System.out.println("Connection Established");


            int choice = 69;
            while(choice != 0)
            {
              System.out.println("1. input values");
              System.out.println("2. display table");
              System.out.println("3. update value");
              System.out.println("4. delete value");
              System.out.println("0 exit");

              System.out.println("Enter Your Choice : ");
              choice = sc.nextInt();

              int empId;
              String name;

              if(choice == 1)
              {
                System.out.println("Enter Roll number : ");
                empId = sc.nextInt();
                System.out.println("Enter Name : ");
                name = sc.next();

                PreparedStatement ps = con.prepareStatement("insert into student(empId, Name)values(?,?);");
                ps.setInt(1,empId);
                ps.setString(2,name);
                ps.executeUpdate();
                System.out.println("Deatails Added");
              }

              if(choice == 2)
              {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from student");
                while(rs.next())
                {
                  System.out.println(rs.getInt(1));
                  System.out.println(rs.getInt(2));
                }
              }

              if(choice == 3)
              {
                PreparedStatement ps1 = con.prepareStatement("update student set name = ? where empId = ?");
                System.out.print("Enter roll number : ");
                empId = sc.nextInt();
                System.out.print("Enter New Name : ");
                name = sc.next();
                
                ps1.setInt(1,empId);
                ps1.setString(2,name);
                ps1.executeUpdate();
                System.out.println("Details Updated");
              }

              if(choice == 4)
              {
                System.out.print("enter the roll number : ");
                empId = sc.nextInt();
                PreparedStatement ps2 = con.prepareStatement("delete from student where empId = ?");

                ps2.setInt(1,empId);
                ps2.executeUpdate();
                System.out.println("details Deleted");
              }
            }
          }
          catch(Exception e)
          {   
          System.out.println(e);
          }
      }
  }















// check data base connection

/*
import java.sql.*;

class JDBCTest{
  public static void main(String[] args)
  {
      Connection con = null;

      try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Success");
      }
      catch(Exception e)
      {
        System.out.println(e);
      }

      try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/knockcat?autoReconnct=true&useSSL=false","root","1234");
        System.out.println("Connection Established");
      }
      catch(Exception e)
      {
        System.out.println("Connection Not Establishted");
      }
      
      try{
        Statement st = con.createStatement();
        st.executeUpdate("insert into emp (id, name)values(15,'Knockcat')");
        st.executeUpdate("insert into emp(id,name) values(123,'vishu')");
      }
      catch(Exception e)
      {
        System.out.println("query not found");
      }

      try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from emp");
        while(rs.next())
        {
          System.out.println(rs.getInt(1));
          System.out.println(rs.getInt(2));
        }
        }
        catch(Exception e)
        {

        }
      }
  }
  */