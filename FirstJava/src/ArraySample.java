import java.util.Scanner;
public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[6];//memoery cannot be increased or decreased
		a=new int[3];
		int[] aa={23,54,56,54,};
		int b[]=new int[5];
		int c[];
		System.out.println(b[0]);
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextLine();
		}
		System.out.println(a[0]);
	}

}
