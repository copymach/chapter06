package echo.ex04;

public class LowerThread extends Thread {

	
	@Override
	public void run() {

		for (char lowch='a'; lowch<='z'; lowch++) {
			System.out.println(lowch);
		}
	}


	
	

}
