package newsrc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import BussinessLogic.makeMutant;

public class Bsuinesslogictest {
	@Test
	void testChracter() {
		String word="ت";
		String mutant="ط";
		makeMutant a =new makeMutant();
		Assertions.assertEquals(mutant,a.Generate_Mutant(word));
	}
	
	@Test
	void testindexof_arr1() {
		int index=10;
		char word='ت';
		String []arr={"ط"}; 
		int checkindex=1;
		makeMutant a =new makeMutant();
		Assertions.assertEquals(index,a.getIndex(word,arr));
	}
}
