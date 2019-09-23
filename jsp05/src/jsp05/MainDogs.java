package jsp05;

public class MainDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs dog1 = new Dogs("hoho",2,"yellow");
		dog1.barking("vay duoi vl");
		dog1.eating("deo them an");
		dog1.wagging("sua hihi");
		System.out.println("Dog1:" +dog1.name+""+dog1.age+""+dog1.color);
		System.out.println("wagging action"+dog1.wagging("fdfa");
	}
}
