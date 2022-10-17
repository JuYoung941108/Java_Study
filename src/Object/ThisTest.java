package Object;

class This {
	int x, y;

//	This() {
//		System.out.println("Default Constructor");
//	}

	// 생성자를 호출 후, 참조변수 this를 선언한다.
	// 인스턴스의 주소가 저장되어 있다.
	This(int x, int y) {this.x = x;	this.y = y;}

	// 생성자를 호출 후, 값을 초기화한다.
	This() {this(10, 20); System.out.println("int x, int y Constructor");}

	void setThis(int x, int y) {this.x = x;	this.y = y;}
	
	// 객체를 문자열로 표현하기 위해 toString 메소드를 호출한다.
	public String toString() {return "x: " + x + " y: " + y;}

}

public class ThisTest {
	public static void main(String[] args) {
		This t = new This(); 		// 기본 생성자를 호출한다.
		This t2 = new This(30, 40); // 매개변수가 있는 생성자에 값을 넣어준다.
		System.out.println(t);		// 생성자 내에 선언된 x: 10, y: 20이 출력된다.
		System.out.println(t2);		// x: 30, y: 40이 출력된다.

	}

}
