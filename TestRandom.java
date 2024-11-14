// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int n = Integer.parseInt(args[0]);
		double great = 0;
		double less = 0;
		while (n > 0) {
			double random = Math.random();
			if (random < 0.5) {
				great++;
			}
			else {
				less++;
			}
			n--;
		}
		System.out.println("> 0.5: " + (int)great + " times");
		System.out.println("<= 0.5: " + (int)less + " times");
		if (great == 0 || less ==0) {
			System.out.println("Cannot calculate the ratio because no values were generated in one of the options.");
		}
		else {
			double ratio = Math.min(great,less) / Math.max(great,less);
        	System.out.println("ratio: " + ratio);
			}
	}
}
