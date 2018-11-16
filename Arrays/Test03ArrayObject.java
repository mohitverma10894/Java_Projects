package Array;

class Test03ArrayObject {
long[] Num= {};
	public static void main(String[]args){

<<<<<<< HEAD
//two ways to create array object
=======
//three ways to create array object
>>>>>>> 69941b9f5013c65fd1a8c45e9a44c8c8e04fe359
	int [] a1= new int[5];
		System.out.println(a1.length);
	int [] a3= {1,3,4,5,6};
		System.out.println(a3.length);
	int a2[] =new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(a2.length);
//you can't create an array object without specifying their value
	//int []a4=new int[];
		
	int [] a5=new int['a'];
	System.out.println(a5.length);
	
	int [] a6= new int[2];
	System.out.println(a6.length);
	
	int [] a7= { };
	System.out.println(a7.length);
			
	int [] a8=new int [] {2,4,5,7,8};
	System.out.println("length a8 "+a8.length);
	
	int [] a9=new int [3];
	System.out.println("length a9 "+ a9.length);
	System.out.println("length a8 " +a8.length);
	
	int [] a10= {(a8.length),(a9.length)};
	System.out.println("the sum of length a8,a9 is="+(a10[0]+a10[1]));

	}
}
