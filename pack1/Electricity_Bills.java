package pack1;

public class Electricity_Bills {

	public static void main(String[] args) {
		
		// Program to find the ELECTRICITY BILL using (If-Else) -----------------------------------------------
		int units = 220;
		double billAmount = 0;
		        
		if (units <= 50) 
		{
			billAmount = units * 0.25; 
	    } 
	    else 
		{
		   if (units>50 && units<=150) 
		   {
	     		billAmount = (50 * 0.25) + ((units - 50) * 0.75); 
		   } 
		   else
		   {
		     if (units>150 && units<=250) 
		     {
		        billAmount = (50 * 0.25) + (100 * 0.75) + ((units - 150) * 1.2); 
		     } 
		     else
	   		{
		        billAmount = (50 * 0.25) + (100 * 0.75) + (100 * 1.2) + ((units - 250) * 1.5); 
		    }
		   }
		}
		        System.out.println("Your electricity bill is : Rs." + billAmount);
			
		}
	}


