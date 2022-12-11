package BussinessLogic;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import DatabaseAccess.Data_Insertor;

public class makeMutant {
	
	
	static LinkedList Key_List = new LinkedList();
	
	  static Data_Insertor D=new Data_Insertor();
        
	  
	  public void Controller() {
		  
		  allWordsMutants();
	  }
	  
	
	
	
public static String Generate_Mutant(String word) {
		
		String[] Arr1 = new String[28];
		
		//ا    آ
		//ب    بھ    پ    پھ    ت    تھ    ٹ    ٹھ    ث
		//ج    جھ    چ    چھ    ح    خ
		//د    دھ    ڈ    ڈھ    ذ    ر    رھ    ڑ    ڑھ    ز    ژ
		//س    ش    ص    ض    ط    ظ    ع    غ    ف    ق
		//ک    کھ    گ    گھ    ل    لھ    م    مھ
		//ن    نھ    ں    نھ    و    وھ    ہ    ۃ    ء    ی    یھ    ے	 
		
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
		Arr1[18] ="ب";
		Arr1[19] =("پ");
		Arr1[20]=(" ٹ");
		Arr1[21]=("د");
		Arr1[22]=("ن");
		Arr1[23]=("و");
		Arr1[24]=("ی");
		Arr1[25]=("ل");
		Arr1[26]=("چ");
		Arr1[27]=("ج");
		
		String[] Arr2 = new String[28];
		
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
		Arr2[18]=("بھ");
		Arr2[19]=("پھ");
		Arr2[20]=("ٹھ");
		Arr2[21]=("دھ");
		Arr2[22]=("نھ");
		Arr2[23]=("وھ");
		Arr2[24]=("یھ");
		Arr2[25]=("لھ");
		Arr2[26]=("چھ");
		Arr2[27]=("جھ");
		
		System.out.println("Word : "+ word);
		//Mutant(Arr1,Arr2);
		return generateMutant(word,Arr1,Arr2);
		   
	}

	private static int getIndex(char word, String []arr) {
		String ch = Character.toString(word);
		for(int i=0; i<arr.length; i++) {
			if(ch.equals(arr[i])) {
				return i;
			}
		}
		return -1;
	}
	public static String getReplaceable(String word,String []arr1) {
		String rep = "";
		char []alpha = word.toCharArray() ;
		for(int i=0; i<alpha.length; i++) {
			if(getIndex(alpha[i],arr1)!= -1) {
				rep+=alpha[i];
			}
		}
		return rep;
	}
	public static String generateMutant(String word,String []arr1, String []arr2) {
		String replaceable = getReplaceable (word,arr1);
		String result="";
		int index=0;
		 int len = replaceable.length();  
	        int temp = 0;   
	        String subset[] = new String[len*(len+1)/2];  
	        for(int i = 0; i < len; i++) {  
	            for(int j = i; j < len; j++) {  
	                subset[temp] = replaceable.substring(i, j+1);  
	                temp++;  
	            }  
	        }  
		String mut="";
		for(int i=0; i<subset.length; i++) {
			char []replace = subset[i].toCharArray();
			mut = word;
			for(int j=0; j<replace.length; j++ ) {
				index = getIndex(replace[j], arr1);
				mut = mut.replace(arr1[index], arr2[index]);
			}
			result = result+" "+ mut;
		}
		System.out.println("Mutants : "+result);
		return result;
	}
	public void allWordsMutants() {
		LinkedList W_L1 = new LinkedList();
		  W_L1=D.GetData();
			LinkedList K_L1 = new LinkedList();
			 K_L1=D.ReturnKey();
		
		int w=0;
		String word;
		String [] mutant;
		int id;
		while(w<W_L1.size())
		{
			word = (String) W_L1.get(w);
			id = (int) K_L1.get(w);
			mutant = Generate_Mutant(word).split( " ");
			for(int i=1; i<mutant.length; i++) {
				
			D.insertMutant(mutant[i],id);
			}
			
			w++;
			
		}
	      JOptionPane.showMessageDialog(null,"Mutants Inserted Succesfully into Database"); 

	}

}
