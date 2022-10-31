package Class;
public class Parameter {
	int x;
	public static void main(String[] args) {
		Parameter d=new Parameter();
		d.x=10;
		System.out.println("main(): x= "+d.x);
		
		
	}

	static void change(int x) {
		x=1000;
		System.out.println("change(): x= "+x);
	}
	
}
