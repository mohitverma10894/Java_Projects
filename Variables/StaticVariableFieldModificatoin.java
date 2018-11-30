
public class StaticVariableFieldModificatoin {
static int a=10;

static int m1() {
	System.out.println("This is m1()");
	a=20;
	return a;
}
static int b=20;

		public static void main(String[]args) {
		System.out.println(a);
		System.out.println(b);
		m1();
		System.out.println(a);
		System.out.println(b);
		}

} 

