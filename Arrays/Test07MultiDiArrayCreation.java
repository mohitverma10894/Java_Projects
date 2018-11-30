package array;

public class Test07MultiDiArrayCreation {
	public static void main(String []args) {
	int [][] iaa= new int [3][2];
	iaa[2][1]=2;
	iaa[2][0]=3;
	int [][][] iaaa=new int [3][2][2];
	iaaa[0][0][1]=5;
	iaaa[0][1][0]=6;
	iaaa[0][1][1]=8;
//First way to show values of two dimensional array	
	System.out.print(iaa[0][0]);
	System.out.println(iaa[0][1]);
	System.out.print(iaa[1][0]);
	System.out.println(iaa[1][1]);
	System.out.print(iaa[2][0]);
	System.out.println(iaa[2][1]);

//Second way	
	System.out.println(java.util.Arrays.deepToString(iaa));

	System.out.println(java.util.Arrays.deepToString(iaaa));


//Third way	
	for(int i = 0; i<(iaa.length); i++)
	{
		for(int j = 0; j<(iaa[0].length); j++)
			{	
			System.out.print(iaa[i][j]);
			}
		System.out.println();
	}

	
	}
	void display(Test07MultiDiArrayCreation[][] iaa) {
		
		for(int i = 0; i<(iaa.length); i++)
		{
			for(int j = 0; j<(iaa[0].length); j++)
				{	
				System.out.print(iaa[i][j]);
				}
			System.out.println();
		}
	}

}

