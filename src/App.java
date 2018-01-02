class Frog {
	private String name; //instance variable
	private int age;
	//private enforces encapsulation by requiring access exclusively to Frog class

	public void setName(String name){
		//name = newName;  <--local variable that was used above earlier in setName parameter
		this.name = name; //this.name refers to name instance variable and setting it = to local name variable
	}
	
	public void setAge(int age){
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
}
//above is encapsulation

public class App {

	public static void main(String[] args) {

	Frog frog1 = new Frog();	
	
	//frog1.name = "Bertie";
	//frog1.age = 1;
	frog1.setName("Bertie");
	frog1.setAge(1);
	
	System.out.println(frog1.getName() + ", " + frog1.getAge());
		
	}

}
