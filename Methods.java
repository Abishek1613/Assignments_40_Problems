package Basics;

public class Methods {
	public void calculate(int a, int b){
		System.out.println(" Addition of two numbers: " +(a+b));
	}

	public void calculate(int r) 
    {
         System.out.println("Area of Circle: "+(3.14*r*r));
    }
	
	public void calculate(int a,long l)
	{
		System.out.println("Area Of Rectangle: "+(a*l));
	}
	 public static void main(String args[])
	    {
	      Methods ob=new Methods();
	      ob.calculate(10,12L);
	      ob.calculate(5);  
	    }

}
