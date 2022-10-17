package Object;

class JuYoung {
	int money;
	int snack;

	// 매개변수 있는 생성자를 생성한다.
	JuYoung(int Jmoney, int snack) {
		this.money = Jmoney;
		this.snack = snack;
	}

	// Store 클래스를 참조하는 참조변수가 있는 메소드를 생성한다.
	void pay(Store store, int storeMoney) {
		money -= storeMoney;
		// snackCount 메소드가 있는 Store 클래스를 참조하는 store 참조변수를 호출한다.
		// storeMoney 변수는 snackCount 메소드 내의 'storeMoney'이다.
		int count = store.snackCount(storeMoney);
		// JuYoung 클래스에 선언된 snack 변수 값을 누적시킨다.
		snack += count;
	}

	public String toString() {
		return "money: " + money + " snack: " + snack;
	}
}

class Store {
	int storeMoney;
	int snackCount;
	int snackPrice;

	Store(int storeMoney, int snackCount, int snackPrice) {
		this.storeMoney = storeMoney;
		this.snackCount = snackCount;
		this.snackPrice = snackPrice;
	}

	int snackCount(int money) {
		storeMoney += money;
		int count = money / snackPrice;
		snackCount -= count;
		return count;
	}

	public String toString() {
		return "storeMoney: " + storeMoney + " snackCount: " + snackCount + " snackPrice: " + snackPrice;
	}
}

public class ReferenceTypeParameterTest {
	public static void main(String[] args) {
		JuYoung j = new JuYoung(10000, 0);
		Store s = new Store(1000000, 10, 2000);
		j.pay(s, 5000);
		System.out.println(j.toString());
		System.out.println(s.toString());
	}

}
