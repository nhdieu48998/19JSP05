package jsp051;

public class Employee {

		String name;
		int id;
		double salary;
		int age;
		boolean married;
		Job job;
		
		public Employee (String name,int id,double salary,  Job job)
		{
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.job = job;
		}
	}
