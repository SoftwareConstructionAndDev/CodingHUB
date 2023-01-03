package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Bussinesslogic.DataTransfer;

public class DataTransferDatabase {
	
	 static String Url="jdbc:mysql://localhost:3306/hamdan";
	    static String name="root";
	    static String passorrd="";
	   
	public void Send() {
		
		DataTransfer Db=new DataTransfer();
		
		ArrayList<?> DB=Db.XMl();	
		
		try {
			Connection con = DriverManager.getConnection(Url,name,passorrd);
	    	for(int i=0;i<DB.size();i=i+3) {
	    		try {
	    			
	    		
		        PreparedStatement st = con.prepareStatement("insert into pg values("+null+",'"+DB.get(i)+"','"+DB.get(i+1)+"','"+DB.get(i+2)+"')");
		        st.execute();
	    		
		         
	    		}
		        catch(SQLException e) {
		        	
			    }
	    	}
	    	
	    	con.close();
	    	System.out.println("Inserted");
	    }
	    catch(SQLException e) {
	    	System.out.println("Connection Exception"); 
	    }
	}
	public static void update_Word(String word1, String word2) throws SQLException {
		Connection connection = DriverManager.getConnection(Url,name,passorrd);
		Statement
        stmt = connection.createStatement();
        
        stmt.executeUpdate("update word set word='"+ word2 + "' where word like'" + word1 + "'");
        System.out.println(word2+" updated to "+word1);
		connection.close();
		
		
	}
	public ArrayList Send_Words(int c) {
		DataTransfer Db=new DataTransfer();
		
		
		ArrayList<String> Array1=Db.Words();
		ArrayList<Integer> Array2=Db.Frequency();
		
		
    	
    	try {
        	Connection con = DriverManager.getConnection(Url,name,passorrd);
        	
        	
        	if(c==1) {
        	
        		for(int i=0;i<Array1.size();i++) {
        			try {
        		
        		
        		
        		
    	        PreparedStatement st = con.prepareStatement("insert into word values("+null+",'"+Array1.get(i)+"',"+(int) Array2.get(i)+")");
    	        st.execute();
    	        
        		}

        			catch(SQLException e) {
        				
    			    }
        		}
        		
        	con.close();
        	                       System.out.println("Words Inserted");
        	            return null;           
        	                       
        	}  
        	//
        	
        	else if(c==2) {
        		ArrayList wordTable=new ArrayList();
        		String str = "SELECT * from word ORDER by FQ";
        		PreparedStatement ps = con.prepareStatement(str);
                
                ResultSet us = ps.executeQuery();
        	      
        	      while (us.next())
        	      {
        	    	 
        	    	 
        	        wordTable.add(us.getObject("FQ"));
        	        wordTable.add(us.getObject("word"));
        	        
        	        
        	      }
               
        	      con.close();
        	      return wordTable;
        	}
        	                       
        	                       
        }
        catch(SQLException e) {
        	System.out.println("connection Exception");
        }
		
    	
    	
		return null;
		
		
		
	}
	
	
	
	
}
