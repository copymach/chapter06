package echo.ex04;

public class UpperThread extends Thread {

	@Override
	public void run() {
		for (char lowch='A'; lowch<='Z'; lowch++) {
			System.out.println(lowch);
			}

	}	
	
}
