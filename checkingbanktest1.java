package BankSystem;
import static org.junit.Assert.*;

import org.junit.Test;


public class checkingbanktest1 {

	private static CheckingAccount cobj1 = new CheckingAccount() ;
	
	public static void init() 
	{
		cobj1.inputdetails("Ahmad", 1111, 0312, "multan",1000 );
	}
	
	@Test
	public void passingtests() 
	{
	
		assertEquals(1,cobj1.inputdetails("Waqas", 2222, 0313, "sahiwal", 2000));
		assertEquals(500,cobj1.withdraw(1111, 500));
		assertEquals( 1,cobj1.delete(1111));
		assertEquals( 2500 , cobj1.deposit( 2222,500 ));
	
	}
	
	
}
