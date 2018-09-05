package gugudan;

public class Mainclass {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			int[] result = gugudan1.calculate(i);
			gugudanPrint.print(i, result);
		}
	}
}
