package java8;

public class Employee {
	String Name;
	int id;
	double salary;
		
	public Employee(String name, int id, double salary) {
		super();
		Name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
