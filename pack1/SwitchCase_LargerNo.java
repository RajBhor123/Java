package pack1;

public class SwitchCase_LargerNo {

	public static void main(String[] args) {
	
		
		int a=9,b=9;
		int result;
		
		result=a>b?0:(b==a?1:2);
		
		switch(result)
		{
		   case 0:
		   		  System.out.println("A is Larger than B");
		   		  break;
		   case 1:
	   		  	  System.out.println("A is Equal to B");
	   		      break;
		   case 2:
	   		  	  System.out.println("B is Larger than A");
	   		      break;	      
		}
	}
}
