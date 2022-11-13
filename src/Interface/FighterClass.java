package Interface;

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("stop");
	}
}

interface Fightable { // Interface의 모든 Method는 'public abstract'가 붙는다.
	void move(int x, int y); // 'public abstract'은 생략 가능하다.

	void attack(Fightable f); // 'public abstract'은 생략 가능하다.
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {
		System.out.println("x: " + x + " y: " + y + "로 이동한다.");
	}

	public void attack(Fightable f) {
		System.out.println(f + "를 공격한다.");
	}

	// 싸울 수 있는 상대를 불러오는 메소드
	Fightable getFighter() {
		Fighter f = new Fighter(); // Fighter를 생성해서 반환한다.
		return f; // f 앞에 Fightable이 생략되었다.
	}

}

public class FighterClass {
	public static void main(String[] args) {
//		Fighter f = new Fighter();
//		f.move(10, 20);
//		f.attack(f);
		Unit u = new Fighter(); // Unit은 attack()이 없으므로 호출이 불가능하다.
		u.move(10, 20);
		u.stop();
//		Fightable f = new Fighter();
//		f.attack(new Fighter());
//		f.move(10, 20);
//		f.stop(); // Fightable에는 stop()이 없으므로 호출이 불가능하다.

		Fighter f = new Fighter();

		// 메소드의 반환 타입이 일치해야 한다.(Fightable fb=..)
		Fightable fb = f.getFighter();
	}
}
