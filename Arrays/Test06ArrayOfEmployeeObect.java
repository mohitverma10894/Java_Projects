package Array;

//Creation of class Employee
class Employee {
String eName;
double salary;

}

 class Test06ArrayOfEmployeeObect {
	public static void main(String []args) {
//Initialize array
		Employee[] ea=new Employee[3];
//Allocate memory to object in different location of array 		
		ea[0]=new Employee();
		ea[1]=new Employee();
		ea[2]=new Employee();
//Creating object		
		ea[0].eName="Mohit";
		ea[0].salary=10000;
		ea[1].eName="Shivaay";
		ea[1].salary=13000;
		ea[2].eName="Abhishek";
		ea[2].salary=15000;
//Before modification
		System.out.println("Before modification");
		Display(ea);
		
	for (int i=0;i<(ea.length);i++) 
	{
		if(ea[i].eName.equals("Mohit")) 
		{
			ea[i].eName=ea[i].eName="araav";

			ea[i].salary=ea[i].salary+1000 ;
			}
	}
//After modification
	
		System.out.println(" ");
	
		System.out.println("After modification");
		Display(ea);
		
	}
	static void Display(Employee[] ea) {
		for(int i=0;i<(ea.length);i++)
			System.out.println(ea[i].eName+" "+ea[i].salary);
	}
}
