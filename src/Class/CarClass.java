package Class;

class Car1 {
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "Black";

	Car1() {}
	Car1(String model, String color) {this.model = model; this.color = color;}
	void showInfo() {System.out.println("제작 회사: " + company + " 모델명: " + model + " 색상: " + color);}}

class Car2 extends Car1 {
	Car2(String model, String color) {this.model = model; this.color = color;}
	void showInfo(String model, String color) {System.out.println("제작 회사: " + company + " 모델명: " + model + " 색상: " + color);}}

public class CarClass {
	public static void main(String[] args) {
		Car1 c = new Car1();
		Car2 c2 = new Car2("싼타페", "White");

		c.showInfo();
		c2.showInfo();

	}

}
