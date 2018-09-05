package gugudan;

public class gugudan1 {

	public static int[] calculate(int x) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = x * (i + 1);
		}
		return result;
	}
}

