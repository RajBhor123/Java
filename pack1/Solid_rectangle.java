package pack1;

public class Solid_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				System.out.print("*");
			}
			 System.out.println();
		}
		System.out.println();
		
		//-------------------------------------------------------//
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			 System.out.println();
		}
		
         System.out.println();
		
		//-------------------------------------------------------//
		
         for(int i=1;i<=5;i++)
 		{
 			for(int j=1;j<=i;j++)
 			{
 				System.out.print(j+" ");
 			}
 			System.out.println();
 		}

         System.out.println();
 		
 		//-------------------------------------------------------//
 		
          for(int i=1;i<=5;i++)
  		{
        	  for(int j=1;j<=i-5;j++)
        	  {
        		  System.out.println(" ");
        	  }
  			  for(int j=1;j<=i;j++)
  			  {
  				System.out.print("*");
  				}
  			System.out.println();
  		}
          System.out.println();
   		
   		//-------------------------------------------------------//
   		
            for(int i=1;i<=5;i++)
    		{
          	 
    			  for(int j=1;j<=5-(i-1);j++)
    			  {
    				System.out.print("*");
    				}
    			System.out.println();
    		}
            
            System.out.println();
       		
       		//-------------------------------------------------------//
       		
            for (int i = 5; i >= 1; i--) 
            {
                
                for (int j = 5; j > i; j--)
                {
                    System.out.print(" ");
                }
                
                for (int k = 1; k <= i; k++) 
                {
                    System.out.print("*");
                }
                
                System.out.println();
            }
            
            System.out.println();
       		
       		//-------------------------------------------------------//
       		
            for (int i = 1; i <5; i++) 
            {
                
                for (int k = 1; k<5-i; k++)
                {
                    System.out.print(" ");
                }
                
                for (int j= 1; j<i+1; j++) 
                {
                    System.out.print("*");
                }
                
                System.out.println();
            }
            
            System.out.println();
       		
       		//-------------------------------------------------------//
       		
            for (int i = 1; i <5; i++) 
            {
                
                for (int k = 1; k<5-i; k++)
                {
                    System.out.print(" ");
                }
                
                for (int j= 1; j<i+1; j++) 
                {
                    System.out.print("* ");
                }
                
                System.out.println();
            }
            
            System.out.println();
       		
       		//-------------------------------------------------------//
       		
            for (int i = 5; i >= 1; i--) 
            {
                
                for (int j = 5; j > i; j--)
                {
                    System.out.print(" ");
                }
                
                for (int k = 1; k <= i; k++) 
                {
                    System.out.print("* ");
                }
                
                System.out.println();
            }
            
            
  	}
	}
    

