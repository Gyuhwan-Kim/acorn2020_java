package test.study;

public class MainClass01 {
	// run 했을 때 실행순서가 시작되는 main method
	public static void main(String[] args) {
		System.out.println("main method가 시작되었습니다.");
		
		int num1 = 10;
		num1 = 20;
		
		byte num2 = 10;
		num2 = 20;
		
		// int type variable에 byte type variable 안에 있는 값을 대입.
		num1 = num2;
		// byte type variable에 int type variable 대입?
		byte num3 = num1;
		
	}
}
