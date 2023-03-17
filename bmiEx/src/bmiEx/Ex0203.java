package bmiEx;

public class Ex0203 {

	public static void main(String[] args) {
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int i = (int)var1;
		int j = (int)(var2+var3);
		int x = (int)Double.parseDouble(var4);
		int y = (int)var1 + (int)(var2+var3) + (int)Double.parseDouble(var4);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(x);
		System.out.println(i+j+x);
		System.out.println(y);
	}

}
