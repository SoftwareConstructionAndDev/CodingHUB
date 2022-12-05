package BussinessLogic;

import java.util.LinkedList;

import DatabaseAccess.Data_Insertor;

public class makeMutant {
	
	
	static LinkedList Key_List = new LinkedList();
	
	  static Data_Insertor D=new Data_Insertor();
        
	  
	  public void Controller() {
		  
		  Generate_Mutant();
			Insert();
	  }
	  
	
	
	public static void Mutant(String[] Arr1,String[] Arr2) {
		
		LinkedList W_L1 = new LinkedList();
		  W_L1=D.GetData();
			LinkedList K_L1 = new LinkedList();
			 K_L1=D.ReturnKey();
		
		int W=0;
		while(W<W_L1.size())
		{
		String st=(String) W_L1.get(W);
		String[] CH = st.split("(?!^)");
		int K=(int) K_L1.get(W);
		LinkedList word_list = new LinkedList();
		
		for(int i=0;i<CH.length;i++) {
			word_list.addLast(CH[i]);
		}
		int Ar=0;
		while(Ar<Arr1.length) {
			String Nw="";
			for(int c=0;c<word_list.size();c++) {
			if(word_list.get(c).equals(Arr1[Ar])) {
				for(int h=0;h<CH.length;h++) {
					if(h==c) {
						Nw+=Arr2[Ar];
					}
					else {
						Nw+=(String) word_list.get(h);
					
					}
				}
			}
		}
		
		    if(check(Nw)) {
		    	Word_List.addLast(Nw);
		    	Key_List.addLast(K);
			Nw="";
		    }
		    
		    Ar++;
			}
		W++;
	}
		
		
	}
	static LinkedList Word_List = new LinkedList();

	public LinkedList Mut() {
		
		return Word_List;
	}
	public LinkedList Key() {
		return Key_List;
	}
	public static boolean check(String Nw) {
		if(Nw.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public void Insert() {
		  
		  D.Insert();
	  }
public static void Generate_Mutant() {
		
		String[] Arr1 = new String[18];
		
		Arr1[0]=("س");   
		Arr1[1]=("ص");  
		Arr1[2]=("ظ");  
		Arr1[3]=("ض");  
		Arr1[4]="ا";   
		Arr1[5]=("ع");  
		Arr1[6]=("ڈ");  
		Arr1[7]=("ڑ");  
		Arr1[8]=("غ");  
		Arr1[9]=("گ");  
		Arr1[10]=("ت");  
		Arr1[11]=("ط");  
		Arr1[12]=("ک");  
		Arr1[13]=("ق");  
		Arr1[14]=("ح");   
		Arr1[15]=("ہ");  
		Arr1[16]=("ز");   
		Arr1[17]=("ذ");  
		
		String[] Arr2 = new String[18];
		
		Arr2[0]=("ص");
		Arr2[1]=("س");
		Arr2[2]=("ض");
		Arr2[3]=("ظ");
		Arr2[4]=("ع");
		Arr2[5]=("ا");
		Arr2[6]=("ڑ");
		Arr2[7]=("ڈ");
		Arr2[8]=("گ");
		Arr2[9]=("غ");
		Arr2[10]=("ط");
		Arr2[11]=("ت");
		Arr2[12]=("ق");
		Arr2[13]=("ک");
		Arr2[14]=("ہ");
		Arr2[15]=("ح");
		Arr2[16]=("ذ");
		Arr2[17]=("ز"); 
		
		Mutant(Arr1,Arr2);
		   
	}

}
