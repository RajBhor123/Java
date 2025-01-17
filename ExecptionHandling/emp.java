package ExecptionHandling;

public class emp {

	int id;
	String Name;
	
	// Constructor to initialize emp object
    emp(int id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    // Method to display emp details
    void displayemp() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + Name);
    }
	public static void main(String[] args) {
		
		// Create an array of emp objects
        emp[] employees = new emp[3];  // Array to hold 3 Emp objects
        
        // Initializing emp objects with id and name
        employees[0] = new emp(1, "Omkar");
        employees[1] = new emp(2, "Raj");
        employees[2] = new emp(3, "Aftab");
        
        // Display information of each employee
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayemp();
            System.out.println();  // For spacing between employees
        }
	}

}
