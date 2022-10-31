package Class;

class Person {
	String name; int age; String local; String job;

	// 기본 생성자
	Person() {}
	
	// 생성자 오버로딩
	Person(String name, int age) {this.name = name;	this.age = age;}
	Person(String name, int age, String local) {this.name = name; this.age = age; this.local = local;}
	Person(String name, int age, String local, String job) {this.name = name; this.age = age; this.local = local; this.job = job;}

	void showInfo() {System.out.println("이름: " + name + " 나이: " + age + " 지역: " + local + " 직업: " + job);}
	
	public String toString(String name, int age, String local, String job) {return "이름: " + name + " 나이: " + age + " 지역: " + local + " 직업: " + job;}}

public class Overloading {
	public static void main(String[] args) {
		Person p = new Person();
		Person p2 = new Person("김자바", 0);
		Person p3 = new Person("이자바", 19, "대구");
		Person p4 = new Person("박자바", 28, "대구", "직장인");

		p.showInfo();
		p2.showInfo();
		p3.showInfo();
		p4.showInfo();

		// toString은 메소드 내에 매개변수 값을 다 적어주지 않으면 에러가 발생한다.
		System.out.println(p.toString("홍자바", 25, "대구", "무직"));
		// 매개변수 값 누락 시에는 해당 객체의 주소 값만 출력된다.
		System.out.println(p.toString());
	}

}
