package myPackage;

public class ExceptionDemo {
public void add(int a, int b ) 
{
	try
	{
	
	System.out.println(a/b);
	}catch(ArithmeticException ae){
		System.out.println(ae.getMessage());
		ae.printStackTrace();
	}
	System.out.println("Addition completed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo edemo=new ExceptionDemo();
		edemo.add(25, 0);
		System.out.println("Exception class main method");

	}

}
