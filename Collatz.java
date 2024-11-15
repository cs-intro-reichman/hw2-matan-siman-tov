// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int current;
		Boolean collatz = true;
		if (n > 0){
			System.out.println("1 4 2 1 (4)");
		}
		if (mode.equals("v")){
			for (int j = 2; j <= n; j++) {
				current = j;
				int i = 1;
				while (current!=1 ) {
					System.out.print(current +" ");
					i++;
					if (current % 2 == 0){
						current = current / 2;
					}
					else {
						current = current * 3 + 1;
					}
				}
				if( current ==1 ){
					System.out.print("1");
				}
				else {
					collatz = false;
					break;
				     }	
				
				System.out.print(" (" +i+ ")");
				System.out.println();
				}
			}
		if (collatz) {
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		else {
			System.out.println("Not all of the hailstone sequences reached 1.");
		}
	}
}
		


