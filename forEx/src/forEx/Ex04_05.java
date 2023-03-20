package forEx;

public class Ex04_05 {

	public static void main(String[] args) {
// 		별 찍기

//		*
//		**
//		***
//		****
		System.out.println("반복 시작 ========== ");
		for (int i = 1; i < 11; i++) {
			// *을 출력
			// j <= i
			// ========
			// 1 <= 1
			// 2 <= 1 ---> 반복문 탈출
			// ========
			// 1 <= 2
			// 2 <= 2
			// 3 <= 2 ---> 조건 불일치 탈출, 2번 찍고 끝남
			// ========

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}

		}
		System.out.println("반복 끝 ============ ");

		
	}

}
