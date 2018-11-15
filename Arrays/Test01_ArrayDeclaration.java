package Array;

class Test01_ArrayDeclaration {
	public static void main(String []args) {

	int [] ia1;
	int ia2[] ;
	int [] ia3;
			
	//[]int ia4;  //compiler array
	//int [5] ia5;

//DECLARING MULTIPLE VARIABLE ARRAY IN SINGLE LINE	
	int[] ia6,ia7;

	// ia8 variable datatype is IntArray and ia9 is only int type	
	int ia8[],ia9;

//You can't create second variable as a array type
	//int ia10,[]ia11;
	
	
//array Object	
	ia6= new int[] {2,4,5,7};
	ia7= new int[] {2,4,7};
	ia9=9;
	
	System.out.println("ia6 length="+ia6.length+"\n ia7 length= "+ia7.length+"\n ia6 variable value is= "+ia9);
	}
}
