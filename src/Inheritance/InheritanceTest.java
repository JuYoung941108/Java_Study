package Inheritance;

class TV {
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}}

class ColorTV extends TV {
	// 해상도 값을 입력할 변수를 선언한다.
	int resolution;

	// 인자 값을 받기위해 매개변수가 있는 생성자를 선언한다.
	ColorTV(int size, int resolution) {
		// 조상 클래스 TV에서 변수 size를 받아온다.
		super(size);
		// 인스턴스와 로컬 변수를 구분하기 위해 참조변수 this를 선언한다.
		this.resolution = resolution;
	}

	// 예제 출력문이 담긴 메소드를 생성한다.
	void PrintProperty() {
		System.out.printf("인치: %d 해상도: %d", getSize(), resolution);
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		// 인자 값을 넣어주면 해당 값은 ColorTV의 매개변수가 있는 생성자에 주소 값이 입력된다.
		ColorTV ct = new ColorTV(32, 1024);
		// 주소 값이 입력된 ColorTV 클래스에서 해당 메소드에 값을 넘긴다. (?)
		ct.PrintProperty();
	}
}