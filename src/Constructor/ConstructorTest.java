package Constructor;

class Person {
	String name, adress; int age;

	Person() {}
	Person(String name) {this.name = name;}
	Person(String name, int age) {this.name = name;	this.age = age;}
	Person(String name, int age, String adress) {this.name = name; this.age = age; this.adress = adress;}

	@Override
	public String toString() {return "이름: " + name + " 나이: " + age + " 주소: " + adress;}}

public class ConstructorTest {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.toString());
		Person p2 = new Person("홍길동");
		System.out.println(p2.toString());
		Person p3 = new Person("서길동", 22);
		System.out.println(p3.toString());
		Person p4 = new Person("남길동", 30, "대구");
		System.out.println(p4.toString());

	}

}
