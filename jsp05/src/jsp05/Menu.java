package jsp05;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.InsertContentAction;

public class Menu {
	
 
	public static void main(String[] args) {
		System.out.println("Moi ban chon menu:");
		System.out.println("1: 	create employee");
		System.out.println("2:	show the existing employee");
		System.out.println("3:	exit");	
		
		
		Scanner input = new Scanner(System.in);
       	int n = input.nextInt();
       	Employee nv1 = new Employee(1, "Nguyen A",3000, new Job (1,"HR"));
		Employee nv2 = new Employee(2, "Nguyen B",2000, new Job (2,"BA"));
		Employee nv3 = new Employee(3, "Nguyen C",2500, new Job (3,"Tester"));
		Employee[] employeeArray = new Employee[5];
		employeeArray[0] = nv1;
		employeeArray[1] = nv2;
		employeeArray[2] = nv3;
		
       	switch(n) {
       	case 2:
       		for ( int number = 0; number <= employeeArray.length; number++)
    		{
       		System.out.println("ID: "+employeeArray[n].id);
    		System.out.println("Name: "+employeeArray[n].name);
    		System.out.println("Salary: "+employeeArray[n].salary);
    		}
       		break;
       	case 1:
       		//Employee nv4 = new Employee(id, name, salary, job)
       //		System.out.print("Nhap ten nv ");
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("Nhap ten nv4 "); 
    		String nv4ten = scanner.nextLine();
    		
    		System.out.println("Nhap job nv4 ");  		
    		String nv4job = scanner.nextLine();
    		
    		System.out.println("Nhap id nv4 "); 
    		int nv4id = scanner.nextInt();
    		
    		System.out.println("Nhap salary nv4 "); 
    		int nv4salary = scanner.nextInt();
    		
    		Employee nv4 = new Employee(nv4id, nv4ten,nv4salary, new Job (1,nv4job));
    		
    		//System.out.println("Nv4: "+"ID:"+ nv4.id+" "+"Name: "+nv4.name+" "+"Salary: "+nv4.salary+" "+"Job: "+nv4.job.name);
    			//employeeArray = insert(employeeArray,nv4);
    			//System.out.println("ID: "+employeeArray[4].id);
    		//employeeArray = insertElemen(employeArray,nv4,newIndex);
    		 //employeeArray = new employeeArray[3];
    		employeeArray[3] = nv4;
    		
    		System.out.println("ID: "+employeeArray[3].id);
    		break;
       	case 0:
       		System.out.println("ID: "+employeeArray[2].id);
       		break;
       	}
	}

}

       		