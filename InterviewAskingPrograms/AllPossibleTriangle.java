



class Triangles {
	public static void main(String [] args) {
//full triangle	
		{
				
				for(int i=0;i<=5;i++) {
					for(int j=5;j>=i;j--) 
						System.out.print(" ");
						{		
							for(int k=0;k<=i*2;k++) 
								System.out.print("k");
						}	
					System.out.println(" ");
				}
			}
//Half Right triangle
			
	{
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) 
				System.out.print(" ");
				{		
					for(int k=0;k<=i;k++) 
						System.out.print("k");
				}	
			System.out.println(" ");
		}
		
		
	}
//Half Right triangle
	{
		for(int i=0;i<=5;i++) 
		{
			for(int j=0;j<=i;j++)
		
				System.out.print("*");
		
		System.out.println(" ");
		}
	}	
//Reverse Triangle
	
	{
	for(int i=0;i<=5;i++) {
		for(int j=0;j<i;j++) 
			System.out.print(" ");
			{		
				for(int k=10;k>=i*2;k--) 
					System.out.print("k");
			}	
		System.out.println(" ");
		}
	}

	
	
//Half Reverse right triangle
	
	
   {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<i;j++) 
				System.out.print(" ");
				{		
					for(int k=5;k>=i;k--) 
						System.out.print("k");
				}	
			System.out.println(" ");
			}
		}

//Half Reverse Left Triangle
   	
   	{
   		for(int i=0;i<=5;i++) { 
   			for(int j=5;j>=i;j--)
   				System.out.print("*");
   		System.out.println("");
   		}
   		}
//Full Diamond
   	{
			
			for(int i=0;i<=5;i++) {
				for(int j=5;j>i;j--) 
					System.out.print(" ");
					{		
						for(int k=0;k<=i*2;k++) 
							System.out.print("k");
					}	
				System.out.println(" ");
			}
			
			
			for(int i=1;i<=5;i++) {
				for(int j=0;j<i;j++) 
					System.out.print(" ");
					{		
						for(int k=10;k>=i*2;k--) 
							System.out.print("k");
					}	
				System.out.println(" ");
				}
			}

 	
   		
	}

}