package bmiEx;

public class Casting {

	public static void main(String[] args) {
		
		int iValue = 65;
		char charValue = (char) iValue;
		System.out.println(iValue);
		System.out.println(charValue);
		
		long lValue= 500;
		iValue = (int)lValue;
		
		System.out.println(iValue);
		
		float fValue = 3.14f;
		iValue = (int) fValue;
		
		System.out.println(iValue);
		
		
		// -128 ~ 127
		// 강제 형변환시 변환 하려는 타입에 들어갈수 있는 값인지 꼭 확인 해야 한다.
		int intValue = 127;
		byte byteValue = (byte)intValue;
		System.out.println("================");
		System.out.println(intValue);
		System.out.println(byteValue);
		
	}

}
