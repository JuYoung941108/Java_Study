package API;

class Info {
	String name; int age; String local;	String likeFood;
	Info(String name, int age, String local, String likeFood) {this.name = name; this.age = age; this.local = local; this.likeFood = likeFood;}
	public String toString() {return "이름: "+name+"\n나이: "+age+"\n지역: "+local+"\n좋아하는 음식: "+likeFood;}}

public class getClassTest {
	public static void main(String[] args) {
		Info i = new Info("주영", 29, "대구", "크림 봉골레");
		Info l = new Info("라이언", 6, "둥둥섬", "?");
		System.out.println(i.toString());
		System.out.println(i.getClass());
		System.out.println(i.hashCode());
		System.out.println();
		System.out.println(l.toString());
		System.out.println(l.getClass());
		System.out.println(l.hashCode());
	}

}
