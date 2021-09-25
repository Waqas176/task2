package BankSystem;
import java.util.*;

public class Bank 
{
		
	public static void main(String[] args) 
	{
		
		CheckingAccount cobj1 = new CheckingAccount();
		SavingAccount sobj1 =new SavingAccount();

		int newinput=0;
		int maininput=0;
		int in2 =0;
		
		Scanner scanobj = new Scanner(System.in);  // Creating a Scanner object once
		
	    do {
	    	System.out.println("Choose from the Options given below\n"
				     + "1. Create a new Account \n"
					 + "2. Delete an Account \n" 
					 + "3. Login to Account \n"
					 + "4. Show Account details \n"
					 + "5. Exit \n");
	    	
	    	maininput = scanobj.nextInt();  // Read main user input
	    	
	    	switch(maininput)
	    	{
	    	
	    	case 1://Create a new Account
	    		
	    		System.out.println("1. Create a Checking Account \n"
						 		 + "2. Create a Saving Account \n");
	    		
	    		newinput = scanobj.nextInt();  // Read main user input
	    		
	    		if(newinput==1)
	    		{
	    			
	    			System.out.println("Enter your PIN ");
	    			int Pin = scanobj.nextInt();
	    			scanobj.nextLine();
	    			
	    			System.out.println("Enter your name ");
	    			String namee =scanobj.nextLine();
	    			
	    			System.out.println("Enter your Phone number ");
	    			int Phonenum = scanobj.nextInt();
	    			scanobj.nextLine();
	    			
	    			System.out.println("Enter your Address ");
	    			String Adrress = scanobj.nextLine();
	  
	    			System.out.println("Enter your Starting Balance ");
	    			int bala= scanobj.nextInt();
	    			
	    			cobj1.inputdetails( namee, Pin, Phonenum, Adrress , bala );
	    			
	    		}
	    		else
	    		{
	    			System.out.println("Enter your PIN ");
	    			int Pin = scanobj.nextInt();
	    			scanobj.nextLine();
	    			
	    			System.out.println("Enter your name ");
	    			String namee =scanobj.nextLine();
	    			
	    			System.out.println("Enter your Phone number ");
	    			int Phonenum = scanobj.nextInt();
	    			scanobj.nextLine();
	    			
	    			System.out.println("Enter your Address ");
	    			String Adrress = scanobj.nextLine();
	  
	    			System.out.println("Enter your Starting Balance ");
	    			int bala= scanobj.nextInt();
	    			
	    			System.out.println("Enter the interest rate ");
	    			int irate= scanobj.nextInt();
	    			
	    			sobj1.inputdetails( namee, Pin, Phonenum, Adrress , bala );
	    			
	    			sobj1.interest_rate =irate;
	    		}
	    		break;
	    		
	    	case 2://Delete an account 
	    		
	    		System.out.println("1. Delete a Checking Account \n"
	    					 	 + "2. Delete a Saving Account \n");
	    		
	    		int new22 = scanobj.nextInt();
	    		if(new22==1)
	    		{
	    			
	    			System.out.println("Enter the Pin of the account you want to delete ");
	    			int pintodel= scanobj.nextInt();
	    			cobj1.delete(pintodel);
	    			
	    		}
	    		else
	    		{
	    			System.out.println("Enter the Pin of the account you want to delete ");
	    			int pintodel= scanobj.nextInt();
	    			sobj1.delete(pintodel);
	    		}
			
	    		break;
	    		
	    	case 3://Login to an existing Account 
	    		
	    		System.out.println("Enter the type of account you want to Login to ");
	    		System.out.println("1.Checking Account \n"
		 		                 + "2.Saving Account \n");
	    		
	    		int in1= scanobj.nextInt();
	    		if(in1==1)
	    		{
	    			//Checking Account Login
	    			System.out.println("Enter the Pin");
	    			int in9= scanobj.nextInt();
	    			
	    			
	    			 do {
	    			    	System.out.println(
	    			    			   "1. Deposit Money \n"
	    							 + "2. Withdraw Money \n"	//Additional 5000   
	    							 + "3. Transfer Money\n"
	    							 + "4. Back to Main Menu \n" );
	    			    	
	    			    	in2= scanobj.nextInt();
	    			    	switch (in2)
	    			    	{
	    			    	
	    			    	case 1: //Deposit Money 
	    			    			
	    		    			System.out.println("Enter the Deposit amount ");
	    		    			int in62= scanobj.nextInt();
	    		    			cobj1.deposit(in9 , in62 );
	    		    			cobj1.transactionfee(in9);//deducting fee
	    			    		break;
	    			    	
	    			    	case 2://Withdraw Money
	    			    		
	    		    			System.out.println("Enter the withdrawal amount ");
	    		    			int in6= scanobj.nextInt();
	    		    			
	    		    			cobj1.withdraw(in9 , in6 );
	    		    			cobj1.transactionfee(in9);//deducting fee
	    			    		
		    			    	break;
		    			    	
	    			    	case 3:	//Transfer Money
	    			    		
	    			    		
	    			    		System.out.println("Enter the Account number of other account ");
	    		    			int accountnum= scanobj.nextInt();
	    		    			
	    		    			System.out.println("Enter the amount you want to transfer  ");
	    		    			int transferamount= scanobj.nextInt();
	    			    		
	    			    		cobj1.transferamount(in9,accountnum,transferamount);
	    			    		cobj1.transactionfee(in9);//deducting fee
	    			    		
		    			    	break;
		    			 
	    			    	 }
	    			    		
	    			 	}while(in2!=4);	//Back to Main Menu
	    			 
	    		}
	    		else if(in1==2)
	    		{
	    			//Saving Account Login 
	    			
	    			System.out.println("Enter the Pin");
	    			int in9= scanobj.nextInt();
	    			
	    			 do {
	    			    	System.out.println(
	    			    			   "1. Deposit Money \n"
	    							 + "2. Withdraw Money \n"	//Additional 5000   
	    							 + "3. Transfer Money\n"
	    							 + "4. Calculate Zakat \n"
	    							 + "5. Calculate Interest \n"
	    							 + "6. Back to Main Menu \n");
	    			    	
	    			    	in2= scanobj.nextInt();
	    			    	
	    			    	switch (in2)
	    			    	{
	    			    	
	    			    	case 1: //Deposit Money
	    			    		
	    			    		
	    		    			System.out.println("Enter the Deposit amount ");
	    		    			int in62= scanobj.nextInt();
	    	
	    		    			sobj1.deposit(in9 , in62 );
	    			    		break;
	    			    	
	    			    	case 2://Withdraw Money
	  
	    		    			System.out.println("Enter the withdrawal amount ");
	    		    			int in6= scanobj.nextInt();
	    		    			
	    		    			sobj1.withdraw(in9 , in6 );
	    			    		
		    			    	break;
		    			    	
	    			    	case 3:	//Transfer Money

	    		    			System.out.println("Enter the Account number of other account ");
	    		    			int accountnum= scanobj.nextInt();
	    		    			
	    		    			System.out.println("Enter the amount you want to transfer  ");
	    		    			int transferamount= scanobj.nextInt();
	    			    		
	    			    		sobj1.transferamount(in9,accountnum,transferamount);
		    			    	break;
		    			    	
	    			    	case 4:	//Calculate Zakat
	    			    		
	    			    		double zakat=sobj1.calculatezakat(in9);
	    			    		System.out.println("Zakat Amount is " + zakat + "Rs.");
		    			    	break;
		    			    
	    			    	case 5:	//Calculate Interest
	    			    		
	    			    		double interest =sobj1.calculateinterest(in9);
	    			    		System.out.println("Interest Amount is " + interest + "Rs.");
	    			    		
		    			    	break;
	    			    	}	
	    			 }while(in2!=6); // Back to Main Menu
	    			
	    		}
	    	break;
	    	case 4://Show Account Details
	    		
	    		System.out.println("Enter the type of account you want to see the details of ");
	    		System.out.println("1.Checking Account \n"
				 		         + "2.Saving Account \n");   	
	    		
	    		int in11= scanobj.nextInt();
	    		if(in11==1)
	    		{
	    			System.out.println("Enter the Pin");
	    			int in9= scanobj.nextInt();
	    			
	    			cobj1.showdetails(in9);
	    		}
	    		else
	    		{
	    			System.out.println("Enter the Pin");
	    			int in54= scanobj.nextInt();
	    			sobj1.showdetails(in54);
	    		}
	    		
	    		break;
	    	case 5://Exit from your account 
	    		
	    		System.out.println("Thank you for using our services. \n      GoodBye! ");
	    		
	    		break;
	    		
	    	default:
	    		System.out.println("\nYou have entered wrong choice \n");
	    	}
	    	
	    }while(maininput!=5);
	    
	    
//	    for(int i = 0; i <= accnumlist.size(); i++) {   
//		    System.out.println
//		    		(accnumlist.get(i));
//		}
	   
	}
	
	
}

