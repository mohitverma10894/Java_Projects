
public class NonStaticVariableModificationField {
int a=10;
int b=20;
 
void m1() {
	System.out .println("After m1 call()");
	a=50;
}
public static void main(String []args) {
//n1 instance creation
	NonStaticVariableModificationField n1= new NonStaticVariableModificationField();
	System.out.println("a="+n1.a);
//Method calling with n1 reference variable
	n1.m1();
	System.out.println("a="+n1.a);

	System.out.println("b="+n1.b);
//n2 instance creation
	
	NonStaticVariableModificationField n2= new NonStaticVariableModificationField();

	System.out.println("a="+n2.a);

	System.out.println("b="+n2.b);
}
}
