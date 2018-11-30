
import java.util.*;

public class SwapTwoNumbers {
private static Scanner in;

public static void main(String []args) {

 in = new Scanner(System.in);
//without using third variable		
{
	
		System.out.println("Enter the first Number A= ");
		int a=in.nextInt();

		System.out.println("Enter the Second Number B=");
		int b=in.nextInt();
	
		a=(b+a);
		b=a-b;
		a=a-b;
	 	
		System.out.println("The value of A=" +a);
		System.out.println("The value of B=" +b);
}
//with using third variable
{
	System.out.println("Enter the first Number X= ");
	int x=in.nextInt();

	System.out.println("Enter the Second Number Y=");
	int y=in.nextInt();
		
	int temp=y+x;
	x=temp-x;
	y=temp-y;
	
	System.out.println("The vxlue of x=" +x);
	System.out.println("The vxlue of y=" +y);

	
}


}
}
