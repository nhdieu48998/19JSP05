package jsp05;

public class Employee {
	public String name;
	public int id;
	public double salary;
	public int age;
	public boolean married ;
	Job job;
	public Employee(int id,String name,  double salary, Job job) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.job = job;
	}
}
