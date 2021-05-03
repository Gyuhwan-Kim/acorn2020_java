package test.study;

public class MainClass03 {
	public static void main(String[] args) {
		int a = 10;
		double b = 10.1;
		boolean c = true;
		
		// reference data type local variable
		String d = "김구라";
		int result = d.length();
		char ch1 = d.charAt(0);	// 김
		char ch2 = d.charAt(1); // 구
		char ch3 = d.charAt(2); // 라
		
		// 참조값에 . 찍어서 toCharArray() method를 호출하면 char array가 return된다.
		char[] ch4=d.toCharArray();
		
		
		System.out.println(result);
		System.out.println(ch1);
		
	}
}
