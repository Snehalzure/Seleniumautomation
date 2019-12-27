package Basicjava;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		
		//ArrayList
		
	ArrayList ar=new ArrayList();
				ar.add(100);//0
				ar.add(200);//1
				ar.add("Hello");//2
				ar.add('m');//3
				ar.add(12.33);//4
				ar.add(true);//5*/
			
				ar.add(300);//6
				ar.add(400);//7
			
				ar.remove(6);
				
				
				System.out.println(ar.size());//to find the size.
				
			   
				
				//System.out.println(ar.get(8));
				//ar.add()
				
		//System.out.println(ar.get(4));		
	//	System.out.println(ar.get(9));//IndexOutOfBoundsException
				
				//to print all the values of arraylist: use for loop:
				for(int i=0; i<ar.size(); i++){
					System.out.println(ar.get(i));
				}
				
				
				
				
			
				
				
				
				//Generics:
				
				ArrayList<Integer> int1=new ArrayList<Integer>();
				int1.add(222);	
			
				
				ArrayList<Integer> ar1 = new ArrayList<Integer>();
				ar1.add(100);
				ar1.add(400);
	
				System.out.println(ar1);
				System.out.println(ar1.size());
				
				
			
				
				ArrayList<String> ar2 = new ArrayList<String>();
				ar2.add("Hello");
				System.out.println(ar2.size());
				ar2.add(1, "hi");
				System.out.println(ar2);
				//ar2.r
				
				ArrayList<Double> ar3 = new ArrayList<Double>();
				ar3.add(12.00);
				System.out.println(ar3.get(0)); 

	}

}
