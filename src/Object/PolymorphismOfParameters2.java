package Object;

class Product {
	int price;
	int bonusPoint;

	Product() {
	}

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class TV extends Product {
	TV() {
		// 조상의 생성자 중 매개변수 price에 해당된다.
		super(100);
	}

	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		// 조상의 생성자 중 매개변수 price에 해당된다.
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 10000;
	int bonusPoint = 0;
	// 구입할 제품을 저장하기 위한 배열을 생성한다.
	Product[] cart = new Product[10];
	// Product 배열에 사용될 카운터 변수를 생성한다.
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price; // 가진 돈에서 구입한 제품의 가격 값을 차감한다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		cart[i++] = p; // 제품을 Product[] cart에 저장한다.
		System.out.println(p + "를 구입하셨습니다."); // p.toString과 동일하다.
	}

	// 구매한 제품에 대한 정보를 요약해서 보여주는 메소드를 생성한다.
	void summary() {
		// 구입한 제품의 가격 합계를 보여줄 변수를 생성한다.
		int sum = 0;
		// 구입한 제품의 목록을 출력할 변수를 생성한다.
		String itemList = "";

		// 반복문을 사용해 구입한 제품의 총 가격과 목록을 만든다.
		for (int i = 0; i < cart.length; i++) {
			// cart 배열을 하나씩 읽다가 null을 만나면 빠져나온다.
			if (cart[i] == null) {
				break;
			}
			// cart의 인덱스 값 0부터 가격을 읽어 sum에 저장한다.
			sum += cart[i].price;
			// cart의 인덱스 값 0부터 제품명을 읽는다.(toString)
			itemList += cart[i] + ", ";
		}

		StringBuffer sb = new StringBuffer(itemList);
		sb.deleteCharAt(sb.length() - 2);

		System.out.println("구입한 제품의 총 금액: " + sum);
		System.out.println("구입한 제품: " + sb);
	}

}

public class PolymorphismOfParameters2 {
	public static void main(String[] args) {

		Buyer b = new Buyer();

		/*
		 * Product[] cart = new Product[10];
		 * 위의 배열에 입력한 클래스의 주소 값이 저장된다.
		 */
		b.buy(new TV());
		b.buy(new Computer());
		b.summary();

	}

}
