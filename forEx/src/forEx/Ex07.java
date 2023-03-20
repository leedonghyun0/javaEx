package forEx;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 0;

		while (true) {
			System.out.println(("--------------------------"));
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");

			int input = scanner.nextInt();

			switch (input) {

			case 1:
				System.out.println("예금액> ");
				money += scanner.nextInt();
				break;
			case 2:
				System.out.println("출금액> ");
				int num = scanner.nextInt();
				if (money < num) {
					System.out.println("잔액 부족");
				} else {
					money -= num;
				}
				break;
			case 3:
				System.out.println("잔고> " + money);
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			}
		}

	}

}
