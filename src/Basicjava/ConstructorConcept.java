package Basicjava;

public class ConstructorConcept {//default constructor but its hidden constructor

	
	/*Constructor: it is same like function but its not a functions,Constructor name must be the same as its class name
	
	A Constructor must have no explicit return type
	A Java constructor cannot be abstract, static, final, and synchronized*/
	
	//We can overload the constructors.
	public ConstructorConcept(){
		System.out.println("const with no parameter");
	}
	
	public ConstructorConcept(int a,int b){
		System.out.println("const with 2 parameters");
		int c=a+b;
		System.out.println(c);
		
	}
	//As soon as we create a object of class constructor will call, we dnt have to access the constructor with . keywords.
	public static void main(String[] args) {
		ConstructorConcept obj=new ConstructorConcept();
		
		ConstructorConcept obj1=new ConstructorConcept(10,20);
		
		
	}

}
