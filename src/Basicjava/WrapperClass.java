package Basicjava;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		
		//Data Conversion
		//1. String to int :
				String x = "100";
				System.out.println(x+20);//10020
				
				int a=Integer.parseInt(x);
				System.out.println(a+20);
				
				
				
		
				
	           //String h = "100A";
				//int g = Integer.parseInt(h);
			//System.out.println(g);//NumberFormatException: For input string: "100A
				
				
				//2. String to double:
				String y = "12.33";
				System.out.println(y+20);
				
				double d = Double.parseDouble(y);
				System.out.println(d+10.22);
				
				//3. int to String:
				int k = 100;
				System.out.println(k+20);//120
				
				String str=String.valueOf(k);
				System.out.println(str+20);
				//String p = String.valueOf(k); //"100
				//System.out.println(p+20);
				
		
			
				
				ArrayList<Integer> ar = new ArrayList<Integer>();//Integer is wrapper class
				
				ArrayList<Double> du = new ArrayList<Double>();
				

	}

}
