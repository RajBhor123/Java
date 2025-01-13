package Interface;

public class Gross_salary extends Employee{
	
	double Basic;
	double HRA;
	double DA;
	double gross_salary;
	
	
	void Calculate_Gross_Salary() 
	{
		gross_salary=Basic+HRA+DA;
	}

	double Print_Gross_Salary() {

		return gross_salary;
	}
	public static void main(String[] args) {
		
//		Gross_salary g =new Gross_salary();
//		g.Calculate_Gross_Salary(20000,8000,2000);
//		
		

	}

}
