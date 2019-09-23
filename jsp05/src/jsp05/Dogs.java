package jsp05;

public class Dogs {

	
			public String name;
			public int age;
			public String color;
			
		
	public Dogs (String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	
	}
	public void wagging(String waggingAction) {
		System.out.println("wagging detail:"+waggingAction);
		
			};
	public void barking(String barkingAction) {
		System.out.println("barking detail:"+barkingAction);
		
		
	}
	public void eating (String eatingAction) {
		System.out.println("eating detail:"+eatingAction);
	}
	
}
