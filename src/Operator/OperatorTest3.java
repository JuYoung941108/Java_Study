package Operator;

public class OperatorTest3 {
	public static void main(String[] args) {
		int num1 = 456;
		System.out.println("num1(" + num1 + ")의 십의 자리 이하를 버립니다. > " + (num1 - (num1 % 100)));
		int num2 = 111;
		System.out.println("num2(" + num2 + ")의 십의 자리 이하를 버립니다. > " + (num2 - (num2 % 100)));
	}

}
