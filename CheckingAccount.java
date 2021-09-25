package BankSystem;
import java.util.*;

public class CheckingAccount extends Accounts  {

	//Accounts object =new Accounts ();
	
		int fee =10;
		int counter =2 ;
		
		public void transactionfee(int pin1)
		{
			counter--;
			if(counter<0)
			{
				if(Pin.indexOf(pin1) != -1)
				{
					int index2 =Pin.indexOf(pin1);
					int balance2 = bal.get(index2);
					balance2 -= fee;
					bal.set(index2, balance2);
				}
				
				System.out.println("Transaction Fee Deducted (10 Rs.)\n");
			}
			
		}
}
