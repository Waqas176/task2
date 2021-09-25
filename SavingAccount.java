package BankSystem;
import java.util.*;
public class SavingAccount extends Accounts 
{
	double interest_rate =0;
	public double calculateinterest(int pin1)
	{
		double finalinterest=0;
		if(Pin.indexOf(pin1) != -1)
		{
			int index2 =Pin.indexOf(pin1);
			int balance2 = bal.get(index2);
			finalinterest =(balance2*interest_rate);
		}
		return finalinterest;
	}
	
	public double calculatezakat(int pin1)
	{
		double zakat=0;
		if(Pin.indexOf(pin1) != -1)
		{
			int index2 =Pin.indexOf(pin1);
			int balance2 = bal.get(index2);
			zakat =(balance2*2.5)/100;
		}
		return zakat;
	}
}
