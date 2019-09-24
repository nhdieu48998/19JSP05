package jsp05;

public class Lab4_Day3 {

	public static void main(String[] args) {
		//Job job1 = new Job(1,"HR");
		Employee nv1 = new Employee(1, "Nguyen A",3000, new Job (1,"HR"));
		Employee nv2 = new Employee(2, "Nguyen B",2000, new Job (2,"BA"));
		Employee nv3 = new Employee(3, "Nguyen C",2500, new Job (3,"Tester"));
		Employee nv4 = new Employee(4, "Nguyen D",4000, new Job (4,"Developer"));
		Employee nv5 = new Employee(5, "Nguyen E",2800, new Job (5,"CEO"));
    	
		/*System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
       	int number = input.nextInt();*/

		Employee[] employeeArray = new Employee[5];

			
		employeeArray[0] = nv1;
		employeeArray[1] = nv2;
		employeeArray[2] = nv3;
		employeeArray[3] = nv4;
		employeeArray[4] = nv5;
		for ( int number = 0; number <= employeeArray.length; number++)
		{
			//System.out.println(""+employeeArray[number]);
		System.out.println("ID: "+employeeArray[number].id);
		System.out.println("Name: "+employeeArray[number].name);
		System.out.println("Salary: "+employeeArray[number].salary);
		System.out.println("Job: "+employeeArray[number].job.name);
	}

}}
