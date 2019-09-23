package jsp05;

import jsp051.ClassC;

public class ClassB {
	 public static void main(String args[]){  
		 ClassA classA = new ClassA();
		 System.out.println("a = ");
		 System.out.println("b = "+ classA.b); 
		 System.out.println("c = "+ classA.c);
		 System.out.println("d = "+ classA.d);
		
		 ClassC classC = new ClassC();
		 System.out.println(""+ classC.c1);
		 
	 }
		
		
}