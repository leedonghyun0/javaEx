package bmiEx;

public class Operater {

	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue1 = 20;
		
		// byte, short, char 타입은 연산시에
		// int 타입으로 변환 되어서 연산된다
		// ==> 그 결과 int 타입이 반환 된다.
		//byte byteValue2 = byteValue + byteValue1;
		byte byteValue2 = (byte)(byteValue + byteValue1);
		int intValue2 = byteValue + byteValue1;
		
		// ============= 실수의 연산 =============
		int iValue = 10; // => 10.0 으로 변환
		double dValue = 5.5;
		double result = iValue + dValue;
		System.out.println(result);
		System.out.println((double)iValue);
		System.out.println(5/2); // => 결과 : 2
		System.out.println((double)5/2); // 5.0/2
		System.out.println(5/(double)2); // 5/2.0
		System.out.println((double)(5/2)); // 5/2 -> int 연산결과 2를 -> 2.0
		
		// ========== 문자열을 기본타입으로 강제 타입변환하는 방법
		String str = "200";
		
		// paserInt(string s) : int
		// string 타입의 매개변수를 넣고 실행결과 int 타입을 반환 받는다
		int i = Integer.parseInt(str);
		System.out.println("=======  문자열을 기본타입으로 강제 타입변환하는 방법  =======");
		System.out.println(i);
		
		str = "10";
		byte bvalue = Byte.parseByte(str);
		System.out.println(bvalue);
		
		str = "200";
		short svalue = Short.parseShort(str);
		System.out.println(svalue);
		
		str = "300000";
		int ivalue = Integer.parseInt(str);
		System.out.println(ivalue);
		
		str = "40000000000";
		long lvalue = Long.parseLong(str);
		System.out.println(lvalue);
		
		str = "12.345";
		float fvalue = Float.parseFloat(str);
		System.out.println(fvalue);
		
		str = "12.345";
		double dvalue = Double.parseDouble(str);
		System.out.println(dvalue);
		
		str = "true";
		boolean boolvalue = Boolean.parseBoolean(str);
		System.out.println(boolvalue);
		
		String strValue = String.valueOf(123);
		System.out.println(String.valueOf(123.11));
		
		String.valueOf('가');
		String.valueOf(true);
		
		long var1= 2l;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result2 = (int)var1 + (int)(var2+var3) + (int)Double.parseDouble(var4);
		System.out.println(result2);
		
	}

}
