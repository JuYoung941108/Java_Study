package Interface;

interface PlayingCard {
	// 상수(final)를 선언한다.
	public static final int spade = 4; // 상수 원시 선언 형태
	final int diamond = 3; // 상수 선언 시, 'public static final'은 생략 가능하다.
	static int heart = 2;
	int clover = 1;

	public abstract String getCardNumber(); // 추상 메소드 원시 선언 형태

	String getCardKind(); // 메소드 선언 또한, 'public abstract' 생략이 가능하다.
}

public class Card {
	public static void main(String[] args) {

	}

}
