package gugudan;

public class gugudanPrint {
	
	public static void print(int x, int[] result) {
		System.out.println(x + "´Ü");
		for(int i = 0; i < result.length; i++) {
			System.out.println(x + " X " + (i + 1) + " = " + result[i]);
		}
	}
	
}
