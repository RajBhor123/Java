package pack1;

public class Student {

	int id;
	String name;
	long phone;
	String email;
	
	void show() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.id=1;
		s1.name="Raj";
		s1.phone=6522335;
		s1.email="raj@gmail,com";
		s1.show();// calling the method show  s1 object
		
		System.out.println(" id :"+s1.id+"\n Name:"+s1.name+"\n PhoneNo :"+s1.phone+"\n Email :"+s1.email);
		
		s2.id=2;
		s2.name="Aftab";
		s2.phone=6522335;
		s2.email="aftab@gmail,com";
		s2.show();
		
		System.out.println(" id :"+s2.id+"\n Name:"+s2.name+"\n PhoneNo :"+s2.phone+"\n Email :"+s2.email);
		
		s1.id=3;
		s1.name="Omkar";
		s1.phone=6522335;
		s1.email="omkar@gmail,com";
		s1.show();
		
		System.out.println(" id :"+s3.id+"\n Name:"+s3.name+"\n PhoneNo :"+s3.phone+"\n Email :"+s3.email);
	}

}
