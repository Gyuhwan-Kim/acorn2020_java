package test.study;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main method가 시작되었습니다.");
		// local variable은 선언만 하면 만들어지지 않고 만들 준비만 한다.
		int num1;
		int num2 = 0;
		int num3 = 10;
		// 값을 대입하는 시점에 variable이 만들어진다.
		num1 = 7;
		System.out.println(num1);
		
		String name1;
		String name2 = null;
		String name3 = "김구라";
		
		System.out.println("main method가 종료됩니다.");
	}
}
