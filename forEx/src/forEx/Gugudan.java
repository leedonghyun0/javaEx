package forEx;

public class Gugudan {

	public static void main(String[] args) {
		// 중첩(이중) for(반복)문 구구단 출력하기
		// for(초기식; 조건식; 증감식){}
		// i를 1~9까지 출력

		// 단 : 2 ~ 9
		
		Outter : // 라벨(Label)
		for (int dan = 2; dan < 10; dan++) {
			System.out.println(dan + "단");

			// for 시작
			// i : 1 ~ 9
			for (int i = 9; i > 0; i--) {
				// 6단이면 구구단을 출력하지 않는다, for문 안에 작성하면 6단만 출력 x
				if (dan == 6) {
//					break;
					// label의 위치까지 반복문을 탈출합니다.
					break Outter;
				}
				// System.out.println("i = " + i);
				// System.out.println(dan + "*" + i + "=" + (dan*i));
				System.out.printf("%d*%d=%d\n", dan, i, (dan * i));
				
			}
			// for문 종료

			System.out.println(); // 한 줄 띄기
			// 6단을 출력한 후 반복문을 탈출합니다, for문 바깥에 작성하면 6단 이후의 코드가 실행 x
			/*
			if (dan == 6) {
				break;			
			}
			*/
			
		} // for문 종료
		
		// 1 ~ 10 까지의 수 중에서 짝수의 합을 구해봅시다.
		for(int i = 1; i < 11; i++) {
			System.out.println("===== 짝수의 합 구하기 =====");
			System.out.println("i = " + i);
		}

	}

}
