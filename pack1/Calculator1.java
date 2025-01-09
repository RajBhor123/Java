package pack1;

public class Calculator1 {

	int num1;
	int num2;
	int result;
	
    void add(int num1,int num2){
		/*
		 num1= 2
		 num2= 3*/
    	result=num1+num2;
    	System.out.println("Addition of the Two numbers="+result);
    	
	}
    void sub(int num1,int num2){
		
    	result=num1-num2;
    	System.out.println("Subtraction of the Two numbers="+result);
    	
	}
    void mul(int num1,int num2){
		
    	result=num1*num2;
    	System.out.println("Multiplication of the Two numbers="+result);
    	
	}
    void div(int a,int b){
		
    	result=a/b;
    	System.out.println("Division of the Two numbers="+result);
    	
	}
	public static void main(String[] args) {
		
		Calculator1 c1= new Calculator1();
		Calculator1 c2=new Calculator1();
		Calculator1 c3=new Calculator1();
		Calculator1 c4=new Calculator1();


		//Calling the method add
		c1.add(1,2);
		

		c2.sub(3,2);
		
		c3.mul(3, 4);
		
		c4.div(2, 2);
	}

}
