package excel.ataskaitos.database;

import java.io.FileOutputStream;
//STEP 1. Import required packages
import java.sql.*;
import org.postgresql.*;
import org.apache.*;
import org.apache.poi.hssf.usermodel.*;



import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class App {
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "org.postgresql.Driver";  
 static final String DB_URL = "jdbc:postgresql://localhost/dvdrental";

 //  Database credentials
 static final String USER = "postgres";
 static final String PASS = "postgres";
 
 public static void main(String[] args) throws IOException {
	/*
	 select * from 
	 actor;
	 select count (actor_id) from actor;
	*/ 
	 
	 
         
         try (HSSFWorkbook wb = new HSSFWorkbook()) {
             HSSFSheet sheet = wb.createSheet("new sheet");
             
             HSSFSheet sheet1 = wb.createSheet("new sheet1");
             
             // Create a row and put some cells in it. Rows are 0 based.
             HSSFRow row = sheet.createRow(0);
             HSSFRow row1 = sheet.createRow(1);
             // Create a cell and put a value in it.
             HSSFCell cell = row.createCell(0);
             cell.setCellValue(1);

             // Or do it on one line.
             row.createCell(1).setCellValue(1.2);
             row.createCell(2).setCellValue("This is a string");
             row.createCell(3).setCellValue(true);
             
             row1.createCell(0).setCellValue(122);

             // Write the output to a file
             try (FileOutputStream fileOut = new FileOutputStream("/Users/bogdansemilit/Documents/homeworkbook.xls")) {
                 wb.write(fileOut);
         
             }}
	 
  

         //   try (FileOutputStream fileOut = new FileOutputStream("/Users/bogdansemilit/Documents/homeworkbook.xls")) {

        	

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 
 Connection conn = null;
 Statement stmt = null;
 try{
    //STEP 2: Register JDBC driver
    Class.forName(JDBC_DRIVER);

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    stmt = conn.createStatement();
    String sql;
    sql = "select customer_id from customer";
    ResultSet rs = stmt.executeQuery(sql);

    //STEP 5: Extract data from result set
    while(rs.next()){
     
    	
    	//Retrieve by column name
    
    	
    	int id  = rs.getInt("customer_id");
      /* int age = rs.getInt("age");
       String first = rs.getString("first");
       String last = rs.getString("last");
    */	
       //Display values
       System.out.print("ID: " + id +"        ");
  /*     System.out.print(", Age: " + age);
       System.out.print(", First: " + first);
       System.out.println(", Last: " + last);  
    */
    
    }
    //STEP 6: Clean-up environment
    rs.close();
    stmt.close();
    conn.close();
 }catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
    try{
       if(stmt!=null)
          stmt.close();
    }catch(SQLException se2){
    }// nothing we can do
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
 System.out.println("Goodbye!");
}//end main
}
         
         //end FirstExample