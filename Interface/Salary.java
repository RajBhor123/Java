package Interface;

public class Salary extends Gross_salary implements Taxes{
	
	@Override
	public void Calculate_Salary() 
	{
		
		double salary= Print_Gross_Salary() - p_tax - i_tax;
		
		System.out.println("Salary of the Employee "+ename+" is "+salary);
	}
	

	public static void main(String[] args) {
		
		Salary s= new Salary();
		s.ename="Raj";
		s.Basic=5000;
		s.HRA=2000;
		s.DA=500;
		s.Calculate_Gross_Salary();
		s.Calculate_Salary();
		s.Print_Gross_Salary();
		
	}

	

	

}
