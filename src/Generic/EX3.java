package Generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Product {}
class TV extends Product {}
class Audio extends Product {}

public class EX3 {
	public static void main(String[] args) {
		// <지네릭 타입과 다형성의 조건>
		// **********************************************************************
		// 1. 참조변수와 생성자의 대입된 타입은 일치해야한다.
		ArrayList<TV> tvArrayList = new ArrayList<TV>();
		ArrayList<Product> productList = new ArrayList<Product>();
		// 참조변수와 생성자에 대입된 타입이 일치하지 않기 때문에 에러가 발생한다.
//		ArrayList<Product> productList=new ArrayList<TV>();
		// **********************************************************************
		// 2. 지네릭 클래스간의 다형성은 성립한다.(== 여전히 대입된 타입은 일치해야 한다)
		// 다형성으로 객체 생성이 가능하다.
		// OK / 다형성 / ArrayList가 List를 구현했다.
		List<TV> tvList = new ArrayList<TV>();
		// OK / 다형성 / LinkedList가 List를 구현했다.
		List<TV> tvList2 = new LinkedList<TV>();
		// **********************************************************************
		// 3. 매개변수의 다형성도 성립한다.
		// public boolean add(Product e) == Product와 그 자손 객체도 가능하다.
		productList.add(new Product());
		productList.add(new TV());
		tvArrayList.add(new TV());
		// TV 또는 TV의 자손 객체만 가능하기 때문에 Audio 요소 추가가 불가능하다.
//		tvArrayList.add(new Audio());

//		printAll(productList);
		// printAll 메소드에 대입된 참조변수의 타입과 불일치하기 때문에(== Product가 아니기 때문에) 에러가 발생한다.
		printAll(tvArrayList);

		// 타입이 일치하기 때문에 형변환이 필요없다.
		Product p = productList.get(0);
		// 반환 타입이 Product이기 때문에 타입이 불일치하다.
		// == 형변환이 필요하다.
		TV t = (TV) productList.get(0);
	}

//	private static void printAll(ArrayList<Product> list) {
	private static void printAll(ArrayList<TV> list) {
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
