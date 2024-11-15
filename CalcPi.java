// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		double denominator = 1;
		double sum = 1;
		for (int i = 1; i < n; i++) {
			denominator = i*2 +1;
			if (i % 2 == 1){
				denominator = denominator * -1;
			}
			sum = sum + (1 / denominator);
	}
	System.out.println("pi according to Java: " + Math.PI );
	System.out.println("pi, approximated:     " + sum * 4 );
}
}