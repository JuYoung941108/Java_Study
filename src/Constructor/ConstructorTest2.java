package Constructor;

class Car {
	String owner, model;
	int speed, fuel;
	Car(){}
	
	Car(String owner, int speed, int fuel, String model) {
		this.owner = owner;
		this.speed = speed;
		this.fuel = fuel;
		this.model = model;
	}

	Car(String owner, int fuel, String model, int speed) {
		this.owner = owner;
		this.fuel = fuel;
		this.model = model;
		this.speed = speed;
	}

	Car(String owner, String model, int fuel, int speed) {
		this.owner = owner;
		this.fuel = fuel;
		this.model = model;
		this.speed = speed;
	}

	void Aceel() {
		if (fuel <= 0) {
			fuel = 0;
			System.out.println("[ERR] 가속 불가: 연료가 부족합니다.");
		} else {
			fuel -= 5;
			if (speed + 10 >= 100) {
				speed = 200;
				System.out.println("[WARN] 최대 속도(200km/h)입니다.");
			} else {
				speed += 10;
				System.out.println("[INFO] 가속합니다.\n현재 속도: " + speed + "km/h");
			}
		}
	}

	void Break() {
		if (speed - 5 <= 0) {
			speed = 0;
			System.out.println("[INFO] 감속 불가: 현재 속도 0km/h");
		} else {
			speed -= 5;
			System.out.println("[INFO] 감속합니다.\n현재 속도: " + speed + "km/h");
		}
	}

	public String toString() {
		return "이름: " + owner + " \n차량 모델: " + model + " \n현재 속도: " + speed + " \n연료: " + fuel + "\n";
	}
}

public class ConstructorTest2 {
	public static void main(String[] args) {
		Car c = new Car("홍길동", 0, 100, "코나");
		System.out.println(c.toString());
		Car c2 = new Car("서길동", 50, "아반떼", 0);
		System.out.println(c2.toString());
		Car c3 = new Car("김철수", "그렌저", 0, 0);
		System.out.println(c3.toString());

	}

}
