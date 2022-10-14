package Constructor;

class Print{
	int i; boolean b; double d;	String s;
	
	void println(int i) {System.out.println("인자 값: "+i);}
	void println(boolean b) {System.out.println("인자 값: "+b);}
	void println(double d) {System.out.println("인자 값: "+d);}
	void println(String s) {System.out.println("인자 값: "+s);}
}

public class Printer {
	public static void main(String[] args) {
		Print p=new Print();
		p.println(10);
		p.println(true);
		p.println(5.7);
		p.println("홍길동");
	}

}
