package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.JOptionPane;



import BussinessLogic.makeMutant;

public class Data_Insertor {
	
	LinkedList Key = new LinkedList();

public LinkedList GetData() {
		  
		
	    LinkedList word1 = new LinkedList();
		
		
		try {
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
	    	
	    	if (!con.isClosed())
	    	   {
	    		PreparedStatement ps = con.prepareStatement("SELECT * from word");
	          
	            ResultSet rs = ps.executeQuery();
	    	      
	    	      while (rs.next())
	    	      {
	    	    	 String arr;
	    	        arr=(String) rs.getObject("words");
	    	        Key.add((Integer)rs.getObject("word_id"));
	    	        word1.add(arr);
	    	        
	    	      }
	    	     
	    	      con.close();
	    	   }
	    	   else
	    	      System.out.println("System fail");
	    	}
	    catch(SQLException e) {
	    	System.out.println(e);
	    }
          return(word1);
	}

public void Insert() {
	makeMutant m1=new makeMutant();
	
	 LinkedList L1=new LinkedList();
	 LinkedList L2=new LinkedList();
	 L1=m1.Key();
	 L2=m1.Mut();
	  
try { 
	  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
	  for(int i=0;i<L2.size();i++) { 
		  
		  String Word=(String) L2.get(i);
		  int key=(int) L1.get(i);
		  
      PreparedStatement st = con.prepareStatement("insert into Mutants values("+null+",'"+Word+"',"+key+")");
      st.execute();
     
} 
	  con.close(); 
JOptionPane.showMessageDialog(null,"Mutants Inserted Succesfully into Database"); 
} 
catch(SQLException e) 
{ System.out.println(e); 
}
}
public LinkedList ReturnKey() {
	return Key;
}
}
