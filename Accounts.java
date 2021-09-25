package BankSystem;
import java.util.*;
import java.text.SimpleDateFormat;

//Parent Class

public class Accounts {
	

	ArrayList <String> name = new ArrayList <String>();
	ArrayList <Integer> Pin = new ArrayList <Integer>();
	ArrayList <String> Address = new ArrayList <String>();
	ArrayList <Integer> Pnum = new ArrayList <Integer>();
	ArrayList <Integer> bal = new ArrayList <Integer>();
	ArrayList <Integer> accnumlist = new ArrayList <Integer>(); 
	ArrayList <String> date = new ArrayList <String>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	static int accountcounter=1;
	private int acc_num;		//Account number
	protected double balance;	//Balance ---

	//default constructor
	public Accounts()
	{
		
	}
	
	//parameterized constructor
	public Accounts(int accountnumber)
	{
		
	this.acc_num=accountnumber;
	balance=0;
	
	}

	//setter and getter methods
	
	public double getbalance ()
	{
		return this.balance;
	}
	
	public int getaccountnumber()
	{
        return this.acc_num;
    }
	
	public int  deposit (int pin, int amount)
	{
		if(Pin.indexOf(pin) != -1)
		{
			int index =Pin.indexOf(pin);
			int balance1 = bal.get(index);
			balance1 += amount;
			bal.set(index, balance1);
			return balance1;
		}
		return 1;
	}
	
	//int balance1 =0;
	
	public int withdraw(int pin , int amount )
	{
		if(Pin.indexOf(pin) != -1)
		{
			int index =Pin.indexOf(pin);
			 int balance1 = bal.get(index);
			if(balance1<amount)
			{
				System.out.println("You donot have sufficient balance in your account " );
			}
			balance1 -= amount;
			bal.set(index, balance1);
			
		}
		return 1;
	}
	
	public void showdetails(int P)
	{
		
		if(Pin.indexOf(P) != -1);
			
		{
			int index =Pin.indexOf(P);
			System.out.println("Name : " + name.get(index));
			System.out.println("Address : " + Address.get(index));
			System.out.println("Phone Number : " + Pnum.get(index));
			System.out.println("Balance : " + bal.get(index));
			System.out.println("Transaction Time and Date : " + date.get(index));
			System.out.println("\n \n");
			System.out.println("accnum: " + accnumlist.get(index));
			
		}
		
		}
	
	public int transferamount (int pinof1, int accnum, int amount)
	{
		int balance2=0;
		if(Pin.indexOf(pinof1)!=-1)
		{
			if(accnumlist.indexOf(accnum) !=-1)
			{
				int acc1index = Pin.indexOf(pinof1);
				int acc2index = accnumlist.indexOf(accnum);
				int balance1 =bal.get(acc1index);
				if(amount>balance1)
					{
					System.out.println("Not Enough Balance in your Account ");
					throw new IllegalArgumentException("");
			
					}
				else {
					balance1=balance1-amount;
					bal.set(acc1index, balance1);
					balance2=bal.get(acc2index);
					balance2+=amount;
					bal.set(acc2index,balance2);
					return balance2;
					}
			}
			else {
				System.out.println("The Account you want to transfer to does not exist");
				throw new IllegalArgumentException("");
			}
		}
		else
		{
			throw new IllegalArgumentException("");
		}	
	}
	
	public int inputdetails(String n, int P, int Pn, String Add , int bala  )
	{
		
		
			name.add(n);
			Pin.add(P);
			Address.add(Add);
			Pnum.add(Pn);
			accnumlist.add(accountcounter);
			Date d1=new Date();
			date.add(formatter.format(d1));
			bal.add(bala);
			//int index1= accnumlist.indexOf(P);
			//int accountcounter2 =accnumlist.get(index1);
			
			//System.out.println("\n Your Account number is " + accountcounter2  + "\n");
		//	accountcounter++;
			
			return 1 ;
		
		
		
		
	}
	
	
	public int delete (int P)
	{
		if(Pin.indexOf(P) != -1)
		{
			int index1 =Pin.indexOf(P);
			name.remove(index1);
			Pin.remove(index1);
			Address.remove(index1);
			accnumlist.remove(index1);
			Pnum.remove(index1);
			date.remove(index1);
			bal.remove(index1);
		}
		return 1;
	}
	
	
}

