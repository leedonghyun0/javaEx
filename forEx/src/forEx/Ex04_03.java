package forEx;

public class Ex04_03 {

	public static void main(String[] args) {
		// 두개의 주사위를 던져서 나온 수
		// 주사위는 1 ~ 6 까지의 수
		// 0.0000...1 <= Math.random() < 1
		while(true) {
		int i = (int)(Math.random() * 6) + 1;
		int j = (int)(Math.random() * 6) + 1;
		System.out.println("i=" + i);
		System.out.println("j=" + j + "\n");
		
		if((i+j) == 5) {
			System.out.println("\ni=" + i);
			System.out.println("j=" + j);
			System.out.println("합: 5");
			break;
		}
		// i,j 합이 5이면 (i,j) 출력 후 종료
		// 아니면 계속 주사위를 굴린다.
		
		}

	}

}
