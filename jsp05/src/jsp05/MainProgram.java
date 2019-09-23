package jsp05;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("hihi", 20, "Man");
		Student student2 = new Student("John", 22, "Man");
		Student student3 = new Student("Lili", 21, "Girl");
		
		System.out.println("Student1: "+ student1.name+ " "+student1.age+" "+student1.gender);
		System.out.println("Student2: "+ student2.name+ " "+student2.age+" "+student2.gender);
		System.out.println("Student3: "+ student3.name+ " "+student3.age+" "+student3.gender);
	}

}
