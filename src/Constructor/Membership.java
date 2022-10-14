package Constructor;

class Member {
	String name; String id; String password; int age;

	boolean login(String id, String pwassword) {
		if ("hong".equals(id) && "12345".equals(pwassword))	return true;
		else return false;}

	void logout(String id) {System.out.println("로그아웃 되었습니다.");}}

public class Membership {
	public static void main(String[] args) {
		Member m = new Member();
		boolean user = m.login("hong", "12345");
		
		if (user) {System.out.println("로그인 되었습니다.");}
		else {System.out.println("ID 또는 Password가 올바르지 않습니다.\n다시 확인해주세요.");}
		
//		m.logout("hong");

	}
}
