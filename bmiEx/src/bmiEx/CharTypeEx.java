package bmiEx;

public class CharTypeEx {

	public static void main(String[] args) {

		// 홀 따옴표 안에 하나의 문자를 저장
		char var1 = 'A';
		char var2 = '오';
		
		char var3 = 65;
		char var4 = 0x0041;
		
		// 문자열을 저장
		String var5 = "";
		
		//정수의 리터럴이 입력되면 int로 받아들이기 때문에
		//long 타입의 경우 숫자 뒤에 l 또는 L을 입력 한다
		long var6 = 123456789123456789l;
		
		// 실수타입
		// 정수의 리터럴이 입력되면 double형으로
		// 받아들이기 때문에 float 타입의 경우 무조건 f를 붙인다.
		// 타입 변환 : 괄호 안에 타입을 넣어준다
		float var7 = 0.1234f;
		double var8 = 0.123456789;
		float var9 = 5e3f;
		
		boolean var10 = true;
		boolean var11 = false;
		// 참 거짓을 판단
		// 문자열과는 다름
		if(true) {
			System.out.println(true);
		}
		if(false) {
			// true 참일때
			System.out.println("true");
		} else {
			// false 거짓일때
			System.out.println("boolean 출력 확인");
			System.out.println(false);
		}
		
		System.out.println("=====실수 출력=====");
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
		
		System.out.println("char 타입 실습 ===========");
		System.out.println((int)var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		
		System.out.println("\"");
		System.out.println("나는\n오늘\n\'순대국\'이 \n먹고싶어");

	}

}
