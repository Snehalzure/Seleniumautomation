package Basicjava;

public class FunctionInJava {
	
	//function can not be created inside a function
	//functions are independent to each other or parallel to each other
	public void sum(){
		//1. no ip and no op
	   //void --> does not return any value
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Addition of a & b :" +c);
		
     	}
	//2. no ip but some op
	//int:it returns some values
	public int sub(){
		int a=20;
		int b=30;
		int c=a-b;
		//System.out.println(c);
		return c;
		
	}
	
	//3.Some i/p and some o/p
	
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
		
	}
	
	//method/function overloading: within the same class, if there are number of methods 
	//having the same method name but different parameters.public void sum(){ //
	
	public void sum1() {//0 para
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	
	public void sum1(int i,int j) {//2para
		int k=i+j;
		System.out.println(k);
	}
	
	public void sum1(String str,String str1) {//2para
		String str3=str+str1;
		System.out.println(str3);
	}
	
	///To call methods: We need to create a object of class
	public static void main(String args[]) {
		FunctionInJava obj=new FunctionInJava();
		
		int d=obj.mul(12, 23);
		System.out.println(d);
		
		
		int d1=obj.sub();
		System.out.println("Substraction: "+d1);
		
		obj.sum();
		
		obj.sum1();
		obj.sum1(12, 45);
		obj.sum1("vhjj", "gjkj");
	}
	
}
