package GetterSetter;

public class User {
	
	int id;
	String name;
	String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		
		User obj = new User();
		User obj1 = new User();
		User obj2 = new User();
		User obj3 = new User();
		
		obj.setId(1);
		System.out.println("User1 ID:"+obj.getId());
		
		
		obj.setName("Raj");
		System.out.println("User1 Name:"+obj.getName());
		
		obj.setPassword("Raj123");
		System.out.println("User1 Password:"+obj.getPassword());
		
		obj1.setId(2);
		System.out.println("User2 ID:"+obj1.getId());
		
		
		obj1.setName("Aftab");
		System.out.println("User2 Password:"+obj1.getName());
		
		obj1.setPassword("Aftab123");
		System.out.println("User2 Password:"+obj1.getPassword());
		
		
		
	}

}
