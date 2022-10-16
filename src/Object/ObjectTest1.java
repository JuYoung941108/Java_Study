package Object;

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {this(1, true);}
	SutdaCard(int num, boolean isKwang) {this.num = num; this.isKwang = isKwang;}
	String info() {return num + (isKwang ? "K" : "");}

}

public class ObjectTest1 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false); // 3을 출력한다.
		SutdaCard card2 = new SutdaCard();		   // 1K를 출력한다.

		System.out.println(card1.info()); // 출력 값: 3
		System.out.println(card2.info()); // 출력 값: 1K
	}

}
