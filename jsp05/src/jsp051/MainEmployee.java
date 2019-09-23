package jsp051;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee nv1 = new Employee("A", 1, 1500, new Job(1,"HR"));
		Employee nv2 = new Employee("B", 2, 2000, new Job(2,"Dev"));
		Employee nv3 = new Employee("C", 3, 2500, new Job(3,"Tester"));
		
		System.out.println("Nv1: "+"ID:"+ nv1.id+" "+"Name"+nv1.name+" "+"Salary"+nv1.salary+" "+"Job"+nv1.job.jobname);

	}

}
