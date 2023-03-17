package bmiEx;

public class PrintfEx {

	public static void main(String[] args) {
		
		String name = "자바라";
		int age = 20;
		String id = "java";
		double height = 1.6;
		int money = 10000000;
		
		System.out.println(money);
		System.out.printf("%,d\n", money); // 콤마
		
		System.out.print("이름: "+ name + " 나이: " + age + " 아이디: " + id + "\n");
		
		
		
		// 형식문자열
		// 지정한 형식문자열에 맞게 값 또는 변수를 대입 할 수 있다
		/*  %s : 문자열
			%d : 정수
			%f : 실수     */
		
		/*  자릿수를 정해줄 때 
			%5d : 왼쪽 빈자리 공백
			%-5d : 오른쪽 빈자리 공백 
			%05d : 빈 자리를 0으로 채움, 숫자에 적용	
		*/
		
		
		
		System.out.printf("이름: %s 나이: %d  키: %f \n", "홍길동", 10, height);
		
		System.out.printf("이름: %5s  나이: %d  키: %f \n", "홍길동", 10, height);
		
		System.out.printf("이름: %-5s  나이: %d  키: %f \n", "홍길동", 10, height);
		
		System.out.printf("이름: %5s  나이: %05d  키: %f \n", "홍길동", 10, height);
		
		System.out.printf("이름: %5s  나이: %05d  키: %10.2f \n", "홍길동", 10, height);
		
		System.out.printf("이름: %5s  \t\t나이: %05d  키: %-10.2f \n", "홍길동", 10, height);
		
		byte value = Byte.parseByte("10");
		System.out.println(value);
		int ivalue = Integer.parseInt("1000");
		System.out.println(ivalue);
		float fvalue = Float.parseFloat("20.5");
		System.out.println(fvalue);
		double dvalue = Double.parseDouble("3.14159");
		System.out.println(dvalue);
	}

}
