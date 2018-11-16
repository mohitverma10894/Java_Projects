<<<<<<< HEAD
package Array;

public class Test04ArrayInitAccessModify {
	public static void main(String []args) {
	//array declartion 	
		int[] ia;
	//Array object creation
		ia=new int [5];
	//Display values of array before Modification
		for(int index=0;index<(ia.length);index++)
			System.out.print(" "+ia[index]);
		ia[0]=8;
		ia[1]=9;
		ia[4]=ia[0]+ia[1];
		System.out.println("\n value of array at index 4 after Modification "+ia[4]);
		
		for(int index=0;index<(ia.length);index++)
			System.out.print(" "+ia[index]);
	}

}
=======
package Array;

public class Test04ArrayInitAccessModify {
	public static void main(String []args) {
	//array declartion 	
		int[] ia;
	//Array object creation
		ia=new int [5];
	//Display values of array before Modification
		for(int index=0;index<(ia.length);index++)
			System.out.print(" "+ia[index]);
		ia[0]=8;
		ia[1]=9;
		ia[4]=ia[0]+ia[1];
		System.out.println("\n value of array at index 4 after Modification "+ia[4]);
		
		for(int index=0;index<(ia.length);index++)
			System.out.print(" "+ia[index]);
	}

}
>>>>>>> 69941b9f5013c65fd1a8c45e9a44c8c8e04fe359
