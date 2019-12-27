package Basicjava;

public class ExceptionHandlingConcepts {

	public static void main(String[] args) //throws InterruptedException, 
	{
		//Exception:It is an abnormal event which will terminate your program
		//To handle Exception handling
		
		//There are two types of exception:1.Checked/coughtable exception 2.Un-checked/uncoughtable exception
		
				//Un-Checked exception:
						//ArithmeticException
						//NullPointerException
						//NumberFormateException
						//ArrayIndexOutOfBoundsException
		
		
		//Handle:Try Catch syntax
				/*
				  try{
				 specify the stmt which causes exception
				  }
				 
				  catch(Exception Type)
			       {s
			       write a code
			       }  */
		
		

		//ArithmeticException
		
		int div=10;
		//System.out.println(div/0);
		try{
			
			System.out.println(div/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally{
			System.out.println("Finally");
		}
		
		try{
		Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
		//NullPointerException
		//String s=null;
		//System.out.println(s.length());
		
		//NumberFormateException
		//String str="100S";
		//int a=Integer.parseInt(str);
		//System.out.println(a+20);
		

		/*Finally
		 {
		 write code
		 }
		 
		 1)Exception occurs,catch block handles,finally block will be  still executed
		 2)Exception occurs,catch block not handles,finally block will be  still executed
		 3)Exception not occurs,catch block will ignore,finally block will be  still executed
		*/
		
		
		

	}

}
