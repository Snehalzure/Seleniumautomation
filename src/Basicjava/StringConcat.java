package Basicjava;

public class StringConcat {

	public static void main(String[] args) {
		
		
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "World";
		
		//System.out.println("the sum of a and b is:"+(a+b));//300,300
		
		System.out.println(b+a);//300
	System.out.println(x+y);
		System.out.println(a+b+x+y);//
		System.out.println(x+y+a+b);//
		
		System.out.println(x+y+(a+b));//
		
		
		double d1 = 12.33;
		double d2 = 10.33;
		System.out.println(x+y+d1+d2);
		System.out.println(d1+d2+x+y);
		
		int i = 10;
		System.out.println("the value of i is:" + i );
		
		long id = 12345;
		System.out.println("your transaction id is "+ id);
		
		char c1 = 'A'; //ASCII Code 97
		char c2 = 'B'; //98
		//a-z A-Z 0-9 
		
		System.out.println(c1+c2);
		


	}

}
