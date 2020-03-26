
public class Demo {
	int i;//instance varaiable:For every obj new memory will be allocated
	static int a;//static or class varaiable: Single memory will be created
	char c;
	boolean b;
	long l;
	float f;
	

	public static void main(String[] args) {
		//int c;//local varaible cannot accessed outside the block/method
		
		System.out.println("Hello Sai Welcome To Java");
		// TODO Auto-generated method stub
		Demo d = new Demo();
		System.out.println(d.i);
		System.out.println(d.c);
		System.out.println(d.b);
		System.out.println(d.f);
		
		
	}

}
