package Loop;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
//		while(조건식) {
//			조건식의 연산 결과가 참(true)인 동안 반복될 문장들을 적는다.
//			결과가 true일 동안 수행될 문장
//		}

//		int i = 1;
//		while (i < 10) {
//			i++;
//			System.out.println("Hello World !");
//		}

		// 반복할 횟수를 넣는다.
//		int i = 6;
		// i가 1이 되기 전까지 while문을 수행한다.
		// 여기선 6, 5, 4, 3, 2, 1까지하면 '2'이기 때문에 '1'에서 반복문이 종료된다.
//		while (i-- != 1) {
//			System.out.println(i + " - I Can Do It !");
//		}
//		while (i != 1) {
//			i--;
//			System.out.println(i + " - I Can Do It !");
//		}

//		int sum = 0;
//		int i = 0;
		// 몇까지 더해야 sum이 100을 넘는지 알아낸다.
		// 1줄에 1씩 증가시켜서 sum에 계속 더해나간다.
//		while (sum <= 100) {
//			System.out.printf("%d - %d%n", i, sum);
//			sum += ++i;
//		}

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		System.out.println("숫자를 입력하세요. >");
		// 입력받은 내용을 tmp에 저장한다.
		String tmp = sc.nextLine();
		// 입력받은 문자열(tmp)을 숫자로 변환한다.
		num = Integer.parseInt(tmp);
		while (num != 0) {
			// num을 10으로 나눈 나머지를 sum에 더한다.
			sum += num % 10; // == sum=sum+num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			// num을 10으로 나눈 값을 다시 num에 저장한다.
			num /= 10;
		}
		System.out.println("각 자리수의 합: " + sum);
	}

}
