package prob01;

public class Printer{

	public Printer() {
	}
	
	public void println(int word) {
		System.out.println(word);
	}
	public void println(boolean word) {
		System.out.println(word);
	}
	public void println(double word) {
		System.out.println(word);
	}
	public void println(String word) {
		System.out.println(word);
	}
	public void println(int word, boolean word1, double word2, String word3) {
		System.out.println(word);
	}
	
	
	///---------------------------------------------------------
	//generic을 사용하여 할 수 있다.
	public <T, P, Q> void println(T t, P p, Q q) {
		System.out.println(t);
	}
	
	//-------------------------------------------------------------
	//가변변수 : 변수가 변하는 것.   => 표기 ...으로 한다.
	public int sum (int a, int b, int c) {
		return 0;
	}
	
	//=>가변변수를 사용 
	public int sum (int... nums) { 
		int sum = 0;
		for(int i : nums) {
			sum+= i;
		}
		
		return sum;
	}
	//-------------------------------------------------------------
	//generic 메소드와 가변변수를 합친것.
	public <T> void println(T... ts) {
		for (T t : ts) {
			System.out.println(t);
		}
	}
	
	
	
}
