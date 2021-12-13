package echo.ex03;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new DigitThread();
//		thread.run (x) -> 시간 순서대로 실행
		thread.start();
		
		for (char ch='A'; ch<'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000); // 대문자Thread 스태틱 
			
		}
	}

}
