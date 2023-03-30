package test;

public class Blog {

	public static void main(String[] args) {
		try {
			method1();			
		} catch (NullPointerException e) {
			System.out.println("메소드를 실행할 수 없습니다.");
		}
	}
	
	public static void method1() throws NullPointerException {
		throw new NullPointerException(); // throw new ... = ...에 해당하는 예외 강제 발생
	}
}	