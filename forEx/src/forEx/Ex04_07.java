package forEx;

import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
		// 입력을 받기 위해 스캐너 객체를 생성
		int money = 0;
		Scanner scanner = new Scanner(System.in);

		Outter : while (true) {
			System.out.println("--------------------------");
			System.out.println("1. 예금 | 2. 출금| 3. 잔고 | 4. 종료");
			System.out.println("--------------------------");
			System.out.println("선택> ");
			// input : 사용자의 입력값
			int input = scanner.nextInt(); // 사용자의 입력을 문자열로 반환

			/*
			 * if(input == 1) { // 예금
			 * 
			 * } else if(input == 2) { // 출금
			 * 
			 * } else if(input == 3) { // 잔고
			 * 
			 * }
			 * 
			 */

			// (변수)
			switch (input) {
			case 1:
				// 변수의 값이 1이면 실행
				// 코드 작성
				// 예금
				System.out.println("예금액>");
				// money += scanner.nextInt();
				money += Integer.parseInt(scanner.next());
				System.out.println("현재 잔고는 : " + money + "원 입니다.");
				// break 문이 없으면 다음 case를 계속해서 실행 함
				break;

			case 2:
				// 출금
				System.out.println("출금액>");
				int num = scanner.nextInt();
				if (money < num) {
					System.out.println("금액이 부족합니다.");
				} else {
					money -= num;
				}
				break;

			case 3:
				// 잔고
				System.out.printf("잔고>%d\n", money);
				break;

			case 4:
				// 종료
				System.out.println("프로그램 종료");
				//System.exit(0);
				break Outter;
				
			default:
				break;
			}
			
			scanner.close();
			System.out.println("money : " + money);

		}

	}

}
