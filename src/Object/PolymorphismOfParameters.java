//package Object;
//
//class Product {
//	int price;
//	int bonusPoint;
//
//	Product(int price) {
//		this.price = price;
//		bonusPoint = (int) (price / 10.0);
//	}
//}
//
//class TV extends Product {
//	TV() {
//		// 조상의 생성자 중 매개변수 price에 해당된다.
//		super(100);
//	}
//
//	public String toString() {
//		return "TV";
//	}
//}
//
//class Computer extends Product {
//	Computer() {
//		// 조상의 생성자 중 매개변수 price에 해당된다.
//		super(200);
//	}
//
//	public String toString() {
//		return "Computer";
//	}
//}
//
//class Buyer {
//	int money = 10000;
//	int bonusPoint = 0;
//
//	/*
//	 * b.buy(new TV()); 메인 메소드에서 TV를 호출하면 TV 인스턴스가 호출되고,
//	 * Computer를 호출하면 Computer 인스턴스가 호출된다.
//	 */
//
//	void buy(Product p) {
//		if (money < p.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//		money -= p.price; // 가진 돈에서 구입한 제품의 가격 값을 차감한다.
//		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
//		System.out.println(p + "를 구입하셨습니다."); // p.toString과 동일하다.
//	}
//}
//
//public class PolymorphismOfParameters {
//	public static void main(String[] args) {
//
//		Buyer b = new Buyer();
//		
//		/*
//		 * 밑의 코드와 동일하다.
//		 */
//		Product p=new TV();
//		b.buy(p);
//
//		b.buy(new TV()); // buy(Product p)를 호출한다.
//		b.buy(new Computer());
//
//		System.out.println("현재 남은 잔액: " + b.money);
//		System.out.println("현재 보너스 점수: " + b.bonusPoint);
//	}
//
//}
