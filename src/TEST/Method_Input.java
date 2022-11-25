package TEST;

public class Method_Input {
//	static public String name; static public int age; static public String addr;
	static public String name = "Dev.Malang"; static public int age = 29; static public String addr = "대구";

	private String name2; private int age2; private String addr2;

	public Method_Input() {}
//	Input(String name, int age, String addr) {this.name = "Dev.Malang";	this.age = 29; this.addr = "대구";}
	Method_Input(String name, int age, String addr) {this.name = name; this.age = age; this.addr = addr;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getAddr() {return addr;}
	public void setAddr(String addr) {this.addr = addr;}

	public String toString() {return "이름: " + name + " 나이: " + age + " 지역: " + addr;}

	public void dataInput(Method_Input i) {
		i.name2 = "Dev.Malang2"; i.age2 = 292; i.addr2 = "대구2";
		System.out.println("이름: " + name2 + " 나이: " + age2 + " 지역: " + addr2);}
	
	public void dataInput2() {
		// 생성자의 this를 호출한다.
		dataInput(this);
	}
	
	public void dataInput3(Method_Input ip) {
		System.out.println("이름: " + name + " 나이: " + age + " 지역: " + addr);
	}
	
	public static void main(String[] args) {
		Method_Input ip = new Method_Input();
		
		/*
		 * 클래스 변수를 호출한다.
		 * 
		 * (== toString 메소드가 있다는 가정 하에) 필드나 생성자에 값이 초기화되어 있지 않다면 null, 0이 출력된다.
		 * 
		 * 반대로, toString이 없거나 주석처리되어 있는 경우에는 해당 변수의 주소값이 출력된다.
		 */
		System.out.println(new Method_Input(name, age, addr));
		
		// 생성자에 직접 값을 입력한다.
		System.out.println(new Method_Input("Dev.Malang", 29, "대구"));
		
		// ip 참조변수에 있는(public class Input) dataInput를 호출한다.
		ip.dataInput(ip);
		
		// dataInput2 메소드에서 dataInput 메소드를 호출한다.
		ip.dataInput2();
	}
}
