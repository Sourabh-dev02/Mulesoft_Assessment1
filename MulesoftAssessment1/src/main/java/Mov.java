/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author msour
 */
import java.uti
package com.MulesoftAssessment1;
import java.sql.*;

public class Mov {
    public static int main(String[] args)
    {
        String url="jdbc:sqlite:/C:\\Users\\msour\\OneDrive\\Desktop\\NetBeansProjects\\MulesoftAssessment1\\TableMov.db";
        try
        {
            String sql="SELECT * FROM Movies";
             Connection connection = DriverManager.getConnection(url);
            Statement st= connection.createStatement();
            ResultSet r= st.executeQuery(sql);
            while(r.next())
            {
               String mo=r.getString("mov");
               String actor1=r.getString("actor");
               String actress1=r.getString("actress");
               Integer yr= r.getInt("yearOfRelease");
               String dr= r.getString("Director");
               System.out.println(mo+" "+actor1 +" "+actress1+" "+yr+" "+dr);
              
            }
            
        }
        catch(SQLException e) {
			System.out.println("Error conneting to SQLite database");
			e.printStackTrace();
		}
        
        return 0;
        
    }
    
}
