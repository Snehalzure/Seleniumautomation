package Basicjava;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		
		String x[][]=new String[3][5];
		System.out.println(x.length);//3--total no of rows:3
		System.out.println(x[0].length);//5-total no. of colmn=5
		
		
		//1st row
		x[0][0]="A";
		x[0][1]="B";
		
		//2nd row
		x[1][0]="A1";
		x[1][1]="B1";
		
		
		//3rd row
		
		x[2][0]="A2";
		x[2][1]="B2";
		
		/*System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);*/
		
		//print all the values of arrays: use loop
		
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
				System.out.println(x[row][col]);
			}
		}
	}

}
