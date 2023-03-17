package bmiEx;

import java.util.Scanner;

public class BmiJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해주세요 : ");
		// 변수이름 : 사용가능한 메서도 목록을 제시
		
		String height = scan.next();
		System.out.printf("당신의 키는 %s 입니다. \n\n", height);
		
		// 몸무게를 입력해주세요 :
		System.out.println("몸무게를 입력해주세요 : ");
		
		// 몸무게를 입력 받고 출력
		String weight = scan.next();
		System.out.printf("당신의 몸무게는 %s 입니다. \n", weight);
		
		Double dHeight = Double.parseDouble(height);
		Double dWeight = Double.parseDouble(weight);
		
		// BMI 계산
		System.out.printf("BMI = %.2f ", dWeight/(dHeight*dHeight));
		
		// scanner가 사용하고 있던 리소스를 반납
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
