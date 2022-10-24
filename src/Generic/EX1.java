package Generic;

class 캐릭터 {}

class 카카오<T extends 캐릭터> {
	private T 캐릭터;
	카카오(T 캐릭터) {this.캐릭터 = 캐릭터;}
	void showInfo() {System.out.println("카카오 캐릭터: " + 캐릭터);}}

class 라이언 extends 캐릭터 {
	String 캐릭터;
	라이언(String 캐릭터) {this.캐릭터 = 캐릭터;}
	@Override
	public String toString() {return 캐릭터;}}
class 네오 extends 캐릭터 {
	String 캐릭터;
	네오(String 캐릭터) {this.캐릭터 = 캐릭터;}
	@Override
	public String toString() {return 캐릭터;}}
class 프로도 extends 캐릭터 {
	String 캐릭터;
	프로도(String 캐릭터) {this.캐릭터 = 캐릭터;}
	@Override
	public String toString() {return 캐릭터;}}
class 리락쿠마 {
	String 캐릭터;
	리락쿠마(String 캐릭터){this.캐릭터=캐릭터;}
	@Override
	public String toString() {return 캐릭터;}}

public class EX1 {
	public static void main(String[] args) {
		카카오<라이언> r = new 카카오<라이언>(new 라이언("라이언"));
		r.showInfo();
		카카오<프로도> p = new 카카오<프로도>(new 프로도("프로도"));
		p.showInfo();
		카카오<네오> n = new 카카오<네오>(new 네오("네오"));
		n.showInfo();
// 		Bound mismatch: The type 리락쿠마 is not a valid substitute for the bounded parameter <T extends 캐릭터> of the type 카카오<T>
//		카카오<리락쿠마> r2 = new 카카오<리락쿠마>(new 리락쿠마("리락쿠마"));
//		n.showInfo();
	}
}