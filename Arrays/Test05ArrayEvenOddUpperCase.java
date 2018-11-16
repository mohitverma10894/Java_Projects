package Array;

public class Test05ArrayEvenOddUpperCase {
	public static void main(String []args) {
		int ia[]= {4,5,6,7,8,9,10,11,12,13,14};
		String is[]={"abc","bcd","def","fgh","ghi","ijk","jkl","klm"};
		
		
System.out.println("\nString array values");

	for(int index=0;index<(ia.length);index++)
		{
		System.out.print(" "+ia[index]);
		}
		System.out.println("\nOdd index values");
			
			for(int index=0;index<(ia.length);index++)
				if((index%2)==1) {
					System.out.print(" "+ia[index]);
				}
			
				System.out.println("\neven index values");
						
						for(int index=0;index<(ia.length);index++)
							if((index%2)==0) {
								System.out.print(" "+ia[index]);
							}
//for string array		
System.out.println("\nString array values");

		for(int index=0;index<(is.length);index++)
			 {
			//to print string in UpperCase
				System.out.print(" "+is[index].toUpperCase());
					}
			System.out.println("\nOdd index values");
				
				for(int index=0;index<(is.length);index++)
					if((index%2)==1) {
						System.out.print(" "+is[index]);
					}
							
					System.out.println("\neven index values");
							
							for(int index=0;index<(is.length);index++)
								if((index%2)==0) {
									System.out.print(" "+is[index]);
								}
		
						
		
	}

}
