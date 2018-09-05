package gugudanScan;

public class gugudanMethod {

	public static int[] calculate(int x) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = x * (i+1);
		}
		return result;
	}
	
	public static void print(int x, int[] result) {
		System.out.println(x + "´Ü");
		for(int i = 0; i < result.length; i++) {
			System.out.println(x + " X " + (i+1) + " = " + result[i]);
		}
	}
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			int[] result = calculate(i);
			print(i, result);
		}
	}
}