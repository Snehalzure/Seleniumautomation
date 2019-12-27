package Basicjava;

public class StaticAndNonStation {
	
	static int a=20;//Global variable or class level variable
	String name="Monika";

	
	//Non Static function
	public void nonstatic(){
		System.out.println("Non Static function");
	}
	
	//Static function
	
	public static void staticfunction(){
		System.out.println("static function");
		
	}
	
	

	public static void main(String[] args) {
		
		//To call non static data member we have to create object of class. we can also call the static data member but it will give us warning message.
		StaticAndNonStation obj=new StaticAndNonStation();
		obj.nonstatic();
		obj.staticfunction();
		System.out.println(obj.name);
		System.out.println(obj.a);
		
		
//To call static data member:we can call in two ways
		//1.To call directly by the class name without creating object of that class.
		StaticAndNonStation.staticfunction();
		System.out.println(StaticAndNonStation.a);
		
		//2.we call directly with function name.
		staticfunction();
		System.out.println(a);
		
		
		
		
	}

}
