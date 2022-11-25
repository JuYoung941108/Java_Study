package TEST2;

// Method_Input 클래스 내에 있는 인스턴스를 사용하기 위해 import한다.
import TEST.Method_Input;

public class Method_Output {
	public static void main(String[] args) {
		/*
		 * Method_Input의 참조변수 ip를 new 연산자를 이용해 생성한다.
		 * new 연산자: 클래스 타입의 인스턴스를 생성해주는 연산자
		 */
		Method_Input ip = new Method_Input();

		/*
		 * Input 메소드의 필드 혹은 생성자에 값이 생성되어 있다면
		 * 아래의 코드는 주석 처리를 하더라도 정상적으로 값이 출력된다.
		 * 킹치만, Input 메소드의 필드 혹은 생성자에 값이 없는 상태에서
		 * 아래의 코드를 주석 처리하면 null, 0이 출력된다.
		 */
//		ip.name = "Dev.Malang"; ip.age = 29; ip.addr = "대구";

		// 위와 같은 맥락이다.
		ip.dataInput3(ip);

		System.out.println("이름: " + ip.getName() + " 나이: " + ip.getAddr() + " 지역: " + ip.getAddr());
	}
}
